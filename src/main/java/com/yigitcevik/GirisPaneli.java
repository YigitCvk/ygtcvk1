package com.yigitcevik;
import java.util.Scanner;
public class GirisPaneli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		 String kAdi="ygtcvk";
		 String pass="123456";
		 System.out.print("Kullanıcı Adı :");
		 String kAdi2=scan.nextLine();
		 System.out.print("Paralo Girin :");
		 String pass2=scan.nextLine();
		 if (kAdi.equals(kAdi2) &&pass.equals(pass2))
		 {
			 String bilgiString="Giriş Başarılı \n"
			                     + "Hoşgeldiniz";
			 System.out.println(bilgiString);
			 return;
			
		}
		 else if (kAdi.equals(kAdi2) && !pass.equals(pass2) )
		 {
			String bildirim="Şifre Hatalı ";
			System.out.println(bildirim);
			return;
		}
		 else if (!kAdi.equals(kAdi2)&&pass.equals(pass2)) 
		 {
			 String bildirim="Kullanıcı Adı Hatali";
			 System.out.println(bildirim);
			 return;
			
		}
		 else {
			String bildirim="Bİlgiler Hatali";
			System.out.println(bildirim);
			return;
		}


	}

}
