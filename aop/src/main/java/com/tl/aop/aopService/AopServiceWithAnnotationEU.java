package com.tl.aop.aopService;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
@Component("aopServiceWithAnnotationEU")
public class AopServiceWithAnnotationEU {
    @Before(" execution(* com.tl.aop.serviceImplement.American.doMeal(..)) && args(name, meal)")
    public void chifanqian(String name, String meal) {
        System.out.println(String.format("[%s] Washing hand before eat meal [%s]" , name, meal));
    }
    @After(" execution(* com.tl.aop.serviceImplement.American.doMeal(..))")
    public void chifanhou() {
        System.out.println("Washing hand after meal");
    }
    @Before(" execution(* com.tl.aop.serviceImplement.American.doShower(..))")
    public void shuijiaoqian() {
        System.out.println("Keep personal health");
    }
}
