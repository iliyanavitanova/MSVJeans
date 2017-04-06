package model.pojo;

import java.util.Map;

public interface IJeansManager {
	
	void addJeans(String brand, String model, int size, int count, double price, double priceByCount);

	void deleteJeans(String brand, String model, int size, int count, double price, double priceByCount);

	void sellJeans(Jeans jeans);
	
	void changeJeans(Jeans jeans);
	
	Jeans getJeans(int id);
	
	Map<Integer, Jeans> getAllJeans();
}
