package lez04.exs.objects;

public class CarCLA {
	
	public CarCLA(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public CarCLA() {

	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void stampDetails() {
		System.out.println("Brand: " + brand + ", model: " + model + ", year: " + year + '.');
	}
	
	private String brand;
	private String model;
	private int year;
	
}
