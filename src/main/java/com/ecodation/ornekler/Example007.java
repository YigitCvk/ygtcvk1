package com.ecodation.ornekler;

public class Example007 {

	public static void main(String[] args) {

		char[][] matrix=new char[10][10];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j]='*';
				
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j]='*';
				if(j<i)
				{
					System.out.print(matrix[i][j]);
				}
				
				}
				System.out.println();
			}
			
		}
	}


