package com.codekul.Java28SeptSpring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_PROTOTYPE)//singleton
public class Employee {

    private int id;

    private String name;

    private String address;

    public void show() {
        System.out.println("In show");
    }

    public Employee(){
        System.out.println("Object created");
    }

}
