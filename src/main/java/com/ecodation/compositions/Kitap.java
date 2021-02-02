package com.ecodation.compositions;

public class Kitap {

	private String basimYili;
	private String kitapAdi;
	
	private Yazar yazar;
	
	//parametresiz constructor
	public Kitap() {
		yazar = new Yazar();
	}
	//Parametreli constructor
	public Kitap(String basimYili, String kitapAdi) {
		//super();
		this.basimYili = basimYili;
		this.kitapAdi = kitapAdi;
	}
	
	// getter setter
	public String getBasimYili() {
		return basimYili;
	}
	public void setBasimYili(String basimYili) {
		this.basimYili = basimYili;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	
	//composition getter setter
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	
	

	
	
}
