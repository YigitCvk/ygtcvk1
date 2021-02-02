package com.ecodation.ornekler;

import java.util.Scanner;

public class Example006 {

	public static int topla(int sayi1,int sayi2)
	{
		return sayi1+sayi2;
	}
	public static int cikar(int sayi1,int sayi2)
	{
		return sayi1-sayi2;
	}
	public static int carp(int sayi1,int sayi2)
	{
		return sayi1*sayi2;
	}
	public static int bol(int sayi1,int sayi2)
	{
		return sayi1/sayi2;
	}
	
	public static void main(String[] args) {
		System.out.println("Hesap Makinesi Uygulaması");
		System.out.println("Sayi Giriniz:");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		System.out.println("Sayi giriniz:");
		int y=scan.nextInt();
		
		int top=topla(x, y);
		System.out.println("Toplamları = "+top);
		int cik=cikar(x, y);
		System.out.println("Çıkarma = "+cik);

		int carpım=carp(x, y);
		System.out.println("Çarpımları = "+carpım);
		int bolum=bol(x, y);
		System.out.println("Bölümleri = "+ bolum);

	}

}
