package com.codekul.Java28SeptSpring;

import com.codekul.Java28SeptSpring.aop.BoysStudent;
import com.codekul.Java28SeptSpring.aop.GirlStudent;
import com.codekul.Java28SeptSpring.aop.Human;
import com.codekul.Java28SeptSpring.di.Company;
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
//			Company e = context.getBean(Company.class);
//			e.getData();

//		Human obj2 = context.getBean(Human.class);


		BoysStudent obj = context.getBean(BoysStudent.class);
		obj.study();

//		GirlStudent obj3 = context.getBean(GirlStudent.class);
//		obj3.study();

	}

	@GetMapping("hii")
	public String getMsg(){
		return "Hello spring ";
	}

}
