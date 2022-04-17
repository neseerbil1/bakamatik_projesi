package com.ecodation.bankaprojesi;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private String url = "jdbc:mysql://localhost:3306/bankamatik_otomasyonu";
	private String user = "root";
	private String password = "";

	public Connection getConnectionDb() {
		Connection connection = null;
		try {
			if (connection == null || connection.isClosed()) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver baþarýlý bir þekilde yüklendi...");
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("Baðlantý baþarýlý...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		DatabaseConnection baglanti = new DatabaseConnection();
		baglanti.getConnectionDb();
	}

}
