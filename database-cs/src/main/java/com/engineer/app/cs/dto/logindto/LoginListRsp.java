package com.engineer.app.cs.dto.logindto;

import com.sun.org.glassfish.gmbal.Description;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 19:34
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Getter
@Setter
@ToString
public class LoginListRsp {
    private static final long serialVersionUID = 1L;

    @Description("总笔数")
    private Integer totalCount = 0;

    @Description("登录信息列表")
    @Valid
    @NotEmpty
    private List<LoginRsp> loginRspList;
}
