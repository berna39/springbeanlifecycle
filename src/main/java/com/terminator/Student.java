package com.terminator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Student implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    private String firstName;

    public  Student() {
        System.out.println("The No-Args constructor is being executed");
    }

    public  Student(String firstName) {
        System.out.println("The All-Args constructor is being executed");
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Set first name is being executed");
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(String.format("Set Bean name is being executed : %s", s));
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("Set Bean Factory is being executed : %s", beanFactory.isSingleton("student")));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(String.format("Set Application Context is being executed : %s", applicationContext.isPrototype("student")));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.firstName = "Tobirama";
        System.out.println(String.format("My Name is now %s", this.firstName));
    }
}
