package model.pojo;

public class Jeans {

	Integer id;
	String brand;
	String model;
	int size;
	int count;
	double price;
	double priceByCount;
	
	public Jeans(String brand, String model, int size, int count, double price, double priceByCount) {
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.count = count;
		this.price = price;
		this.priceByCount = priceByCount;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPriceByCount(double priceByCount) {
		this.priceByCount = priceByCount;
	}

	public Integer getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public int getCount() {
		return count;
	}

	public double getPrice() {
		return price;
	}

	public double getPriceByCount() {
		return priceByCount;
	}
	
}
