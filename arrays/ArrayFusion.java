package lez04.exs.arrays;

public class ArrayFusion {
	public static void main(String[] args) {

//		Fusione di Due Array: Scrivere un programma che unisce due array di numeri interi in un unico array.
//		Ad esempio, dati gli array [1, 2, 3] e [4, 5, 6], l’array risultante dovrebbe essere [1, 2, 3, 4, 5, 6].

		int m[] = { 1, 2, 3 };
		int n[] = { 4, 5, 6 };

		int mlen = m.length;
		int nlen = n.length;

		int l[] = new int[mlen + nlen];

		System.arraycopy(m, 0, l, 0, mlen);
		System.arraycopy(n, 0, l, mlen, nlen);

		System.out.print("Resulting array: { ");
		for (int i = 0, len = l.length; i < len - 1; i++)
			System.out.print(l[i] + ", ");
		System.out.print(l[l.length - 1] + " }");
	}
}
