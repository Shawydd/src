package lez04.exs.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
	public static void main(String[] args) {

//		Registro delle Automobili: Definisci una classe Automobile con attributi come marca, modello e anno. 
//		Il tuo programma dovrebbe creare un array di oggetti Automobile e permettere all’utente di inserire dati per ciascuna automobile, stampando poi tutti i dettagli (usa lo Scanner se puoi).

		Scanner scan = new Scanner(System.in);
		ArrayList<CarCLA> cars = new ArrayList<CarCLA>();
		CarCLA tempCC = null;
		String temp;

		while (true) {
			System.out.print("Do you wanna make a new car (y\\n): ");
			temp = scan.nextLine().toUpperCase();
			//ending check
			fatality(scan, cars, temp, tempCC);		
			tempCC = new CarCLA();
			//tempCC assignment
			bdy(tempCC, scan);
			cars.add(tempCC);
		}
	}

	private static void bdy(CarCLA tempCC, Scanner scan) {
		System.out.print("Brand: ");
		tempCC.setBrand(scan.nextLine());
		System.out.print("Model: ");
		tempCC.setModel(scan.nextLine());

		int year;
		while (true) {
			System.out.print("Year (1886+): ");
			year = Integer.parseInt(scan.nextLine());
			if (year >= 1886) {
				tempCC.setYear(year);
				return;
			}
		}
	}

	private static void fatality(Scanner scan, ArrayList<CarCLA> cars, String temp, CarCLA tempCC) {
		if (temp.equals("N")) {
			scan.close();
			temp = null;
			if (cars.size() == 0) {
				System.out.println("Sadly, no cars were made today.");
				System.exit(1);
			} else {
				for (int i = 0, size = cars.size(); i < size; i++) {
					tempCC = cars.get(i);
					System.out.print("Car number " + (i + 1) + ": ");
					tempCC.stampDetails();
				}
				System.exit(0);
			}
		}
	}
}