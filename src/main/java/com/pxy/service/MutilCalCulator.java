package com.pxy.service;

import com.pxy.dao.ICalculator;
import com.pxy.dao.impl.CalculatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
public class MutilCalCulator {
    //无需setter方法  采用暴力反射
    //按名称注入之后，可以按名称装配
    @Autowired
    @Qualifier("calculator1")
    private ICalculator calculator;//Qualifier选择不同的接口实现类来注入，按名称

    public void addAndmuti(){
        calculator.add(1,2);
    }
}
