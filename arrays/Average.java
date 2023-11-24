package lez04.exs.arrays;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
//		Calcolo della Media: Scrivere un programma che calcola la media dei valori presenti in un array di numeri. Ad esempio, per l’array [1, 2, 3, 4, 5], la media è 3.
		
		float n, av = 0f;
		int numbers[] = new int[5];
		System.out.println("Input 5 numbers and i will give you the average of them!");
		Scanner scan = new Scanner(System.in);

		for (int i = 0, len = numbers.length; i < len; i++) {
			System.out.print("Input the " + (i + 1) + "° number: ");
			n = scan.nextFloat();
			av += n;
		}
		
		scan.close();
		System.out.println("The average of your inputs is " + (av / numbers.length) + '.');
	}
}
