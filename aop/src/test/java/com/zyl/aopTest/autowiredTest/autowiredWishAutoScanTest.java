package com.zyl.aopTest.autowiredTest;

import com.tl.aop.service.IHuman;
import com.tl.aop.serviceImplement.American;
import com.tl.aop.serviceImplement.Chinese;
import com.zyl.aopTest.BaseTestTemplate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 */
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) //加载配置文件
public class autowiredWishAutoScanTest extends BaseTestTemplate{
    @Autowired
    private Chinese c;
    @Autowired
    private American a;
    @Test
    public void test(){
        System.out.println("************* 使用自动扫描，注入和AspectJ实现AOP**************");
        System.out.println("**********中国人*************");
        c.doMeal("张三", "油泼面");
        c.doShower("搓澡巾");
        System.out.println("***********老外**************");
        //要用接口接收
        a.doMeal("Tom", "hotdog");
        a.doShower("towel");
    }
}
