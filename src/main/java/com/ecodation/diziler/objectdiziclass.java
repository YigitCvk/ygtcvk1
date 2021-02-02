package com.ecodation.diziler;

public class objectdiziclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] dizi=new Object[5];
		dizi[0]=01;
		dizi[1]=01.25;
		dizi[2]="Hello World";
		dizi[3]='@';
		dizi[4]=true;

		for (Object object : dizi) {
			System.out.println(object);
		}
		System.out.println(" Debug Tamam ");
	}

}
