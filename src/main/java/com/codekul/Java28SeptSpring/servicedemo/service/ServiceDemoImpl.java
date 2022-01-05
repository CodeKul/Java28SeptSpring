package com.codekul.Java28SeptSpring.servicedemo.service;

import com.codekul.Java28SeptSpring.servicedemo.domain.ServiceDemo;
import com.codekul.Java28SeptSpring.servicedemo.repository.ServiceDemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemoImpl implements ServiceDemoInterface{


    @Autowired
    private ServiceDemoRepo serviceDemoRepo;

    @Override
    public void saveServiceDemo(ServiceDemo serviceDemo) {
        serviceDemoRepo.save(serviceDemo);
    }
}
