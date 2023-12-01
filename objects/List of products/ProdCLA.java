package lez04.exs.objects;

public class ProdCLA {

	private String id;
	private String name;
	private float price;

	public ProdCLA() {

	}

	public ProdCLA(String id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void stampDetails() {
		System.out.println("Product: " + name + ", ID: " + id + ", price: " + price + '.');
	}

}
