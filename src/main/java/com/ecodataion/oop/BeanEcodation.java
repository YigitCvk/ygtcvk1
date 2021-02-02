package com.ecodataion.oop;

import java.io.Serializable;

public class BeanEcodation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	private String name;
	private String surname;
	private String age;
	
	//overloading
	//Constructor parametresiz
	public BeanEcodation() {
		
	}
	
	//parametreli constructor
	public BeanEcodation(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
     //Parametreli constructor
	public BeanEcodation(String name, String surname, String age) {
		//super();
		//this.name = name;
		//this.surname = surname;
		this(name,surname);
		this.age = age;
	}

	//Getter and Setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
