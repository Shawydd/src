package lez04.exs.numbers;

import java.util.Random;
import java.util.Scanner;

public class RNG {
	public static void main(String[] args) {
		
//		Generatore di Numeri Casuali: Scrivere un programma che genera un numero casuale tra 1 e 100 e chiede all’utente di indovinarlo.
//		Il programma dovrebbe dare suggerimenti se il numero indovinato è troppo alto o troppo basso.
		
		Random rand = new Random();
		byte ub = 101;
		int n, ratoche = rand.nextInt(ub); 	// The range starts from 0 to the upperbound value - 1
		System.out.print("Guess my number (range 0 - 100): ");
		Scanner scan = new Scanner(System.in);

		while (true) {
			n = scan.nextInt();
			if (n > 100 || n < 0)
				System.out.println("Are you stupid? I said the range is 0 - 100... ");
			else if (ratoche < n)
				System.out.println("Too high!");
			else if (ratoche > n)
				System.out.println("Too low!");
			else {
				scan.close();
				System.out.println("Gotcha! My number is indeed " + ratoche + '!');
				System.exit(0);
			}
			System.out.print("Try again: ");
		}
	}
}

//		Generating random using nextFloat
//		in 0.0 and 1.0 range

//		float float_random = rand.nextFloat();

// 		Generating random using nextDouble
//		in 0.0 and 1.0 range

//		double double_random = rand.nextDouble();

//		System.out.println("Random integer value from 0 to" + (ub - 1) + " : " + ratoche);
//		System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
//		System.out.println("Random double value between 0.0 and 1.0 : " + double_random);
