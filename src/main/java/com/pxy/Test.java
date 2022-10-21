package com.pxy;

import com.pxy.config.SpringConfig;
import com.pxy.dao.impl.CalculatorImpl;
import com.pxy.dao.impl.CalculatorImpl_1;
import com.pxy.service.MutilCalCulator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        CalculatorImpl calculator = (CalculatorImpl) ctx.getBean("calculator");
        CalculatorImpl_1 calculator1 = (CalculatorImpl_1) ctx.getBean("calculator1");
        MutilCalCulator mutilCalCulator = ctx.getBean(MutilCalCulator.class);
        mutilCalCulator.addAndmuti();
        calculator.add(2,2);
        calculator1.add(1,2);

    }
}
