package com.zyl.aopTest.xmlWithAutowiredTest;

import com.tl.aop.serviceImplement.American;
import com.tl.aop.serviceImplement.Chinese;
import com.zyl.aopTest.BaseTestTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContextXMLWithAutowired.xml"})
public class XmlWithAutowiredTest extends BaseTestTemplate {
    @Autowired
    private Chinese chinese;
    @Autowired
    private American american;

    @Test
    public void test(){
    System.out.println("************* 使用XML，自动注入和AOP实现解耦**************");
    System.out.println("**********中国人的日常**********");
    chinese.doMeal("小张","油泼面 ");
    chinese.doShower("搓澡巾");
    System.out.println("**********老外人的日常**********");
    american.doMeal("Jason", "Sala");
    american.doShower("towel");
    }
}
