package com.example.java8functionalinterfaceandlambda.othersFI;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer ,Integer> f = (t) ->{
            return Integer.valueOf(t*10);
        };
        System.out.println( f.apply(10));
    }

}
