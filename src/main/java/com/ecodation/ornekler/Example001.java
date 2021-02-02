package com.ecodation.ornekler;

import java.util.Scanner;

public class Example001 {

	//Diziler
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int satir,sutun;
		String sembol;
		System.out.println("Lütfen Sembol Girin : ");
		sembol=scanner.nextLine();
		System.out.println("Lütfen Satır Sayısı Girin : ");
		satir=scanner.nextInt(); 
		System.out.println("Lütfen Sutun Sayısı Girin : ");
		sutun=scanner.nextInt(); 
		System.out.println("Satir : "+satir+" Sutun : "+sutun);
		
		
		int[] [] matrix=new int[satir][sutun];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]=Integer.valueOf(sembol));
				
			}
			System.out.println();
		}
		
		
		

	}

}
