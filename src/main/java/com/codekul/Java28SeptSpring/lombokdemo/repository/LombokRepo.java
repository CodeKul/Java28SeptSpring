package com.codekul.Java28SeptSpring.lombokdemo.repository;

import com.codekul.Java28SeptSpring.lombokdemo.domain.LombokDemo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LombokRepo  extends JpaRepository<LombokDemo,Integer> {
}
