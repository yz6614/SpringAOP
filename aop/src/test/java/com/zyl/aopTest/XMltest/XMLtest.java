package com.zyl.aopTest.XMltest;


import com.tl.aop.service.IHuman;
import com.tl.aop.serviceImplement.American;
import com.tl.aop.serviceImplement.Chinese;
import com.zyl.aopTest.BaseTestTemplate;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:applicationContextXML.xml"}) //加载配置文件
public class XMLtest extends BaseTestTemplate{
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContextXML.xml");
        System.out.println("************* 使用XNL实现AOP**************");
        //要用接口接收
        IHuman c= (Chinese)applicationContext.getBean("chinese");
        c.doMeal("张三", "油泼面");
        c.doShower("搓澡巾");
        System.out.println("*********************************");
        //要用接口接收
        IHuman a= (American)applicationContext.getBean("american");
        a.doMeal("Tom", "hotdog");
        a.doShower("towel");
    }
}
