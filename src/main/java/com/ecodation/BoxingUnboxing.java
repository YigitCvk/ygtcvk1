package com.ecodation;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Primitive Boxing Unboxing String
		
		//Boxing
		int primitive=45;
		System.out.println("Primitive :"+primitive);   
		Integer wrapperClass=primitive;
		System.out.println("Wrapper :"+wrapperClass);
		/*
		 * Primitive tipini Wrapper tipine a çevirmek için kullanıyoruz
		 * int=5 primitive tipindedir
		 * */
		
		//Unboxing
		Double doubleVarieble=new Double(44.44);
		double doublePrimitive=doubleVarieble;//wrapper
		System.out.print(doublePrimitive);
		/*
		 * Wrapper tipini Primitive tipine çevirmek için kullanıyoruzç
		 **/

	}

}
