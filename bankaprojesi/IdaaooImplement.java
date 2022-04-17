package com.ecodation.bankaprojesi;

import java.sql.Connection;
import java.util.ArrayList;

public interface IdaaooImplement<T> {
	public void create(T dto);

	public void update(T dto);

	public void delete(T dto);

	public ArrayList<T> list();

	// gövdeli method
	default Connection getInterfaceConnection() {
		DatabaseConnection baglanti = new DatabaseConnection();
		return baglanti.getConnectionDb();
	}
}
