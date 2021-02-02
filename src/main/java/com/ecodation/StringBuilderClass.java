package com.ecodation;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Database veya apilerden gelen verilerde string builder kullanılır
		
		
		String kelime = "Adana";
		StringBuilder stringBuilder= new StringBuilder(kelime);
		stringBuilder .append("2 ").append("9 ").append("16 ");  
		String cevirmen = stringBuilder.toString();
		System.out.println(cevirmen);
	

	}

}
