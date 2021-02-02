package com.ecodation.ornekler;

import java.util.Random;

public class Example003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int karisik=random.nextInt(3)+1;
		int[] dizi=new int[10];
		double ortalama=0,toplam=0;
		for (int i = 0; i < dizi.length; i++) {
			karisik=random.nextInt(5)+1;
			dizi[i]=karisik;
			toplam+=dizi[i];
			ortalama=Math.round(toplam/dizi.length);
		}
		for (int temp : dizi) {
			System.out.print(temp+" ");
		}
		System.out.println("\n Sayi Toplam : "+toplam+"\n Sayi Ortalama :"+ortalama);

	}

}
