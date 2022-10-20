package com.pxy;

import com.pxy.config.SpringConfig;
import com.pxy.dao.impl.CalculatorImpl;
import com.pxy.service.MutilCalCulator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        CalculatorImpl calculator = ctx.getBean(CalculatorImpl.class);
        MutilCalCulator mutilCalCulator = ctx.getBean(MutilCalCulator.class);
        mutilCalCulator.addAndmuti();
        calculator.add(2,2);

    }
}
