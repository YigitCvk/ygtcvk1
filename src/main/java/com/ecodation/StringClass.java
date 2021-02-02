package com.ecodation;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ygtCvk="Naber Yaprammmmmmmmm   ";
		
		System.out.println("Boyutu "+ygtCvk.length());
		System.out.println("Tüm Karekterler büyük "+ygtCvk.toUpperCase());
		System.out.println("Bütün Karekterler küçük "+ygtCvk.toLowerCase());
		System.out.println("Boş mu? "+ygtCvk.isEmpty());
		System.out.println("Başında ve sonunda ki boşlukları siler "+ygtCvk.trim());
		System.out.println("Replace(değişiklik)"+ygtCvk.replace("mm", "sql"));
		System.out.println("Karşılaştırma"+ygtCvk.compareTo("xyz"));
		System.out.println("Char At "+ygtCvk.charAt(12));
		System.out.println("İndex Of "+ygtCvk.indexOf("m"));
		
		System.out.println("Aralıkta ki değerler"+ygtCvk.substring(0,6));
		System.out.println("İçinde Var mı Yok mu"+ygtCvk.contains("yap"));
		System.out.println("Boyutu"+ygtCvk.split(","));
		String[] parcala=ygtCvk.split(" ");
				for(String temp:parcala) {
			System.out.println(temp);
				}
		System.out.println(ygtCvk.startsWith("na")); //başlangıç değeri doğru mu
		System.out.println(ygtCvk.endsWith("mm"));//bitiş değeri doğrumu
		System.out.println(ygtCvk.concat("Naber"));
		System.out.println(ygtCvk.equals("Naber"));
		//Mülakat Sorusu
		/*Java by pass references midir?
		 * Java by pass value midir?
		 * 
		 * By pass value dir
		 * */
	

	}

}
