package com.terminator.disambiguation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    @Qualifier("second") // to Call a specific Bean by name...and avoid NoUniqueBeanDefinitionException
    private IDao iDao;

    public IDao getiDao() {
        return iDao;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }
}
