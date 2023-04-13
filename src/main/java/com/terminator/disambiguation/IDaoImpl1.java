package com.terminator.disambiguation;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("second")
public class IDaoImpl1 implements IDao{

    public IDaoImpl1(){
        System.out.println("Second implementation instance");
    }

    @Override
    public List<Object> getAll() {
        return null;
    }
}
