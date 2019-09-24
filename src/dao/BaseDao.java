package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import controller.ConfigManager;

/**
 * 操作数据库的基类
 * @author leiyangfei
 *
 */
public class BaseDao {
	public static Connection getConnection(){
		Connection conn = null;
		String driver = ConfigManager.getInstance().getValue("driver");
		String url = ConfigManager.getInstance().getValue("url");
		String username = ConfigManager.getInstance().getValue("username");
		String password = ConfigManager.getInstance().getValue("password");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
