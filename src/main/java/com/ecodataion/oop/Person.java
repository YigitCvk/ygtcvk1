package com.ecodataion.oop;

//Pojo :private  gettter setter 
//bean=constructor + seriazbke + pojo:
public class Person {
	//Nesne Değişkenleri
	private long tcKimlik;
	private String adi;
	private String soyAdi;

	
	//Getter And Setter 
	/*Get Liste Getirir
	 * Setter ise birşeyleri yazıyor
	 */
	public long getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(long tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	
}
