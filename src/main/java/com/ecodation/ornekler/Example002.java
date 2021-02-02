package com.ecodation.ornekler;


import java.util.Random;
import java.util.Scanner;
public class Example002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int sayi;
		System.out.println("Eleman Sayisini Gir : ");
		sayi=scanner.nextInt();
		int[] dizi= new int[sayi];
		//Random
		
		//Math.random
		
		Random random=new Random();
		int karisik=random.nextInt(5)+1;
		
		for (int i = 0; i < dizi.length; i++) {
			karisik=random.nextInt(5)+1;
			dizi[i]=karisik;
			
		}
		
		//foreach
		for (int temp : dizi) {
			System.out.print(temp);
		}
		for (int i = 0; i < dizi.length; i++) {
			
		}
		System.out.println("\nİlk Sayi  : " +dizi[0] +" Son Sayi : "+dizi[dizi.length-1] + " Toplamlari => " +(dizi[0]+dizi[dizi.length-1]));
		

	}

}
