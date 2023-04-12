package com.terminator.destruction;

import org.springframework.beans.factory.DisposableBean;

public class Lesson implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Lesson Bean is being destroyed");
    }
}
