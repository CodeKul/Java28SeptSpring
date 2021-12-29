package com.codekul.Java28SeptSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity<>("saved",HttpStatus.ACCEPTED);
    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeRepository.getById(employee.getId());

        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        employeeRepository.save(employee1);
        return "Record updated..";
    }

//    @DeleteMapping("deleteEmployee/{id}")
//    public String deleteEmp(@PathVariable(value = "id") Integer id){
//        employeeRepository.deleteById(id);
//        return "record Deleted..";
//    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmp(@PathVariable(value = "id") Integer id) {
        Employee employee = employeeRepository.getById(id);
        employeeRepository.delete(employee);
        return "record Deleted..";
    }


}
