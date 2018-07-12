package com.tl.aop.aopService;

import org.springframework.stereotype.Component;


@Component("aopServiceWithXMLEU")
public class AopServiceWithXMLEU {

    public void chifanqian(String name, String meal) {
        System.out.println(String.format("[%s] Washing hand before eat meal [%s]" , name, meal));
    }

    public void chifanhou() {
        System.out.println("Washing hand after meal");
    }

    public void shuijiaoqian() {
        System.out.println("Keep personal health");
    }
}
