package com.codegnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codegnan.model.Person;

@SpringBootApplication
public class Boot01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot01Application.class, args);
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}

}
