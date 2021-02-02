package com.ecodataion.oop;

import com.sun.corba.se.impl.oa.poa.POACurrent;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PojoClass pojoClass = new PojoClass();
		//System.out.println(pojoClass.getName());
		//System.out.println(pojoClass);
		
		
		//constructor deneme
		BeanEcodation beanEcodation=new BeanEcodation();
		
		beanEcodation.setName("yiğit");
		beanEcodation.setSurname("çevik");
		
		
		System.out.println(beanEcodation.getName()+beanEcodation.getSurname());
	}

}
