package lez04.exs.strings;

import java.util.Scanner;

public class StringInv {
	public static void main(String[] args) {
		
//		Inversione di una Stringa: Scrivi un programma che legga una stringa e stampi la sua inversione. Ad esempio, se l’input è “Java”, l’output dovrebbe essere “avaJ”.
		
		System.out.print("Write something to invert: ");
		Scanner scan = new Scanner(System.in);
		String toinv = scan.nextLine();
		scan.close();

		for (int i = 0, len = toinv.length(); i < len; i++)
			System.out.print(toinv.charAt(len - i - 1));
	}
}
