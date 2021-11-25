package com.engineer.app.loginenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author 杜宇飞
 * @Description: 职位枚举类
 * @date 2021年08月28日 -- 10:20
 * @cpoyright: 湖北软帝科技有限公司
 ***/
public enum Position {
    _1(1,"Java开发工程师"),
    _2(2,"BS前端开发工程师"),
    _3(3,"CS前端开发工程师"),
    _4(4,"小程序开发工程师"),
    _5(5,"UI设计师"),
    _6(6,"测试工程师"),
    _7(7,"运营工程师"),
    _8(8,"人事专员"),
    _9(9,"技术经理"),
    _10(10,"产品经理"),
    _11(11,"项目经理"),
    ;

    @EnumValue
    private Integer key;

    @JsonValue
    private String value;

    Position(Integer key, String value) {
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
