package com.endava.calculator;

import com.endava.calculator.BasicCalculator;

public class ExpertCalculator extends BasicCalculator {

public Long factorial (int n) {

    if (n==0){
        return 1L;
    } else {
        return factorial(n-1)*n;
    }
}
}
