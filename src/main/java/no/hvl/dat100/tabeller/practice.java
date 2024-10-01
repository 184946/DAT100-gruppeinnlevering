package no.hvl.dat100.tabeller;

public class practice {
	public static void main(String[] args) {
		int [] tabell = {5,3,2,1,5};
		int sum=0;
		for (int i = 0; i<tabell.length; i++) {
			sum +=tabell[i];
		}
		System.out.println(sum);
	}

}
