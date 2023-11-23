package lez04.exs.strings;

import java.util.Scanner;

public class VowAndCons {

	public static void main(String[] args) {
		
//		Conteggio delle Vocali e Consonanti: Scrivi un programma che legga una stringa dall’utente e stampi il numero di vocali e consonanti presenti nella stringa.
//		Ad esempio, per la stringa “Hello World”, il programma dovrebbe stampare il numero di vocali: 3 e il numero di consonanti: 7.
		
		System.out.print("Write something to check: ");
		Scanner scan = new Scanner(System.in);
		String vsc = scan.nextLine().toUpperCase();
		scan.close();
		
		int vow = 0, cons = 0;
		for (int i = 0, len = vsc.length(); i < len; i++) {
			if (Character.isLetter(vsc.charAt(i))) {
				if (vsc.charAt(i) == 'A' || vsc.charAt(i) == 'E' || vsc.charAt(i) == 'I' || vsc.charAt(i) == 'O'
						|| vsc.charAt(i) == 'U')
					vow++;
				else
					cons++;
			}

//			if (vsc.charAt(i) == 'A' || vsc.charAt(i) == 'E' || vsc.charAt(i) == 'I' || vsc.charAt(i) == 'O' || vsc.charAt(i) == 'U')
//				voc++;
//			else if (vsc.charAt(i) >= 'B' && vsc.charAt(i) <= 'Z')
//				cons++;	

		}
		System.out.println("There are " + vow + " vowels and " + cons + " consonants.");
	}
}
