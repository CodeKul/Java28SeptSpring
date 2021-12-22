package com.codekul.Java28SeptSpring;

import com.codekul.Java28SeptSpring.di.Company;
import com.codekul.Java28SeptSpring.di.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java28SeptSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Java28SeptSpringApplication.class, args);

		Company e = context.getBean(Company.class);
		e.getData();

	}

	@GetMapping("hii")
	public String getMsg(){
		return "Hello spring ";
	}

}
