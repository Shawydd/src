package lez04.exs.strings;

import java.util.Scanner;

public class CharSub {
	public static void main(String[] args) {
		
//		Sostituzione dei Caratteri: Scrivi un programma che sostituisca tutti gli spazi in una stringa con un carattere specifico, come un trattino (‘-‘).
//		Ad esempio, “Java Programming” diventerebbe “Java-Programming”.
		
		System.out.print("Write something to check: ");
		Scanner scan = new Scanner(System.in);

		String msg = scan.nextLine().replace(' ', '-');
		scan.close();

		System.out.println(msg);
	}
}
