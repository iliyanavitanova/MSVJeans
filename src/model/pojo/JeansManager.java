package model.pojo;

import java.util.Map;
import java.util.TreeMap;

import model.db.JeansDAO;

public class JeansManager implements IJeansManager {
	private static JeansManager instance;
	private TreeMap<Integer, Jeans> allJeans=new TreeMap<Integer, Jeans>();

	public JeansManager() {
		allJeans = (TreeMap<Integer, Jeans>) JeansDAO.getInstance().allJeans();
	}
	
	public synchronized static JeansManager getInstance() {
		if (instance == null) {
			instance = new JeansManager();
		}
		return instance;
	}

	@Override
	public void addJeans(String brand, String model, int size, int count, double price, double priceByCount) {
		Jeans jeans = new Jeans(brand, model, size, count, price, priceByCount);
		JeansDAO.getInstance().saveJeans(jeans);
	}

	@Override
	public void deleteJeans(String brand, String model, int size, int count, double price, double priceByCount) {
		Jeans jeans = new Jeans(brand, model, size, count, price, priceByCount);
		JeansDAO.getInstance().removeJeans(jeans);
	}

	@Override
	public void sellJeans(Jeans jeans) {
		JeansDAO.getInstance().sellJeans(jeans);
	}

	@Override
	public void changeJeans(Jeans jeans) {
		JeansDAO.getInstance().updateJeans(jeans);
	}

	@Override
	public Jeans getJeans(int id) {
		return  allJeans.get(id);
	}

	@Override
	public Map<Integer, Jeans> getAllJeans() {
		return allJeans;
	}

}
