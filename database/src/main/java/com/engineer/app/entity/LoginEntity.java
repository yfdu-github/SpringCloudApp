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
import com.sun.org.glassfish.gmbal.Description;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Description("个人登录信息表")
@TableName(value = "LOGINTABLE")
public class LoginEntity {

    @Description("查询流水号")
    @TableId("SERIALNO")
    private String serialNo;

    @Description("用户名")
    @TableField("USERID")
    private String UserId;

    @Description("登录密码")
    @TableField("PASSWORD")
    private String passWord;
}
