package com.codekul.Java28SeptSpring.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class BoysStudent {


    public void study(){
        System.out.println("Boys Study");
    }

}
