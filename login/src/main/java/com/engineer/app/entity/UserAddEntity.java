package com.enginer.app.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sun.org.glassfish.gmbal.Description;
import lombok.*;

/**
 * @author 杜宇飞
 * @Description: 新增账户
 * @date 2021年08月22日 -- 13:43
 * @cpoyright: 湖北软帝科技有限公司
 ***/
@Data
@EqualsAndHashCode(callSuper = false)
@Description("个人登录信息表")
@TableName(value = "LOGINTABLE")
public class UserAddEntity {

    @Description("查询流水号")
    @TableId("SERIALNUMBER")
    private String serialNumber;

    @Description("用户名")
    @TableField("USERID")
    private String UserId;

    @Description("登录密码")
    @TableField("PASSWORD")
    private String passWord;
}
