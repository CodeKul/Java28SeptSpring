package com.codekul.Java28SeptSpring.aop;

public class MyException extends RuntimeException {
    public MyException(String ex) {
        System.out.println(ex);
    }
}
