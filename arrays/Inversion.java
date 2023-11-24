package lez04.exs.arrays;

public class Inversion {

	public static void main(String[] args) {

//		Inversione di un Array: Scrivere un programma che inverte l’ordine degli elementi in un array. Per esempio, se l’array iniziale è [1, 2, 3, 4, 5], l’array invertito sarà [5, 4, 3, 2, 1].

		int numbers[] = { -1, 2, 3, 4, 5 };
		int len = numbers.length;

		System.out.print("The new array is: { ");

		for (int i = 0, tempn; i < len / 2; i++) {
			tempn = numbers[i];
			numbers[i] = numbers[len - i - 1];
			numbers[len - i - 1] = tempn;
			System.out.print(numbers[i] + ", ");
		}

		for (int i = len / 2; i < len - 1; i++)
			System.out.print(numbers[i] + ", ");
		System.out.print(numbers[numbers.length - 1] + " }");
	}
}
