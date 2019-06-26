package com.nttdata.entity;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class User {
	private float age;
	private String name;
	private float salary;
	private Address address;
	
}
