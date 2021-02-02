package com.ecodation;

//Kalıtım yoluyla alamazsın
public final class FinalClass {//Class dan önce yaz

	public static void main(String[] args)
	{
		final double pi=3.14; //Değişkenlerde final kullanıldığında değişken artık sabittir alt satırlarda değiştirelemez heryerde aynı
		//Değişkenlerde 
		//Methodlarda
		//Classlarda Kullanılır...
		
		//pi=3.01;
		System.out.println(pi);
		/**/
		
		denemeMethod();
		
		MethodsClass m2=new MethodsClass();
		MethodsClass.denemeVoidsiz();
		MethodsClass.deneme01();
	}
	//Override yapamazsın
	public static final void denemeMethod() //override yapılamaz(Ezme işlemi) voidden önce herhangi bi yerde yaz
	{
		System.out.println("deneme Final !!!");
	}
}
