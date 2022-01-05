package com.codekul.Java28SeptSpring.servicedemo.repository;

import com.codekul.Java28SeptSpring.servicedemo.domain.ServiceDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDemoRepo extends JpaRepository<ServiceDemo,Integer> {
}
