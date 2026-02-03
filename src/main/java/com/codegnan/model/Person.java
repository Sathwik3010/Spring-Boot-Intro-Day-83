package com.codegnan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Person {
	@Value("101")
	private int id;
	@Value("Dev")
	private String name;
	@Value("dev@gmail.com")
	private String email;
	@Autowired
	private Address address;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", address= (" + address +")"+ "]";
	}
	
}
