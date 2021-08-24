package com.enginer.app.pojo.UserAddEntity;

import com.sun.org.glassfish.gmbal.Description;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年08月22日 -- 14:26
 * @cpoyright: 湖北软帝科技有限公司
 ***/
@Getter
@Setter
@ToString
public class UserAddDtoReq {
    private static final long serialVersionUID = 1L;

    @Description("查询流水号")
    @NotEmpty
    @Length(max = 40)
    private String serialNumber;
}
