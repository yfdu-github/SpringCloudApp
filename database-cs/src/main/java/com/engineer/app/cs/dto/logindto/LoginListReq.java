package com.engineer.app.cs.dto.logindto;

import com.sun.org.glassfish.gmbal.Description;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotEmpty;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月26日 -- 19:33
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Getter
@Setter
@ToString
public class LoginListReq {
    private static final long serialVersionUID = 1L;

    @Description("查询笔数")
    @NotEmpty
    @Range(min = 1, max = 10)
    private Integer pageSize;

    @Description("起始条数")
    @NotEmpty
    private Integer begin;

    @Description("排序数组")
    private String[] orderBy;

    @Description("查询流水号")
    @NotEmpty
    @Length(max = 20)
    private String serialNo;
}
