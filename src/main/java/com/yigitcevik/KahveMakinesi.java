package com.yigitcevik;
import java.util.Scanner;
public class KahveMakinesi {
	
	public static void main(String[] args) throws InterruptedException {
		String kahveCesitleri=
				"1-)Dibek Kahvesi\n"
				+"2-)Menengiç Kahvesi \n"
				+"3-)ÇörekOtu Kahvesi \n"
				+"4-)Adana Gar Kahvesi \n"
				+"5-)Sütlü TÜRK Kahvesi \n";
		System.out.println(kahveCesitleri);
		System.out.println("Kaç Numaralı Kahveyi İstersiniz :");
		Scanner scan=new Scanner(System.in);
		int kahveSecim=scan.nextInt();
		String Seker=
				"a-)Şekersiz \n"
				+"b-)Az Şekerli \n"
				+"c-)Orta Şekerli \n"
				+"d-)Şekerli \n";
		System.out.println(Seker);
		System.out.println("Kahvenizin Şeker Durumunu Seçiniz :");
		scan.nextLine();
		String sekerSayisi=scan.nextLine();
		String secim="";
		if (sekerSayisi.equals("a")) 
		{
			secim="Sekersiz";
		}
		else if (sekerSayisi.equals("b"))
		{
			secim="Az Şekerli";			
		}
		else if (sekerSayisi.equals("c"))
		{
			secim="Orta Şekerli";
		} 
		else if(sekerSayisi.equals("d"))
		{
			secim="Şekerli";
		}
		else
		{
			System.out.println("Hatalı İşlem !!! ");			
		}
		
		switch (kahveSecim) {
		case 1:
			System.out.println("Kahveniz Hazırlanıyor ...");		
			Thread.sleep(2000);
			String bildirim=secim+" Dibek Kahveniz Hazır \n Afiyet Olsun";
			System.out.println(bildirim);
					        
			break;
			
		case 2:
			System.out.println("Kahveniz Hazırlanıyor ...");
			Thread.sleep(2000);
			String bildirim2=secim+" Menengiç Kahveniz Hazır \n *** Afiyet Olsun ***";
			System.out.println(bildirim2);
			
			break;
		case 3:
			System.out.println("Kahveniz Hazırlanıyor ...");
			Thread.sleep(2000);
			String bildirim3=secim+" ÇörekOtu Kahveniz Hazır \n *** Afiyet Olsun ***";
			System.out.println(bildirim3);
			
			break;
		case 4:
			System.out.println("Kahveniz Hazırlanıyor ...");
			Thread.sleep(2000);
			String bildirim4=secim+" Adana Gar Kahveniz Hazır \n *** Afiyet Olsun ***";
			System.out.println(bildirim4);
			
			break;
		case 5:
			System.out.println("Kahveniz Hazırlanıyor ...");
			Thread.sleep(2000);
			String bildirim5=secim+" Sütlü TÜRK Kahveniz Hazır \n   *** Afiyet Olsun ***";
			System.out.println(bildirim5);
			
			break;

		default:
			System.out.println("Hatalı Seçim Yaptın !!!");
			break;
		}
	}

}
