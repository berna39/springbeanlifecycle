package com.terminator.autoconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Product {
    //@Autowired
    private Category category;
    private String name;

    // this is Better to avoid Circular Dependency and Easier to test (because we don't need to mock Category instance)
    // Spring will automatically create an instance and inject it
    public Product(Category category) {
        this.category = category;
    }

//    @Autowired
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
