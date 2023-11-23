package lez04.exs.numbers;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {

//		Verifica Numero Primo: Scrivere un programma che legge un numero intero e verifica se è primo o no.
//		Un numero primo è un numero maggiore di 1 che ha solo due divisori: 1 e se stesso.

		int n;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Input an integer greater than 0: ");
			n = scan.nextInt();
		} while (n < 1);
		scan.close();

		if (priche(n))
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");
	}

	private static boolean priche(int n) {
		if (n < 4)
			return true;

		else if ((n % 2) == 0)
			return false;

		else
			for (int i = 3; i < n / 2; i += 2)
				if ((n % i) == 0)
					return false;

		return true;
	}
}
