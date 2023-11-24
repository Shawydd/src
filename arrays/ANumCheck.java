package lez04.exs.arrays;

import java.util.Scanner;

public class ANumCheck {
	public static void main(String[] args) {

//		Verifica Elemento nell’Array: Scrivere un programma che controlla se un determinato elemento è presente in un array.
//		Ad esempio, data una lista di numeri e un numero da cercare, il programma dovrebbe stampare se il numero è presente o meno.

		int numbers[] = { -1, 2, 5, 7, -28 };
		System.out.println("What number will be in my list? Try your luck!");
		System.out.print("Input your guess: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		for (int i = 0, len = numbers.length; i < len; i++)
			if (numbers[i] == n) {
				System.out.println("Gotcha! '" + n + "' is in my list!");
				System.exit(0);
			}
		System.out.println("Bad luck! '" + n + "' is not in my list!");
	}
}
