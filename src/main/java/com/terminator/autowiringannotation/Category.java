package com.terminator.autowiringannotation;

import org.springframework.stereotype.Component;

@Component
public class Category {

    public Category() {
        System.out.println("Category instance created");
    }
}
