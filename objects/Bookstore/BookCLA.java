package lez04.exs.objects;

public class BookCLA {

	public BookCLA(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	private String title;
	private String author;

	public void stampDetails() {
		System.out.println("The book '" + title + "' was written by " + author + '.');
	}

}
