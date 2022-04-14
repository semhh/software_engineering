//Semih KARACAO�LU	17050111008
//Muhammed Said POLAT	18050111009

public class Unrefactored {
	
	public static void main(String[] args) {
		System.out.println("Sphagetti code output:");
		System.out.println("----------------------\n");
		unrefactoredCodeTest();
	}
		
	static void unrefactoredCodeTest(){
	        
		//Anlams�z variable isimleri de�i�ecek
		String[][] r = new String[3][2];
		
		r[0][0] = "Waffle";
		r[0][1] = "Yumurta ve �ekeri rengi a��l�p, k�p�rene kadar ��rp�n. �zerine s�t, kabartma tozu, vanilin, un ve s�v� ya� ekleyip ��rpmaya devam edin.\n" + 
				"Waffle ya da tost makinesini k�zd�r�n ve ya�lay�n. Haz�rlad���n�z har�tan bir kep�e kadar d�k�n.\n" + 
				"Makinan�n kapa��n� kapatt�ktan sonra orta �s�da, aralarda kontrol ederek pi�irme i�lemini ger�ekle�tirin.\n" + 
				"Haz�rlad���n�z waffle kar���m� bitene kadar ayn� i�lemi tekrarlay�n. Renk al�p, d��� ��t�r i�i daha yumu�ak \n" + 
				"k�vamda kalarak pi�en wafflelar� servis taba��na al�n. Nutella,�ilek, kivi ve muz dilimleri ekleyin. Yeme�iniz haz�r";
		r[1][0] = "Sutlac";
		r[1][1] = "So�uk s�t ve toz �ekeri geni� bir tencereye al�n. Bir ��rpma teliyle toz �eker eriyene kadar kar��t�rd�ktan sonra oca�a al�n. K�s�k ate�te kaynamaya b�rak�n.\n" +
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
		r[2][0] = "Irmikli Tatli";
		r[2][1] = "Derin bir kab�n i�erisine yumurtalar� k�r�n. �zerine toz �ekeri ekleyin ve g�zelce ��rp�n.\n" +
		        "Ard�ndan s�t ve s�v� ya�� ekleyerek kar��t�r�n.\n" +
		        "Un, kabartma tozu ve vanilyay� eleyerek ilave edin. Spatula yard�m�yla kar��t�r�n.\n" +
		        "�rmi�i de ekleyerek g�zelce kar��t�r�n. Son olarak limon kabu�u rendesini de ilave edin ve son kez kar��t�r�n.\n" +
		        "Ya�lanm��, unlanm�� orta boy bir borcam�n i�erisine orta incelikte olacak �ekilde kekinizi yay�n.\n" +
		        "�nceden �s�t�lm�� 180 derecelik f�r�nda �zeri g�zelce k�zarana kadar ortalama 25-30 dakika kadar pi�irin.\n" +
		        "Il�k s�t�n i�erisine vanilya ve toz �ekeri ekleyin ve �ekerin i�erisinde erimesini sa�lay�n. S�t�n�z� so�umaya b�rak�n.\n" +
		        "F�r�ndan ald���n�z kekin �zerine b��ak ya da �atal yard�m�yla delikler a��n ve haz�rlad���n�z s�t� �zerine gezdirin. Kekin s�t� �ekmesini bekleyin.\n" +
		        "S�t�n� g�zelce �ektikten buzdolab�na kald�r�n ve 1 saat kadar dinlendirin. ��kar�p �zerini Antep f�st���yla s�sleyerek servis edin.";
		            
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
	             
	        //��kt� yazd�rma k�sm� if ve for fonksiyonlar� kullan�larak k�salt�lacak.
	        
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
