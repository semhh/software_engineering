
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
		foods[0][1] = "Yumurta ve �ekeri rengi a��l�p, k�p�rene kadar ��rp�n. �zerine s�t, kabartma tozu, vanilin, un ve s�v� ya� ekleyip ��rpmaya devam edin.\n" + 
				"Waffle ya da tost makinesini k�zd�r�n ve ya�lay�n. Haz�rlad���n�z har�tan bir kep�e kadar d�k�n.\n" + 
				"Makinan�n kapa��n� kapatt�ktan sonra orta �s�da, aralarda kontrol ederek pi�irme i�lemini ger�ekle�tirin.\n" + 
				"Haz�rlad���n�z waffle kar���m� bitene kadar ayn� i�lemi tekrarlay�n. Renk al�p, d��� ��t�r i�i daha yumu�ak \n" + 
				"k�vamda kalarak pi�en wafflelar� servis taba��na al�n. Nutella,�ilek, kivi ve muz dilimleri ekleyin. Yeme�iniz haz�r";
		foods[1][0] = "Sutlac";
		foods[1][1] = "So�uk s�t ve toz �ekeri geni� bir tencereye al�n. Bir ��rpma teliyle toz �eker eriyene kadar kar��t�rd�ktan sonra oca�a al�n. K�s�k ate�te kaynamaya b�rak�n.\n" +
		        "pirin�leri; ayr� bir tencerede, 2 su barda�� suyu ekleyerek orta ate�te suyunu �ekene kadar ha�lay�n.\n" +
		        "Vanilini toz �eker eri�inde s�te ekleyin.\n" +
		        "Ha�lanan pirin�leri ocaktan al�n ve fazla suyu kald�ysa s�z�n.\n" +
		        "1-2 dakika kadar kaynayan �ekerli s�te ha�lanm�� pirin�leri ilave edin.\n" +
		        "Yumurta sar�s�n�, bu�day ni�astas� ve 1 bardak su ilavesiyle ayr� bir kab�n i�erisine al�n.\n" +
		        "P�r�zs�z bir k�vam alana kadar kar��t�r�n.\n" +
		        "Yumurta sar�s�n�n kesilmemesi i�in; k�s�k ate�te kaynamakta olan s�t kar���m�ndan al�p ni�astal� kar���m� �l��t�r�n.\n" +
		        "Haz�rlad���n�z yumurta sar�l� kar���m� s�tla� tenceresine azar azar kat�p h�zl�ca kar��t�r�n.\n" +
		        "K�vam alan s�tlac�, �s�ya dayan�kl� porsiyonluk g�ve� kaplar�na e�it �l��de bo�alt�n.\n" +
		        "S�tla� kaselerini, derin bir f�r�n tepsisine aral�kl� olarak dizin. Kaplar�n yar�s�na gelecek kadar so�uk suyu, s�tla�lara de�dirmeden tepsiye al�n.\n" +
		        "F�r�na verdi�iniz s�tla�lar�, �nceden �s�t�lm�� 200 derece f�r�nda 12-15 dakika kadar pi�irin.";
		foods[2][0] = "Irmikli Tatli";
		foods[2][1] = "Derin bir kab�n i�erisine yumurtalar� k�r�n. �zerine toz �ekeri ekleyin ve g�zelce ��rp�n.\n" +
		        "Ard�ndan s�t ve s�v� ya�� ekleyerek kar��t�r�n.\n" +
		        "Un, kabartma tozu ve vanilyay� eleyerek ilave edin. Spatula yard�m�yla kar��t�r�n.\n" +
		        "�rmi�i de ekleyerek g�zelce kar��t�r�n. Son olarak limon kabu�u rendesini de ilave edin ve son kez kar��t�r�n.\n" +
		        "Ya�lanm��, unlanm�� orta boy bir borcam�n i�erisine orta incelikte olacak �ekilde kekinizi yay�n.\n" +
		        "�nceden �s�t�lm�� 180 derecelik f�r�nda �zeri g�zelce k�zarana kadar ortalama 25-30 dakika kadar pi�irin.\n" +
		        "Il�k s�t�n i�erisine vanilya ve toz �ekeri ekleyin ve �ekerin i�erisinde erimesini sa�lay�n. S�t�n�z� so�umaya b�rak�n.\n" +
		        "F�r�ndan ald���n�z kekin �zerine b��ak ya da �atal yard�m�yla delikler a��n ve haz�rlad���n�z s�t� �zerine gezdirin. Kekin s�t� �ekmesini bekleyin.\n" +
		        "S�t�n� g�zelce �ektikten buzdolab�na kald�r�n ve 1 saat kadar dinlendirin. ��kar�p �zerini Antep f�st���yla s�sleyerek servis edin.";
		        
		return foods;
	}

}

