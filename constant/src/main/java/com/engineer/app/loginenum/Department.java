package com.engineer.app.loginenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author 杜宇飞
 * @Description: 部门枚举类
 * @date 2021年08月28日 -- 9:34
 * @cpoyright: 湖北软帝科技有限公司
 ***/
public enum Department {

    _1(1,"设计部"),
    _2(2,"研发部"),
    _3(3,"测试部"),
    _4(4,"人事部"),
    _5(5,"培训部"),
    _6(6,"策划部"),
    _7(7,"运营部"),
    _8(8,"编辑部"),
    _9(9,"市场部"),
    _10(10,"质量管理部"),
    _11(11,"信息管理部"),
    ;

    @EnumValue
    private Integer key;

    @JsonValue
    private String value;

    Department(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
