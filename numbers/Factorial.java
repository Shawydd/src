package lez04.exs.numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
//		Calcolo del Fattoriale: Scrivere un programma che calcola il fattoriale di un numero intero non negativo inserito dall’utente.
//		Il fattoriale di n (indicato come n!) è il prodotto di tutti i numeri interi positivi fino a n.
		
		int n, fact = 1;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Input an integer to check (greater or equal than 0): ");
			n = scan.nextInt();
		} while (n < 0);
		scan.close();

		for (int i = 0; i < n - 1; i++)
			fact *= n - i;

		System.out.println(n + "! is equal to '" + fact + "'.");

	}

}
