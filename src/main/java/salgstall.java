package book;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class salgstall {
	public static void main(String[] args) {

		final int ANT_AVD = 4;
		int[] salgsTall = new int[ANT_AVD];
		lesInn(salgsTall);

		int sumSalg = beregnSum(salgsTall);
		int gjennomsnitt = sumSalg/ANT_AVD;
		System.out.println(gjennomsnitt);
		String underSnitt = svakeAvd(salgsTall,gjennomsnitt);
		
		showMessageDialog(null, "Samlet salg: " + sumSalg + "\n" + "Snittsalg pr. avd: " + gjennomsnitt + "\n" + "Avdelinger under snittet: " + underSnitt);

	}

	
	
	
	public static int[] lesInn(int[] tabell) {
		for (int i = 1; i <= tabell.length; i++) {
			tabell[i - 1] = parseInt(showInputDialog("Avdeling: " + i + "\n" + "Salgstall: "));
		} return tabell;
	}

	
	
	
	
	public static int beregnSum(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];

		}
		return sum;
	}

	
	
	
	
	
	public static String svakeAvd(int[] salgstall, int snittsalg) {
		String avdTxt="";
		for (int i=0; i<salgstall.length;i++) {
			if (snittsalg>salgstall[i]) {
				avdTxt += i + ", ";
			}
		} return avdTxt;

	}

}
