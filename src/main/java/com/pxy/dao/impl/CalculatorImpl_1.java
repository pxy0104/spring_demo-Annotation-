package com.pxy.dao.impl;

import com.pxy.dao.ICalculator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("calculator1")
@Scope
public class CalculatorImpl_1 implements ICalculator {

    @Override
    public void add(int a,int c) {
        int b= a+c;
        System.out.println(a+"+"+c+"="+b);
    }

    @Override
    public void multiply(int a, int c) {
        int b = a*c;
        System.out.println(b);
    }

    @Override
    public void minus(int a, int c) {
        int b = a-c;
        System.out.println(b);
    }

    @Override
    public void division(int a, int c) {
        int b = a/c;
        System.out.println(b);
    }
}
