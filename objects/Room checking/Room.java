package lez04.exs.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	public static void main(String[] args) {

//		Sistema di Prenotazione Alberghiera: Definisci una classe Camera con attributi come numero della camera e stato (libera/occupata). 
//		Il programma dovrebbe creare un array di Camera e permettere all’utente di “prenotare” o “liberare” una camera, aggiornando lo stato di conseguenza.

		Scanner scan = new Scanner(System.in);
		ArrayList<RoomCLA> staromn = new ArrayList<RoomCLA>();
		RoomCLA tempRC = null;
		String temp;
		int size = 0;

		while (true) {

			System.out.print("Do you want to add a room (y\\n): ");
			temp = scan.nextLine().toUpperCase();
			// ending check
			fatality(size, scan, staromn, temp);
			if (temp.equals("Y")) {
				tempRC = new RoomCLA();
				// tempSC assignment
				bdy(size, scan, staromn, temp, tempRC);
				staromn.add(tempRC);
				size++;
			}

		}

	}

	private static boolean alurn(int size, Scanner scan, int tempn, ArrayList<RoomCLA> staromn) {
		for (int i = 0; i < size; i++)
			if (tempn == staromn.get(i).getRoomn())
				return false;
		return true;
	}

	private static void bdy(int size, Scanner scan, ArrayList<RoomCLA> staromn, String temp, RoomCLA tempRC) {
		System.out.print("Room number: ");
		tempRC.setRoomn(urn(size, scan, staromn));
		do {
			System.out.print("Room status (input f for free or b for busy): ");
			temp = scan.nextLine().toUpperCase();
		} while (!temp.equals("F") && !temp.equals("B"));
		if (temp.equals("F"))
			tempRC.setStatus("free");
		else
			tempRC.setStatus("busy");
	}

	private static void fatality(int size, Scanner scan, ArrayList<RoomCLA> staromn, String temp) {
		if (temp.equals("N")) {
			if (staromn.size() == 0) {
				System.out.println("Buy an hotel with rooms next time.");
				System.exit(1);
			}
			roomchanger(size, scan, staromn, temp);
		}
	}

	private static void roomchanger(int size, Scanner scan, ArrayList<RoomCLA> staromn, String temp) {
		while (true) {
			System.out.println("Rooms situation: ");
			for (int i = 0; i < size; i++)
				System.out.println("Room '" + staromn.get(i).getRoomn() + "' is " + staromn.get(i).getStatus() + '.');
			do {
				System.out.println("Do you want to change the status of a room (y\\n): ");
				temp = scan.nextLine().toUpperCase();
			} while (!temp.equals("Y") && !temp.equals("N"));
			if (temp.equals("Y")) {
				temp = roomchecker(size, scan, staromn);
				for (int i = 0, tempn = Integer.parseInt(temp); i < size; i++) {
					if (tempn == staromn.get(i).getRoomn()) {
						if (staromn.get(i).getStatus().equals("free"))
							staromn.get(i).setStatus("busy");
						else
							staromn.get(i).setStatus("free");
					}
				}
			} else {
				scan.close();
				temp = null;
				System.out.println("Have a good day.");
				System.exit(0);
			}
		}
	}

	private static String roomchecker(int size, Scanner scan, ArrayList<RoomCLA> staromn) {
		int tempn;
		System.out.print("Select the room you want to free/occupy: ");
		while (true) {
			tempn = Integer.parseInt(scan.nextLine());
			for (int i = 0; i < size; i++)
				if (tempn == staromn.get(i).getRoomn())
					return String.valueOf(tempn);
			System.out.print("Invalid room. Please try again: ");
		}
	}

	private static int urn(int size, Scanner scan, ArrayList<RoomCLA> staromn) {
		int tempn;
		while (true) {
			tempn = Integer.parseInt(scan.nextLine());
			if (alurn(size, scan, tempn, staromn))
				return tempn;
			System.out.print("This room already exists, please try again: ");
		}
	}
}