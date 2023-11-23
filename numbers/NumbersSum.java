package lez04.exs.numbers;

import java.util.Scanner;

public class NumbersSum {
	public static void main(String[] args) {
		
//		Calcolo della Somma dei Numeri: Scrivere un programma che legge cinque numeri interi dall’utente e stampa la loro somma.
		
		int n = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Insert your " + (i + 1) + "° digit: ");
			n += scan.nextInt();
		}
		
		scan.close();
		System.out.println("The sum of your 5 digits is " + n + '.');
	}
}
