package model.db;

import java.util.List;
import java.util.Map;

import model.pojo.Jeans;

public interface IJeansDAO {

	void saveJeans(Jeans jeans);
	
	void removeJeans(Jeans jeans);

	void sellJeans(Jeans jeans);

	void updateJeans(Jeans jeans);

	Map<Integer, Jeans> allJeans();

}