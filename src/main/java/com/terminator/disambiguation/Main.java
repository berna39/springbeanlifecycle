package com.terminator.disambiguation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyService myService = context.getBean("myService", MyService.class);
        System.out.println(myService.getiDao());
    }
}
