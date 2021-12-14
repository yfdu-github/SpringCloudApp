/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 20:20
 * @cpoyright: 湖北软帝科技有限公司
 ***/
package com.engineer.app.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.sun.org.glassfish.gmbal.Description;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode(callSuper = false)
@Description("个人登录信息表")
@TableName(value = "LOGIN_TABLE")
public class LoginEntity implements Serializable {

    @Description("查询流水号")
    @TableId("SERIALNO")
    private String serialNo;

    @Description("用户名")
    @TableField("CUSTOMERID")
    private String customerId;

    @Description("网址登录密码")
    @TableField("NETPASSWORD")
    private String netPassWord;

    @Description("座位号")
    @TableField("SEATNO")
    private String seatNo;

    @Description("开机密码")
    @TableField("STARTPASSWORD")
    private String startPassWord;

    @Description("电脑IP地址")
    @TableField("INTERNETADDRESS")
    private String internetAddress;

    @Description("登记人")
    @TableField("INPUTUSERID")
    private String inputUserId;

    @Description("登记时间")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @TableField("INPUTTIME")
    private LocalDateTime inputTime;

    @Description("更新人")
    @TableField("UPDATEUSERID")
    private String updateUserId;

    @Description("更新时间")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @TableField("UPDATEYIME")
    private LocalDateTime updateTime;


    public String getStringUpdateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = dateTimeFormatter.format(time);
        if(this.updateTime == null) {
            return null;
        } else {
            return localTime;
        }
    }

    public LocalDateTime setStringUpdateTime(String updateTime) {
        if(updateTime != null) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(updateTime, dateTimeFormatter);
            return localDateTime;
        } else {
            throw new NullPointerException("更新时间不允许为空!");
        }
    }

    public LoginEntity() {
        super();
    }
}
