package lez04.exs.numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
//		Verifica Numero Pari o Dispari: Scrivi un programma che chiede all’utente di inserire un numero intero e stampa se il numero è pari o dispari.
		
		System.out.print("Input an integer to check: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		// Vanilla

//		if ((n % 2) == 0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");

		// Ternary Operatator

		String EOC = (n % 2) == 0 ? "Even" : "Odd";
		System.out.println(EOC);
	}

}
