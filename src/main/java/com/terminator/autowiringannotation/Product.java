package com.terminator.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    //@Autowired
    private Category category;
    private String name;

    @Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}
