package lez04.exs.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) {

//		Elenco di Studenti e Voti: Crea una classe Studente con attributi come nome e voto. 
//		Scrivi un programma che crea un array di oggetti Studente, assegna nomi e voti a ciascuno, e poi calcola e stampa la media dei voti degli studenti.

		Scanner scan = new Scanner(System.in);
		ArrayList<StudCLA> studs = new ArrayList<StudCLA>();
		StudCLA tempSC = null;
		String temp;

		while (true) {
			System.out.print("Do you want to add a student (y/n): ");
			temp = scan.nextLine().toUpperCase();
			// ending check
			fatality(scan, studs, temp, tempSC);
			if (temp.equals("Y")) {
				tempSC = new StudCLA();
				// tempSC assignment
				bdy(tempSC, scan);
				studs.add(tempSC);
			}
		}

	}

	private static void bdy(StudCLA tempSC, Scanner scan) {
		System.out.print("Student name: ");
		tempSC.setName(scan.nextLine());

		int vt;
		while (true) {
			System.out.print("Vote (from 0 to 33): ");
			vt = Integer.parseInt(scan.nextLine());
			if (vt >= 0 && vt <= 33) {
				tempSC.setVote(vt);
				return;
			}
		}
	}

	private static void fatality(Scanner scan, ArrayList<StudCLA> studs, String temp, StudCLA tempSC) {
		if (temp.equals("N")) {
			scan.close();
			temp = null;
			if (studs.size() == 0) {
				System.out.println("Your class is empty");
				System.exit(1);
			} else {
				int size = studs.size();
//				for (int i = 0; i < size; i++) {
//					tempSC = studs.get(i);
//					tempSC.stampDetails();
//				}
				float avg = 0f;
				for (int i = 0; i < size; i++)
					avg += studs.get(i).getVote();
				System.out.println("Class average is " + (avg / size) + '.');
				System.exit(0);
			}
		}
	}
}
