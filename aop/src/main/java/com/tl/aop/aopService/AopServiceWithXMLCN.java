package com.tl.aop.aopService;

import org.springframework.stereotype.Component;

/**
 * @author Zhang Yunlong
 */

@Component("aopServiceWithXMLCN")
public class AopServiceWithXMLCN {

    public void chifanqian(String name, String meal){
        System.out.println(String.format("[%s]饭前洗手然后吃[%s]", name, meal));
    }

    public void chifanhou(){
        System.out.println("饭后漱口");
    }

    public void shuijiaoqian(){
        System.out.println("保持卫生");
    }
}
