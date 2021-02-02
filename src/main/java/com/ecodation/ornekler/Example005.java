package com.ecodation.ornekler;

public class Example005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] dizi = {1,35,6,9,58,5};
		int[] ters=new int[dizi.length];
		System.out.println("dizi boyuut :"+dizi.length);
		for (int temp : dizi) {
			System.out.print(temp+" ");
		}
		for (int i = 0; i < dizi.length; i++) {
			ters[dizi.length-i-1]=dizi[i];//diziyi ters yazmak için
		}
		System.out.println("\n\r");
		for (int temp : ters) {
			System.out.print(temp+" ");
		}
	}

}
