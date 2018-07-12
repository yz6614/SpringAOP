package com.tl.aop.aopService;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Yunlong
 */
//@Aspect
@Component("aopServiceWithAnnotationCN")
public class AopServiceWithAnnotationCN {
    // 函数中使用 ***（..） 表示形参 execution是表达式， Before是前面
    @Before("execution(* com.tl.aop.serviceImplement.Chinese.doMeal(..)) && args(name,meal)")
    public void chifanqian(String name, String meal){
        System.out.println(String.format("[%s]饭前洗手然后吃[%s]", name, meal));
    }
    @After(" execution(* com.tl.aop.serviceImplement.Chinese.doMeal(..)))")
    public void chifanhou(){
        System.out.println("饭后漱口");
    }
    @Before(" execution(* com.tl.aop.serviceImplement.Chinese.doShower(..))")
    public void shuijiaoqian(){
        System.out.println("保持卫生");
    }
}
