package com.ecodation;

public class MethodsClass {

	public static void metotAdi() 
	{
		System.out.println("Merhaba Metod dan geldim ben");
	}
	public static void deneme(String str)
	{
		str="Yiğit Çevik";
		System.out.println(" Merhaba String :"+str);
	}
	public static void deneme(String str,int yas)//OverLoading Sadece Parametreleri Farklı

	{
		str="Yiğit Çevik";
		System.out.println("Ad Soyad : "+str+" Yaş :"+yas);
	}
	public static String denemeVoidsiz() 
	{
		System.out.println("Voidsiz ");

		String teknolojiler="Java Se ";
		return teknolojiler;
		
	}
	public static String denemeVoidsiz(int x) 
	{
		
		String str5=Integer.toString(x);
		return str5;
	
	}
	
	public static void deneme01()
	{
		System.out.println(denemeVoidsiz());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String denemex=" 010101010101010101010101010101010101010";
		deneme(denemex);
		deneme(denemex , 31);
		metotAdi();
		String str4=denemeVoidsiz();
		System.out.println(str4);
		
		
		String sonuc=denemeVoidsiz(31);
		System.out.println(sonuc);
		
		deneme01();

	}

}
