package com.ecodation.enums;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Days gunler=Days.pazar;
		System.out.println(gunler);
		for(Days gunlerFor :gunler.values()) {
			System.out.println(gunlerFor);
		}
		Days2 gunler2=Days2.sali;
	}

}
