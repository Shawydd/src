package lez04.exs.strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

//		Verifica Palindromo: Crea un esercizio in cui gli studenti devono scrivere un programma che determini se una stringa è un palindromo.
//		Una parola si dice palindroma laddove si legga allo stesso modo in entrambe le direzioni, come “radar” o “anna”.

		System.out.print("Input the string to check: ");
		Scanner scan = new Scanner(System.in);
		String pal = scan.nextLine();
		scan.close();
		String tempal = pal.toUpperCase();
		
		if (evod(scan, tempal))
			System.out.println(pal + " is a palindrome.");
		else
			System.out.println(pal + " is not a palindrome.");
		tempal = null;
	}

	private static boolean evod(Scanner scan, String tempal) {
		int len = tempal.length();
		if (len % 2 == 0)
			for (int i = len / 2, k = 1; i < len; i++, k += 2) {
				if (tempal.charAt(i) != tempal.charAt(i - k))
					return false;
			}
		else
			for (int i = len / 2, k = 1, l = (len / 2) + 1; l < len; k++, l++)
				if (tempal.charAt(i - k) != tempal.charAt(i + k))
					return false;
		return true;
	}
}