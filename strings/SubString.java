package lez04.exs.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {

//		Ricerca di Sottostringhe: Scrivere un programma che cerchi una sottostringa all’interno di una stringa data e stampi la posizione di inizio di quella sottostringa.
//		Se la sottostringa non è presente, il programma dovrebbe stampare un messaggio appropriato.

		Scanner scan = new Scanner(System.in);
		System.out.print("Input your substring: ");
		String sus = simche(scan);
		String tempsus = sus.toUpperCase();
		int lens = tempsus.length();

		System.out.print("Input a string: ");
		String stg = scan.nextLine();
		scan.close();
		String tempstg = stg.toUpperCase();

		ArrayList<Integer> chance = new ArrayList<Integer>();
		for (int i = 0, leng = tempstg.length(); i < leng; i++)
			if (tempsus.charAt(0) == tempstg.charAt(i))
				if (poscheck(i, lens, tempsus, tempstg))
					chance.add(i);

		tempsus = null;
		tempstg = null;
		chances(sus, stg, chance);
	}

	private static void chances(String sus, String stg, ArrayList<Integer> chance) {
		int size = chance.size();
		if (size < 1)
			System.out.println("Your substring '" + sus + "' is not in '" + stg + "'.");
		else if (size == 1)
			System.out.println("Your substring '" + sus + "' is in position '" + (chance.get(0) + 1) + "'.");
		else {
			System.out.print("Your substring '" + sus + "' is in positions: ");
			for (int i = 0, j = 0; i < size - 1; i++) {
				j = chance.get(i) + 1;
				System.out.print(j + ", ");
			}
			System.out.print("and " + (chance.get(size - 1) + 1) + " in '" + stg + "'.");
		}
	}

	private static boolean poscheck(int i, int lens, String tempsus, String tempstg) {
		for (int j = 1; j < lens; j++)
			if (tempsus.charAt(j) != tempstg.charAt(i + j))
				return false;
		return true;
	}

	private static String simche(Scanner scan) {
		String sus;
		while (true) {
			sus = scan.nextLine();
			if (!sus.isEmpty())
				return sus;
			System.out.print("Input a valid substring: ");
		}
	}
}
