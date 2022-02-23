package com.codekul.Java28SeptSpring.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class BoysStudent {


    public int study(int i){
        System.out.println("Boys Study "+i);
        return 300;
    }

    public void myException(String str){
        throw new MyException(str);
    }

}
