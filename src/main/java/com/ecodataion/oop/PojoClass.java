package com.ecodataion.oop;

//Pojo :private  gettter setter 
//bean=constructor + seriazbke + pojo:


// POJO = plain old java object
//POJP> bean>ManagedBean>CDI
public class PojoClass {
	//Nesne Değişkeni
	private String name="";
	private String surname="";
	
	
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
