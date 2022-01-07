package com.codekul.Java28SeptSpring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    private int id;
    private String companyName;
    private String companyAddress;


    //field based
    @Autowired
    private Employee employee;

 //field based
    @Autowired
    private Employee employee1;


    //setter based
//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//

    //constructor based
//    @Autowired
//    public Company(Employee employee){
//        this.employee = employee;
//    }


    public void getData() {
        employee.show();
        employee1.show();
    }
}
