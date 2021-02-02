package com.ecodation.ornekler;

import java.util.Scanner;

public class Example004 {
	public static boolean login(String kullaniciAdi,String sifre)
	{
		String name,password;
		name = "Admin";
		password = "123456";
	
		int count = 4;
		while (count>0) {
			System.out.println("Kalan Hakkınız : "+count);
		if (kullaniciAdi.equals(name)&&sifre.equals(password)) {
			System.out.println("Sisteme Giriş Yapıldı :");
			return true;
			
		}
		else {
			System.out.println("Kullanıcı adı veya Şifreniz yanlış");
			count--;
			return false;
		}
		}
		//return false;
		return false;
	}
	
	public static void main(String[] args) {
		String kullaniciAdi,sifre;
		Scanner scan=new Scanner(System.in);
		System.out.println("Kullanıcı Adını Girin: ");
		kullaniciAdi=scan.nextLine();
		System.out.println("Lütfen Şifre Girin : ");
		sifre=scan.nextLine();
		boolean sonuc = login(kullaniciAdi, sifre);
	}
}
