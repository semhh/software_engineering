//Semih KARACAOÐLU	17050111008
//Muhammed Said POLAT	18050111009

public class Unrefactored {
	
	public static void main(String[] args) {
		System.out.println("Sphagetti code output:");
		System.out.println("----------------------\n");
		unrefactoredCodeTest();
	}
		
	static void unrefactoredCodeTest(){
	        
		//Anlamsýz variable isimleri deðiþecek
		String[][] r = new String[3][2];
		
		r[0][0] = "Waffle";
		r[0][1] = "Yumurta ve þekeri rengi açýlýp, köpürene kadar çýrpýn. Üzerine süt, kabartma tozu, vanilin, un ve sývý yað ekleyip çýrpmaya devam edin.\n" + 
				"Waffle ya da tost makinesini kýzdýrýn ve yaðlayýn. Hazýrladýðýnýz harçtan bir kepçe kadar dökün.\n" + 
				"Makinanýn kapaðýný kapattýktan sonra orta ýsýda, aralarda kontrol ederek piþirme iþlemini gerçekleþtirin.\n" + 
				"Hazýrladýðýnýz waffle karýþýmý bitene kadar ayný iþlemi tekrarlayýn. Renk alýp, dýþý çýtýr içi daha yumuþak \n" + 
				"kývamda kalarak piþen wafflelarý servis tabaðýna alýn. Nutella,çilek, kivi ve muz dilimleri ekleyin. Yemeðiniz hazýr";
		r[1][0] = "Sutlac";
		r[1][1] = "Soðuk süt ve toz þekeri geniþ bir tencereye alýn. Bir çýrpma teliyle toz þeker eriyene kadar karýþtýrdýktan sonra ocaða alýn. Kýsýk ateþte kaynamaya býrakýn.\n" +
		        "pirinçleri; ayrý bir tencerede, 2 su bardaðý suyu ekleyerek orta ateþte suyunu çekene kadar haþlayýn.\n" +
		        "Vanilini toz þeker eriðinde süte ekleyin.\n" +
		        "Haþlanan pirinçleri ocaktan alýn ve fazla suyu kaldýysa süzün.\n" +
		        "1-2 dakika kadar kaynayan þekerli süte haþlanmýþ pirinçleri ilave edin.\n" +
		        "Yumurta sarýsýný, buðday niþastasý ve 1 bardak su ilavesiyle ayrý bir kabýn içerisine alýn.\n" +
		        "Pürüzsüz bir kývam alana kadar karýþtýrýn.\n" +
		        "Yumurta sarýsýnýn kesilmemesi için; kýsýk ateþte kaynamakta olan süt karýþýmýndan alýp niþastalý karýþýmý ýlýþtýrýn.\n" +
		        "Hazýrladýðýnýz yumurta sarýlý karýþýmý sütlaç tenceresine azar azar katýp hýzlýca karýþtýrýn.\n" +
		        "Kývam alan sütlacý, ýsýya dayanýklý porsiyonluk güveç kaplarýna eþit ölçüde boþaltýn.\n" +
		        "Sütlaç kaselerini, derin bir fýrýn tepsisine aralýklý olarak dizin. Kaplarýn yarýsýna gelecek kadar soðuk suyu, sütlaçlara deðdirmeden tepsiye alýn.\n" +
		        "Fýrýna verdiðiniz sütlaçlarý, önceden ýsýtýlmýþ 200 derece fýrýnda 12-15 dakika kadar piþirin.";
		r[2][0] = "Irmikli Tatli";
		r[2][1] = "Derin bir kabýn içerisine yumurtalarý kýrýn. Üzerine toz þekeri ekleyin ve güzelce çýrpýn.\n" +
		        "Ardýndan süt ve sývý yaðý ekleyerek karýþtýrýn.\n" +
		        "Un, kabartma tozu ve vanilyayý eleyerek ilave edin. Spatula yardýmýyla karýþtýrýn.\n" +
		        "Ýrmiði de ekleyerek güzelce karýþtýrýn. Son olarak limon kabuðu rendesini de ilave edin ve son kez karýþtýrýn.\n" +
		        "Yaðlanmýþ, unlanmýþ orta boy bir borcamýn içerisine orta incelikte olacak þekilde kekinizi yayýn.\n" +
		        "Önceden ýsýtýlmýþ 180 derecelik fýrýnda üzeri güzelce kýzarana kadar ortalama 25-30 dakika kadar piþirin.\n" +
		        "Ilýk sütün içerisine vanilya ve toz þekeri ekleyin ve þekerin içerisinde erimesini saðlayýn. Sütünüzü soðumaya býrakýn.\n" +
		        "Fýrýndan aldýðýnýz kekin üzerine býçak ya da çatal yardýmýyla delikler açýn ve hazýrladýðýnýz sütü üzerine gezdirin. Kekin sütü çekmesini bekleyin.\n" +
		        "Sütünü güzelce çektikten buzdolabýna kaldýrýn ve 1 saat kadar dinlendirin. Çýkarýp üzerini Antep fýstýðýyla süsleyerek servis edin.";
		            
		//Methodlar extract edilecek.
		
	        String[][] inc1 = new String[11][2];        
			inc1[0][0] = "Gr Seker";
			inc1[0][1] = "4";
			inc1[1][0] = "mL Sivi Yag";
			inc1[1][1] = "8";
			inc1[2][0] = "Gr Un";
			inc1[2][1] = "3.6";
			inc1[3][0] = "Adet Yumurta";
			inc1[3][1] = "93";
			inc1[4][0] = "Gr KabartmaT.";
			inc1[4][1] = "0.53";
			inc1[5][0] = "Adet Vanilin";
			inc1[5][1] = "144";
			inc1[6][0] = "mL Sut";
			inc1[6][1] = "0.6";
			inc1[7][0] = "Adet Cilek";
			inc1[7][1] = "5";
			inc1[8][0] = "Adet Kivi";
			inc1[8][1] = "36";
			inc1[9][0] = "Adet Muz";
			inc1[9][1] = "105";
			inc1[10][0] = "Adet Nutella";
			inc1[10][1] = "2720";
			
			String[][] inc2 = new String[7][2];        
			inc2[0][0] = "Gr Seker";
			inc2[0][1] = "4";
			inc2[1][0] = "Gr Nisasta";
			inc2[1][1] = "3.5";
			inc2[2][0] = "Adet Yumurta";
			inc2[2][1] = "93";
			inc2[3][0] = "Adet Vanilin";
			inc2[3][1] = "144";
			inc2[4][0] = "mL Sut";
			inc2[4][1] = "0.6";
			inc2[5][0] = "Gr Pirinc";
			inc2[5][1] = "0.1";
			inc2[6][0] = "mL Su";
			inc2[6][1] = "0";
			
			String[][] inc3 = new String[9][2];  
			inc3[0][0] = "Gr Seker";
			inc3[0][1] = "4";
			inc3[1][0] = "mL Sivi Yag";
			inc3[1][1] = "8";
			inc3[2][0] = "Gr Un";
			inc3[2][1] = "3.6";
			inc3[3][0] = "Adet Yumurta";
			inc3[3][1] = "93";
			inc3[4][0] = "Gr KabartmaT.";
			inc3[4][1] = "0.5";
			inc3[5][0] = "Adet Vanilin";
			inc3[5][1] = "144";
			inc3[6][0] = "mL Sut";
			inc3[6][1] = "0.6";
			inc3[7][0] = "Gr Irmik";
			inc3[7][1] = "3.5";
			inc3[8][0] = "Gr Limon Ka.";
			inc3[8][1] = "0.4";
			
			int[] a1 = new int[11];
			a1[0] = 37;
			a1[1] = 43;		
			a1[2] = 210;	
			a1[3] = 1;
			a1[4] = 4;
			a1[5] = 1;
			a1[6] = 200;
			a1[7] = 6;
			a1[8] = 1;
			a1[9] = 2;
			a1[10] = 1;
			
			int[] a2 = new int[7];
			a2[0] = 200;
			a2[1] = 16;		
			a2[2] = 1;	
			a2[3] = 1;
			a2[4] = 2;
			a2[5] = 70;
			a2[6] = 600;
			
			int[] a3 = new int[9];
			a3[0] = 78;
			a3[1] = 129;		
			a3[2] = 280;	
			a3[3] = 3;
			a3[4] = 9;
			a3[5] = 1;
			a3[6] = 100;
			a3[7] = 40;
			a3[8] = 5;
	        
	        double t1 = (a1[0] * Double.parseDouble(inc1[0][1])) + (a1[1] * Double.parseDouble(inc1[1][1])) + (a1[2] * Double.parseDouble(inc1[2][1])) + 
	        (a1[3] * Double.parseDouble(inc1[3][1])) + (a1[4] * Double.parseDouble(inc1[4][1])) + (a1[5] * Double.parseDouble(inc1[5][1])) +
	        (a1[6] * Double.parseDouble(inc1[6][1])) + (a1[7] * Double.parseDouble(inc1[7][1])) + (a1[8] * Double.parseDouble(inc1[8][1])) +
	        (a1[9] * Double.parseDouble(inc1[9][1])) + (a1[10] * Double.parseDouble(inc1[10][1]));     
	             
	        //Çýktý yazdýrma kýsmý if ve for fonksiyonlarý kullanýlarak kýsaltýlacak.
	        
	        System.out.println("1) " + r[0][0] + "\n");
	        System.out.println(a1[0] + " " + inc1[0][0] + "\t\t\t" + (a1[0] * Double.parseDouble(inc1[0][1])) + " cal");
	        System.out.println(a1[1] + " " + inc1[1][0] + "\t\t\t" + (a1[1] * Double.parseDouble(inc1[1][1])) + " cal");
	        System.out.println(a1[2] + " " + inc1[2][0] + "\t\t\t" + (a1[2] * Double.parseDouble(inc1[2][1])) + " cal");
	        System.out.println(a1[3] + " " + inc1[3][0] + "\t\t\t" + (a1[3] * Double.parseDouble(inc1[3][1])) + " cal");
	        System.out.println(a1[4] + " " + inc1[4][0] + "\t\t\t" + (a1[4] * Double.parseDouble(inc1[4][1])) + " cal");
	        System.out.println(a1[5] + " " + inc1[5][0] + "\t\t\t" + (a1[5] * Double.parseDouble(inc1[5][1])) + " cal");
	        System.out.println(a1[6] + " " + inc1[6][0] + "\t\t\t" + (a1[6] * Double.parseDouble(inc1[6][1])) + " cal");
	        System.out.println(a1[7] + " " + inc1[7][0] + "\t\t\t" + (a1[7]* Double.parseDouble(inc1[7][1])) + " cal");
	        System.out.println(a1[8] + " " + inc1[8][0] + "\t\t\t" + (a1[8] * Double.parseDouble(inc1[8][1])) + " cal");
	        System.out.println(a1[9] + " " + inc1[9][0] + "\t\t\t" + (a1[9] * Double.parseDouble(inc1[9][1])) + " cal");
	        System.out.println(a1[10] + " " + inc1[10][0] + "\t\t\t" + (a1[10] * Double.parseDouble(inc1[10][1])) + " cal");
	        
	        System.out.println("Total Kalori = " + t1);
	        
	        System.out.println("\nMethod: \n" + r[0][1]);
	        
	        System.out.println("\n2) " + r[1][0] + "\n");
	        System.out.println(a2[0] + " " + inc2[0][0] + "\t\t\t" + (a2[0] * Double.parseDouble(inc2[0][1])) + " cal");
	        System.out.println(a2[1] + " " + inc2[1][0] + "\t\t\t" + (a2[1] * Double.parseDouble(inc2[1][1])) + " cal");
	        System.out.println(a2[2] + " " + inc2[2][0] + "\t\t\t" + (a2[2] * Double.parseDouble(inc2[2][1])) + " cal");
	        System.out.println(a2[3] + " " + inc2[3][0] + "\t\t\t" + (a2[3] * Double.parseDouble(inc2[3][1])) + " cal");
	        System.out.println(a2[4] + " " + inc2[4][0] + "\t\t\t" + (a2[4] * Double.parseDouble(inc2[4][1])) + " cal");
	        System.out.println(a2[5] + " " + inc2[5][0] + "\t\t\t" + (a2[5] * Double.parseDouble(inc2[5][1])) + " cal");
	        System.out.println(a2[6] + " " + inc2[6][0] + "\t\t\t" + (a2[6] * Double.parseDouble(inc2[6][1])) + " cal");
	        
	        double t2 = (a2[0] * Double.parseDouble(inc2[0][1])) + (a2[1] * Double.parseDouble(inc2[1][1])) + (a2[2] * Double.parseDouble(inc2[2][1])) + 
	        (a2[3] * Double.parseDouble(inc2[3][1])) + (a2[4] * Double.parseDouble(inc2[4][1])) + (a2[5] * Double.parseDouble(inc2[5][1])) +
	        (a2[6] * Double.parseDouble(inc2[6][1]));
	        
	        System.out.println("Total Kalori = " + t2);
	        
	        System.out.println("\nMethod: \n" + r[1][1]);
	        
	        System.out.println("\n3) " + r[2][0] + "\n");
	        System.out.println(a3[0] + " " + inc3[0][0] + "\t\t\t" + (a3[0] * Double.parseDouble(inc3[0][1])) + " cal");
	        System.out.println(a3[1] + " " + inc3[1][0] + "\t\t\t" + (a3[1] * Double.parseDouble(inc3[1][1])) + " cal");
	        System.out.println(a3[2] + " " + inc3[2][0] + "\t\t\t" + (a3[2] * Double.parseDouble(inc3[2][1])) + " cal");
	        System.out.println(a3[3] + " " + inc3[3][0] + "\t\t\t" + (a3[3] * Double.parseDouble(inc3[3][1])) + " cal");
	        System.out.println(a3[4] + " " + inc3[4][0] + "\t\t\t" + (a3[4] * Double.parseDouble(inc3[4][1])) + " cal");
	        System.out.println(a3[5] + " " + inc3[5][0] + "\t\t\t" + (a3[5] * Double.parseDouble(inc3[5][1])) + " cal");
	        System.out.println(a3[6] + " " + inc3[6][0] + "\t\t\t" + (a3[6] * Double.parseDouble(inc3[6][1])) + " cal");
	        System.out.println(a3[7] + " " + inc3[7][0] + "\t\t\t" + (a3[7] * Double.parseDouble(inc3[7][1])) + " cal");
	        System.out.println(a3[8] + " " + inc3[8][0] + "\t\t\t" + (a3[8] * Double.parseDouble(inc3[8][1])) + " cal");
	        
	        double t3 = (a3[0] * Double.parseDouble(inc3[0][1])) + (a3[1] * Double.parseDouble(inc3[1][1])) + (a3[2] * Double.parseDouble(inc3[2][1])) + 
	        (a3[3] * Double.parseDouble(inc3[3][1])) + (a3[4] * Double.parseDouble(inc3[4][1])) + (a3[5] * Double.parseDouble(inc3[5][1])) +
	        (a3[6] * Double.parseDouble(inc3[6][1])) + (a3[7] * Double.parseDouble(inc3[7][1])) + (a3[8] * Double.parseDouble(inc3[8][1]));
	        
	        System.out.println("Total Kalori = " + t3);
	        
	        System.out.println("\nMethod: \n" + r[2][1]);
 
	    }
	
}
