package lez04.exs.objects;

public class Bookstore {
	public static void main(String[] args) {

//		Gestione di un Negozio di Libri: Crea una classe Libro con attributi come titolo e autore.
//		Poi, scrivi un programma che crea un array di oggetti Libro e stampa i dettagli di ogni libro.
//		Ad esempio, un array potrebbe contenere libri come “Il Signore degli Anelli” di J.R.R. Tolkien e “1984” di George Orwell.

		BookCLA tiau[] = new BookCLA[2];
		tiau[0] = new BookCLA("The Lord of the Rings", "J.R.R. Tolkien");
		tiau[1] = new BookCLA("1984", "George Orwell");

		for (int i = 0, len = tiau.length; i < len; i++)
			tiau[i].stampDetails();
	}
}
