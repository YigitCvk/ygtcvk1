package com.ecodation;

import java.util.Random;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Math bir static dir.
		
		System.out.println(Math.PI);// pi sayisi
		
		System.out.println(Math.E);// e Sayisi
		System.out.println("En düşük : "+Math.min(3, 5));
		System.out.println("En Büyük : "+Math.max(3, 5));
		System.out.println("Karekök : "+Math.sqrt(16));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.floor(2.9));
		System.out.println(Math.round(2.5));
		System.out.println(Math.random()*5+1);//1<= random<=5
		System.out.println("  ");
		Random random=new Random();
		int x=random.nextInt(5)+1;//1<=x<=5
		System.out.println(x);


		

	}

}
