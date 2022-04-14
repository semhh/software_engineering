
public class Refactored {

	static int maxFood = 3;	
	static int column = 2;
	static int waffleIncredientsCount = 11;
	static int sutlacIncredientsCount = 7;
	static int irmikIncredientsCount = 9;
	static int incredientsColumn = 2;
	static int waffleAmountsCount = 11;
	static int sutlacAmountsCount = 7;
	static int irmikAmountsCount = 9;
	
	public static void main(String[] args) {
		System.out.println("Refactored code output:");
		System.out.println("----------------------\n");
		refactoredCodeTest();
	}
		
	static void refactoredCodeTest(){
	        
	        String[][] foods = recipes();
	        
	        String[][] incredientsWaffle = incredientsWaffle();
	        String[][] incredientsSutlac = incredientsSutlac();
	        String[][] incredientsIrmik = incredientsIrmik();
	        
	        int[] waffleAmounts = waffleAmounts();
	        int[] sutlacAmounts = sutlacAmounts();
	        int[] irmikAmounts = irmikAmounts();
	        
	        for(int i = 0; i < foods.length; i++) {
	        	
	        	int k = 0;
	        	
	        	System.out.println((i+1) + ") " + foods[i][k] + "\n");
	        	
	        	int length = 11;
	        	
	        	double totalCal = 0;
	        	
	        	if(i == 0) {
	        		length = waffleIncredientsCount;	
		
	        		totalCal = printing(incredientsWaffle, waffleAmounts, k, length, totalCal);
	        	}
	        	else if(i == 1) {
	        		length = sutlacIncredientsCount;
	        		
	        		totalCal = printing(incredientsSutlac, sutlacAmounts, k, length, totalCal);	
	        	}
	        	else if(i == 2) {
	        		length = irmikIncredientsCount;
	        		
	        		totalCal = printing(incredientsIrmik, irmikAmounts, k, length, totalCal);	
	        	} 
	        	System.out.println("Total Kalori: " + totalCal);
	        	System.out.println("\nMethod: \n" + foods[i][k+1] + "\n");
	        }	
	    }

	public static double printing(String[][] incredientsWaffle, int[] waffleAmounts, int k, int length,
			double totalCal) {
		double cal;
		for(int j = 0; j < length; j++) {
			
			cal = waffleAmounts[j] * Double.parseDouble(incredientsWaffle[j][k+1]);
			totalCal += cal;
			
			System.out.println(waffleAmounts[j] + " " + incredientsWaffle[j][k] + "\t\t\t" + cal + " cal");		  
		}
		return totalCal;
	}
	
	public static String[][] incredientsWaffle() {
		
		String[][] incredientsWaffle = new String[waffleIncredientsCount][incredientsColumn];  
		
		incredientsWaffle[0][0] = "Gr Seker";
		incredientsWaffle[0][1] = "4";
		incredientsWaffle[1][0] = "mL Sivi Yag";
		incredientsWaffle[1][1] = "8";
		incredientsWaffle[2][0] = "Gr Un";
		incredientsWaffle[2][1] = "3.6";
		incredientsWaffle[3][0] = "Adet Yumurta";
		incredientsWaffle[3][1] = "93";
		incredientsWaffle[4][0] = "Gr KabartmaT.";
		incredientsWaffle[4][1] = "0.5";
		incredientsWaffle[5][0] = "Adet Vanilin";
		incredientsWaffle[5][1] = "144";
		incredientsWaffle[6][0] = "mL Sut";
		incredientsWaffle[6][1] = "0.6";
		incredientsWaffle[7][0] = "Adet Cilek";
		incredientsWaffle[7][1] = "5";
		incredientsWaffle[8][0] = "Adet Kivi";
		incredientsWaffle[8][1] = "36";
		incredientsWaffle[9][0] = "Adet Muz";
		incredientsWaffle[9][1] = "105";
		incredientsWaffle[10][0] = "Adet Nutella";
		incredientsWaffle[10][1] = "2720";
		
		return incredientsWaffle;
	}
	
	public static String[][] incredientsSutlac() {
		
		String[][] incredientsSutlac = new String[sutlacIncredientsCount][incredientsColumn];        
		incredientsSutlac[0][0] = "Gr Seker";
		incredientsSutlac[0][1] = "4";
		incredientsSutlac[1][0] = "Gr Nisasta";
		incredientsSutlac[1][1] = "3.5";
		incredientsSutlac[2][0] = "Adet Yumurta";
		incredientsSutlac[2][1] = "93";
		incredientsSutlac[3][0] = "Adet Vanilin";
		incredientsSutlac[3][1] = "144";
		incredientsSutlac[4][0] = "Litre Sut";
		incredientsSutlac[4][1] = "0.6";
		incredientsSutlac[5][0] = "Gr Pirinc";
		incredientsSutlac[5][1] = "0.1";
		incredientsSutlac[6][0] = "mL Su";
		incredientsSutlac[6][1] = "0";

		return incredientsSutlac;
	}

	public static String[][] incredientsIrmik() {
		
		String[][] incredientsIrmik = new String[irmikIncredientsCount][incredientsColumn];    
		incredientsIrmik[0][0] = "Gr Seker";
		incredientsIrmik[0][1] = "4";
		incredientsIrmik[1][0] = "mL Sivi Yag";
		incredientsIrmik[1][1] = "8";
		incredientsIrmik[2][0] = "Gr Un";
		incredientsIrmik[2][1] = "3.6";
		incredientsIrmik[3][0] = "Adet Yumurta";
		incredientsIrmik[3][1] = "93";
		incredientsIrmik[4][0] = "Gr KabartmaT.";
		incredientsIrmik[4][1] = "0.5";
		incredientsIrmik[5][0] = "Adet Vanilin";
		incredientsIrmik[5][1] = "144";
		incredientsIrmik[6][0] = "mL Sut";
		incredientsIrmik[6][1] = "0.6";
		incredientsIrmik[7][0] = "Gr Irmik";
		incredientsIrmik[7][1] = "3.5";
		incredientsIrmik[8][0] = "Gr Limon Ka.";
		incredientsIrmik[8][1] = "0.4";	
		

		
		return incredientsIrmik;
	}

	public static int[] waffleAmounts() {

		int[] amounts = new int[waffleAmountsCount];
		amounts[0] = 37;
		amounts[1] = 43;		
		amounts[2] = 210;	
		amounts[3] = 1;
		amounts[4] = 4;
		amounts[5] = 1;
		amounts[6] = 200;
		amounts[7] = 6;
		amounts[8] = 1;
		amounts[9] = 2;
		amounts[10] = 1;
		
		return amounts;
	}
	
	public static int[] sutlacAmounts() {

		int[] amounts = new int[sutlacAmountsCount];
		amounts[0] = 200;
		amounts[1] = 16;		
		amounts[2] = 1;	
		amounts[3] = 1;
		amounts[4] = 2;
		amounts[5] = 70;
		amounts[6] = 600;
		
		return amounts;
	}
	
	public static int[] irmikAmounts() {

		int[] amounts = new int[irmikAmountsCount];
		amounts[0] = 78;
		amounts[1] = 129;		
		amounts[2] = 280;	
		amounts[3] = 3;
		amounts[4] = 9;
		amounts[5] = 1;
		amounts[6] = 100;
		amounts[7] = 40;
		amounts[8] = 5;
		
		return amounts;
	}
	
	public static String[][] recipes() {
		
		String[][] foods = new String[maxFood][column];
		
		foods[0][0] = "Waffle";
		foods[0][1] = "Yumurta ve þekeri rengi açýlýp, köpürene kadar çýrpýn. Üzerine süt, kabartma tozu, vanilin, un ve sývý yað ekleyip çýrpmaya devam edin.\n" + 
				"Waffle ya da tost makinesini kýzdýrýn ve yaðlayýn. Hazýrladýðýnýz harçtan bir kepçe kadar dökün.\n" + 
				"Makinanýn kapaðýný kapattýktan sonra orta ýsýda, aralarda kontrol ederek piþirme iþlemini gerçekleþtirin.\n" + 
				"Hazýrladýðýnýz waffle karýþýmý bitene kadar ayný iþlemi tekrarlayýn. Renk alýp, dýþý çýtýr içi daha yumuþak \n" + 
				"kývamda kalarak piþen wafflelarý servis tabaðýna alýn. Nutella,çilek, kivi ve muz dilimleri ekleyin. Yemeðiniz hazýr";
		foods[1][0] = "Sutlac";
		foods[1][1] = "Soðuk süt ve toz þekeri geniþ bir tencereye alýn. Bir çýrpma teliyle toz þeker eriyene kadar karýþtýrdýktan sonra ocaða alýn. Kýsýk ateþte kaynamaya býrakýn.\n" +
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
		foods[2][0] = "Irmikli Tatli";
		foods[2][1] = "Derin bir kabýn içerisine yumurtalarý kýrýn. Üzerine toz þekeri ekleyin ve güzelce çýrpýn.\n" +
		        "Ardýndan süt ve sývý yaðý ekleyerek karýþtýrýn.\n" +
		        "Un, kabartma tozu ve vanilyayý eleyerek ilave edin. Spatula yardýmýyla karýþtýrýn.\n" +
		        "Ýrmiði de ekleyerek güzelce karýþtýrýn. Son olarak limon kabuðu rendesini de ilave edin ve son kez karýþtýrýn.\n" +
		        "Yaðlanmýþ, unlanmýþ orta boy bir borcamýn içerisine orta incelikte olacak þekilde kekinizi yayýn.\n" +
		        "Önceden ýsýtýlmýþ 180 derecelik fýrýnda üzeri güzelce kýzarana kadar ortalama 25-30 dakika kadar piþirin.\n" +
		        "Ilýk sütün içerisine vanilya ve toz þekeri ekleyin ve þekerin içerisinde erimesini saðlayýn. Sütünüzü soðumaya býrakýn.\n" +
		        "Fýrýndan aldýðýnýz kekin üzerine býçak ya da çatal yardýmýyla delikler açýn ve hazýrladýðýnýz sütü üzerine gezdirin. Kekin sütü çekmesini bekleyin.\n" +
		        "Sütünü güzelce çektikten buzdolabýna kaldýrýn ve 1 saat kadar dinlendirin. Çýkarýp üzerini Antep fýstýðýyla süsleyerek servis edin.";
		        
		return foods;
	}

}

