package com.engineer.app.cs.dto.logindto;

import com.sun.org.glassfish.gmbal.Description;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * @author 杜宇飞
 * @Description: 登录信息响应实体类
 * @date 2021年11月26日 -- 19:33
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Getter
@Setter
@ToString
public class LoginRsp {
    private static final long serialVersionUID = 1L;

    @Description("查询流水号")
    @NotEmpty
    @Length(max = 20)
    private String serialNo;

    @Description("用户名")
    @Length(max = 20)
    private String customerId;

    @Description("网址登录密码")
    @Length(max = 20)
    private String netPassWord;

    @Description("座位号")
    @Length(max = 10)
    private String seatNo;

    @Description("开机密码")
    @Length(max = 20)
    private String startPassWord;

    @Description("电脑IP地址")
    @Length(max = 20)
    private String internetAddress;

    @Description("登记人")
    @Length(max = 20)
    private String inputUserId;

    @Description("登记时间")
    @Length(max = 20)
    private LocalDateTime inputTime;

    @Description("更新人")
    @Length(max = 20)
    private String updateUserId;

    @Description("更新时间")
    @Length(max = 20)
    private LocalDateTime updateTime;

    public LoginRsp() {
        super();
    }
}
