package lez04.exs.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
	public static void main(String[] args) {

//		Catalogo di Prodotti: Crea una classe Prodotto con attributi come codice, nome e prezzo. 
//		Il programma deve gestire un array di Prodotto, consentendo all’utente di aggiungere prodotti all’array e di stampare dettagli di tutti i prodotti presenti.

		Scanner scan = new Scanner(System.in);
		ArrayList<ProdCLA> prods = new ArrayList<ProdCLA>();
		ProdCLA tempPC = null;
		String temp;

		while (true) {
			System.out.print("Do you want to add a product (y/n): ");
			temp = scan.nextLine().toUpperCase();
			// ending check
			fatality(scan, prods, temp, tempPC);
			if (temp.equals("Y")) {
				tempPC = new ProdCLA();
				// tempPC assignment
				bdy(tempPC, scan);
				prods.add(tempPC);
			}
		}
	}

	private static void bdy(ProdCLA tempPC, Scanner scan) {
		System.out.print("Product name: ");
		tempPC.setName(scan.nextLine());
		System.out.print("ID: ");
		tempPC.setId(scan.nextLine());
		float price;
		do {
			System.out.print("Price: ");
			price = Float.parseFloat(scan.nextLine());
		} while (price < 0);
		tempPC.setPrice(price);
	}

	private static void fatality(Scanner scan, ArrayList<ProdCLA> prods, String temp, ProdCLA tempPC) {
		if (temp.equals("N")) {
			scan.close();
			temp = null;
			if (prods.size() == 0) {
				System.out.println("Hey! You did nothing!");
				System.exit(1);
			} else {
				for (int i = 0, size = prods.size(); i < size; i++) {
					tempPC = prods.get(i);
					tempPC.stampDetails();
				}
				System.exit(0);
			}
		}
	}
}