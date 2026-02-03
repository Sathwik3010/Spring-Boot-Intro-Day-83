package com.codegnan.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class Address {
	@Value("Hyderabad")
	private String city;
	@Value("Telangan")
	private String name;
	@Override
	public String toString() {
		return "city=" + city + ", name=" + name ;
	}
	
}
