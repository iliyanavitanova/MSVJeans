package model.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.pojo.Jeans;

public class JeansDAO implements IJeansDAO {
	private static IJeansDAO instance;
	private static final String SELECT_ALL_JEANS = "SELECT id,brand, model, size, count, price, priceByCount FROM jeans;";
	private static final String SELECT_ALL_SOLD = "SELECT id,brand, model, size, count, price, priceByCount FROM sold;";
	private static final String INSERT_INTO_JEANS = "INSERT INTO jeans (brand, model, size, count, price, priceByCount) VALUES (?, ?, ?, ?, ?, ?);";
	private static final String INSERT_INTO_SOLD = "INSERT INTO sold (brand, model, size, count, price, priceByCount) VALUES (?, ?, ?, ?, ?, ?);";
	private static final String UPDATE_INTO_JEANS ="";
	private static final String DELETE_INTO_JEANS ="";
	public synchronized static IJeansDAO getInstance() {
		if (instance == null) {
			instance = new JeansDAO();
		}
		return instance;
	}

	/* (non-Javadoc)
	 * @see model.db.IJeansDAO#saveJeans(model.pojo.Jeans)
	 */
	@Override
	public void saveJeans(Jeans jeans) {
		PreparedStatement statement = null;
		try {
			statement = DBManager.getInstance().getConnection().prepareStatement(INSERT_INTO_JEANS);
			statement.setString(1, jeans.getBrand());
			statement.setString(2, jeans.getModel());
			statement.setLong(3, jeans.getSize());
			statement.setLong(4, jeans.getCount());
			statement.setLong(5, (long) jeans.getPrice());
			statement.setLong(6, (long) jeans.getPriceByCount());

			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	
	public List<Jeans> getAllJeans() {
		List<Jeans> jeans = new ArrayList<Jeans>();
		Statement statement = null;
		ResultSet resultSet = null;
//		try {
//			statement = DBManager.getInstance().getConnection().createStatement();
//			resultSet = statement.executeQuery(SELECT_ALL_JEANS);
//			while (resultSet.next()) {
//				jeans.add(new Jeans(resultSet.getInt("id"), resultSet.getString("brand"), resultSet.getString("model"),
//						resultSet.getString("size"), resultSet.getString("count"), resultSet.getString("price"),
//						resultSet.getString("priceByCount")
//
//				));
//			}
//		} catch (SQLException e) {
//			System.out.println("Cannot get all users right now!");
//			return jeans;
//		} finally {
//			try {
//				if (statement != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		Jeans jeans1 =new Jeans("integral", "12", 36, 1 ,35, 23.50);
		Jeans jeans2 =new Jeans("integral", "12", 38, 1 ,35, 23.50);
		Jeans jeans3 =new Jeans("integral", "12", 32, 1 ,35, 23.50);
		Jeans jeans4 =new Jeans("integral", "12", 34, 1 ,35, 23.50);
		Jeans jeans5 =new Jeans("integral", "12", 33, 1 ,35, 23.50);
		jeans.add(jeans1);
		jeans.add(jeans2);
		jeans.add(jeans3);
		jeans.add(jeans4);
		jeans.add(jeans5);
		System.out.println("Users loaded successfully");
		return jeans;
	}

	@Override
	public void removeJeans(Jeans jeans) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellJeans(Jeans jeans) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Jeans> allJeans() {
		TreeMap<Integer, Jeans> jeans = new TreeMap<Integer, Jeans>();
		Statement statement = null;
		ResultSet resultSet = null;
//		try {
//			statement = DBManager.getInstance().getConnection().createStatement();
//			resultSet = statement.executeQuery(SELECT_ALL_JEANS);
//			while (resultSet.next()) {
//				jeans.add(new Jeans(resultSet.getInt("id"), resultSet.getString("brand"), resultSet.getString("model"),
//						resultSet.getString("size"), resultSet.getString("count"), resultSet.getString("price"),
//						resultSet.getString("priceByCount")
//
//				));
//			}
//		} catch (SQLException e) {
//			System.out.println("Cannot get all users right now!");
//			return jeans;
//		} finally {
//			try {
//				if (statement != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		Jeans jeans1 =new Jeans("integral", "12", 36, 1 ,35, 23.50);
		Jeans jeans2 =new Jeans("integral", "12", 38, 1 ,35, 23.50);
		Jeans jeans3 =new Jeans("integral", "12", 32, 1 ,35, 23.50);
		Jeans jeans4 =new Jeans("integral", "12", 34, 1 ,35, 23.50);
		Jeans jeans5 =new Jeans("integral", "12", 33, 1 ,35, 23.50);
		jeans.put(1,jeans1);
		jeans.put(2,jeans2);
		jeans.put(3,jeans3);
		jeans.put(4,jeans4);
		jeans.put(5,jeans5);
		System.out.println("Users loaded successfully");
		return jeans;
	}

	@Override
	public void updateJeans(Jeans jeans) {
//		Map<Integer, Jeans>
//		Statement statement = null;
//		ResultSet resultSet = null;
////		try {
////			statement = DBManager.getInstance().getConnection().createStatement();
////			resultSet = statement.executeQuery(SELECT_ALL_JEANS);
////			while (resultSet.next()) {
////				jeans.add(new Jeans(resultSet.getInt("id"), resultSet.getString("brand"), resultSet.getString("model"),
////						resultSet.getString("size"), resultSet.getString("count"), resultSet.getString("price"),
////						resultSet.getString("priceByCount")
////
////				));
////			}
////		} catch (SQLException e) {
////			System.out.println("Cannot get all users right now!");
////			return jeans;
////		} finally {
////			try {
////				if (statement != null) {
////					statement.close();
////				}
////				if (resultSet != null) {
////					resultSet.close();
////				}
////			} catch (SQLException e) {
////				e.printStackTrace();
////			}
////		}
//		Jeans jeans1 =new Jeans("integral", "12", 36, 1 ,35, 23.50);
//		Jeans jeans2 =new Jeans("integral", "12", 38, 1 ,35, 23.50);
//		Jeans jeans3 =new Jeans("integral", "12", 32, 1 ,35, 23.50);
//		Jeans jeans4 =new Jeans("integral", "12", 34, 1 ,35, 23.50);
//		Jeans jeans5 =new Jeans("integral", "12", 33, 1 ,35, 23.50);
//		jeans.add(jeans1);
//		jeans.add(jeans2);
//		jeans.add(jeans3);
//		jeans.add(jeans4);
//		jeans.add(jeans5);
//		System.out.println("Users loaded successfully");
//		return jeans;
	}
}
