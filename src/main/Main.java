package main;

import java.sql.Connection;

import db.DB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = DB.getConnection();
		DB.getConnection();
	}

}
