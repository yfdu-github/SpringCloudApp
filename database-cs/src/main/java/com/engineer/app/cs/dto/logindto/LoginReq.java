package com.engineer.app.cs.dto.logindto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import com.sun.org.glassfish.gmbal.Description;
import javax.validation.constraints.NotEmpty;

/**
 * @author 杜宇飞
 * @Description: 登录信息请求实体类
 * @date 2021年11月26日 -- 19:32
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Getter
@Setter
@ToString
public class LoginReq {
    private static final long serialVersionUID = 1L;

    @Description("查询流水号")
    @NotEmpty
    @Length(max = 20)
    private String serialNo;

    @Description("用户名")
    @Length(max = 20)
    private String customerId;

    public LoginReq() {
        super();
    }
}
