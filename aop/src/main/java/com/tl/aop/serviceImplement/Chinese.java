package com.tl.aop.serviceImplement;

import com.tl.aop.service.IHuman;
import org.springframework.stereotype.Component;

@Component("chinese")
public class Chinese implements IHuman {
    @Override
    public void doMeal(String name ,String meal) {
        System.out.println(String.format("中国人 名称：[%s] 食物：[%s]", name, meal ));
    }

    @Override
    public void doShower(String tools) {
        System.out.println(String.format("中国人爱搓澡使用[%s]", tools));
    }
}
