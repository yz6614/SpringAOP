package com.zyl.aopTest.scanTest;

import com.tl.aop.service.IHuman;
import com.tl.aop.serviceImplement.American;
import com.tl.aop.serviceImplement.Chinese;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建类的时候用的还是spring显示注入， AOP使用的是注解编制的方式
 */

public class ScanWithXMLTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContextScanWithXML.xml");
        System.out.println("************* 使用XNL和自动扫描实现AOP**************");
        //要用接口接收
        IHuman c= (IHuman)applicationContext.getBean(Chinese.class);
        c.doMeal("张三", "油泼面");
        c.doShower("搓澡巾");
        System.out.println("*********************************");
        //要用接口接收
        IHuman a= (IHuman) applicationContext.getBean(American.class);
        a.doMeal("Tom", "hotdog");
        a.doShower("towel");
    }
}
