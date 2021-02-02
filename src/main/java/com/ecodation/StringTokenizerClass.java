package com.ecodation;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {

		//Parçalama(Tokenizer) Büyük veriler kullanılır. 
		/*Parçalama yapmak için Parametreyi baştan verimek gerekiyor. &,boşluk &=ampersand ~=tilda
         StringTokenizer sTok = new StringTokenizer(str,"&, "); //delimiter pattern
         while(sTok.hasMoreTokens() ){ //Stringler olduğunca bunu yapmaya devam et.
         String tok=sTok.nextToken(); //bir sonraki tokena git
         System.out.println("Hepsi:"+tok);
		  */
		
		String xy="Naber Lan Puşt Nasıl gidiyor, yapıyon bu sporu  ";

		StringTokenizer stringTokenizer=new StringTokenizer(xy);
		while (stringTokenizer.hasMoreTokens()) 
		{
			String temp= stringTokenizer.nextToken();
			System.out.println(temp);
			
		}
		
	}

}
