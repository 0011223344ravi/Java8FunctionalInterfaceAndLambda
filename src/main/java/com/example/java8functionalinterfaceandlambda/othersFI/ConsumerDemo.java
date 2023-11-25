package com.example.java8functionalinterfaceandlambda.othersFI;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main (String args []){
//        Consumer c = x->System.out.println(x);
//        c.accept(110);


       Consumer c1  =  t-> System.out.println("this is the input of accept method " + t);

       c1.accept(300);

        /*List<Integer> al = Arrays.asList(1,2,5,88,7,10);
        al.stream().forEach(t->  System.out.println("printing :- " +t));*/
    }


}
