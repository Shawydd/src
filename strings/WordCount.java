package lez04.exs.strings;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {

//		Conteggio delle Parole: Scrivere un programma che conti il numero di parole in una frase inserita dall’utente.
//		Ad esempio, per l’input “Java è divertente”, il programma dovrebbe rilevare 3 parole.

		System.out.print("Write something: ");
		Scanner scan = new Scanner(System.in);
		String input = simche(scan);
		scan.close();

		int counter = input.split(" ").length;

//		for (int i = 0, len = input.length(); i < len; i++)
//			if (input.charAt(i) == ' ')
//				counter++;

		if (counter == 1)
			System.out.println("There is only 1 word in your input.");
		else
			System.out.println("There are " + counter + " words in your input.");
	}

	private static String simche(Scanner scan) {
		String input;
		while (true) {
			input = scan.nextLine();
			if (!input.isBlank())
				return input;
			System.out.print("Write something valid: ");
		}
	}
}
