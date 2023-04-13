package com.terminator.disambiguation;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IDaoImpl implements IDao{

    public IDaoImpl(){
        System.out.println("First Implementation instancied");
    }

    @Override
    public List<Object> getAll() {
        return null;
    }
}
