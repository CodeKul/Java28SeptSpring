package com.codekul.Java28SeptSpring.manytomany.repository;

import com.codekul.Java28SeptSpring.manytomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
