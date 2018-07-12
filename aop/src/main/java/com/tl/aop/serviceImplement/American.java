package com.tl.aop.serviceImplement;

import com.tl.aop.service.IHuman;
import org.springframework.stereotype.Component;

@Component("american")
public class American implements IHuman {
    @Override
    public void doMeal(String name ,String meal) {
        System.out.println(String.format("American like eat Hotdog name：[%s] food：[%s]", name, meal ));
    }

    @Override
    public void doShower(String tools) {
        System.out.println(String.format("-American no like shower with [%s]", tools));
    }
}
