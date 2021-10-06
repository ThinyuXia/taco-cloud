package com.xiaxinyu.demo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

// 构建领域类
// 应用的领域指的是它所要解决的主题范围：也就是会影响到对应用理解的理念和概念。
// 在Taco Cloud应用中，领域对象包括taco设计、组成这些设计的配料、顾客以及顾客所下的订单。

@Data //告知Lombok生成所有缺失的方法
@RequiredArgsConstructor
public class Ingredient {
    private final String name;
    private final String id;
    private final Type type;
    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

