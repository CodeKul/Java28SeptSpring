package com.codekul.Java28SeptSpring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    Employee findByIdAndName(Integer id,String name);

    List<Employee> findByIdOrName(Integer id,String name);

    List<Employee> findByNameStartingWith(String name);
}
