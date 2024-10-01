package no.hvl.dat100.tabeller;

import java.lang.String.*;

public class Tabeller {
	

	// a)
	public static void skrivUt(int[] tabell) {
		
        System.out.print("[");
		for (int i=0; tabell.length>i; i++) {
			System.out.print(tabell[i]);
			
			if (i<tabell.length-1) {
				System.out.print(", ");
			}
			
		}
		System.out.print("]");
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst="[";
		for (int i =0; i<tabell.length;i++) {
			tekst+=tabell[i];
			if (i<tabell.length-1) {
				tekst +=",";
			}
			
		} tekst +="]";
		return tekst;
		

		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;

		for (int i = 0; i<tabell.length; i++) {
			sum+=tabell[i];
			
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finst = false;
		
		for (int i =0; i<tabell.length; i++) {
			if (tall==tabell[i]) {
				finst=true;
				
			}
		} return finst;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		for (int i =0; i<tabell.length; i++) {
			
			if (tall==tabell[i]) {
				return i;
				
				
			}
		} return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] nyTabell = new int[tabell.length];
		
		for (int i =0; i<tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length-1-i];
		}
		return nyTabell;
		
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i=0; i<tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				sortert=false;
				
			}
			
		} return sortert;

		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int lengdeTabell = tabell1.length + tabell2.length;
		int[] nyTabell = new int[lengdeTabell];
		
		for (int i=0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}

			
		return nyTabell;

	}
}
