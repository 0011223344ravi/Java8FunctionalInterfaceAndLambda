package com.example.java8functionalinterfaceandlambda.fi;

public class Test {


    public static void main(String[] args) {
        DemoFunctionalInterface  demoFunctionalInterface = ()->{
            System.out.println("hello world");
        };
        demoFunctionalInterface.test();

        DemoFunctionalInterface  demoFunctionalInterface1 = ()->{
            System.out.println("Tarkesh world");
        };
        demoFunctionalInterface1.test();
    }
}
