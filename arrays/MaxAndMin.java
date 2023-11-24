package lez04.exs.arrays;

public class MaxAndMin {

	public static void main(String[] args) {

//		Ricerca del Massimo e del Minimo: Scrivi un programma che inizializza un array di numeri interi e trova il valore massimo e minimo nell’array.
//		Ad esempio, per l’array [1, 2, 3, 4, 5], il programma dovrebbe stampare il massimo: 5 e il minimo: 1.

		int numbers[] = { -1, 2, 28, 4, 5 };
		int MAX = numbers[0], min = numbers[0];

		for (int i = 1, len = numbers.length; i < len; i++) {
			if (numbers[i] > MAX)
				MAX = numbers[i];
			else if (numbers[i] < min)
				min = numbers[i];
		}
		System.out.println("Max is " + MAX + ", min is " + min + '.');
	}
}
