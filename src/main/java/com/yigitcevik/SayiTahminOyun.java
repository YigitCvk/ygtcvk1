package com.yigitcevik;

import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short tahminHakkı=6;
		String message=
				"** Sayı Tahmin Oyunu ***\n"
				+"Tahmin Edilecek olan Aralık 0-20 arası\n"
				+"6 tane Tahmin Hakkınız var\n"
				+"Tekrar Oynamak İstediğinizde Rastgele bir sayiya basın\n"
				+"Başarılar.....\n"
		        +"Tahmini sayınızı giriniz\n";
		
		while (true) {
			System.out.println(message);
			Random random=new Random();
			int tahminEdilecekSayi=random.nextInt(20);
			Scanner scan=new Scanner(System.in);
			for (int i = tahminHakkı; i >0 ; i--) 
			{
				int tahminEdilenSayi=scan.nextInt();
				if (tahminEdilecekSayi==tahminEdilenSayi)
				{
					String message2="Tebrikler Doğru Tahmin \n"
							+" Tekrar oyanamak için 1 e Çıkmak için 0 a basın...";
							
					System.out.println(message2);
					int cvp=scan.nextInt();
					if (cvp==0)
					{
						System.out.println("Çıkış Yapılıyor ");
						return;
					}
					else {
						break;
					}
					
				}
				else if (tahminEdilecekSayi!=tahminEdilenSayi) 
				{
					System.out.println("Hatalı Bir Tahmin Yaptınız. "+" "+"Kalan Tahmin "+(i-1) );
				
				if (i==1)
				{
				String message3=
						"Tahmin Hakkınız Bitti \n "
						+" Tekrar oyanamak için 1 e Çıkmak için 0 a basın...";
				System.out.println(message3);
				int cevap=scan.nextInt();
				if (cevap==0)
				{
					System.out.println("Çıkış yapılıyor ");
					return;
				}
				else 
				{
					break;
				}
				
				}
				tahminOrani(tahminEdilenSayi, tahminEdilecekSayi);
				}
			}
			
			}
		
		
	}
	
	static void tahminOrani(int tahminEdilenSayi,int tahminEdilecekSayi) 
	{
		int f=tahminEdilenSayi-tahminEdilecekSayi;
		if (f <= 0 && f > -2|| f >= 0 && f < 2) {
			System.out.println("Sayıya Çok Yaklaştın");
		}
		else if (f <= -2 && f > -4 || f >= 2 && f < 4) {
			System.out.println("Yaklaşıyorsun");
		}
		else if (f<=-4&&f>=-14||f>=4&&f<14)
		{
			System.out.println("Sayıdan Uzaklaşıyorsun");
			
		}
		else if (f <= -15 && f > -19 || f >= 15 && f <= 19) 
		{
			System.out.println("Çok Uzaksın ");
		}

	}

}
