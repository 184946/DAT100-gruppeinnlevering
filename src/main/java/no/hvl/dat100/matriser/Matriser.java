package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad:matrise) {
			for (int verdi:rad) {
				System.out.print(verdi + ", ");
				
				
			}
			
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String txt="";
	

		for (int[] rad:matrise) {
			
			for (int verdi:rad) {
				txt +=verdi +" ";
			} txt += "\n";
					
		}
		
		return txt;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		
		int [][] nyTabell = new int[matrise.length][matrise[0].length];
		
		for (int i=0; i<matrise.length;i++) {
			for (int j=0; j<matrise[0].length;j++) {
				nyTabell[i][j] = matrise[i][j] *2;
			}
		}
		return nyTabell;
		
		
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erDenLik = true;
		
		if(a.length!=b.length) {
			return false;
		}
		
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
					
				}
			}
		}
		return erDenLik;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
