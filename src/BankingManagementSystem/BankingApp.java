package BankingManagementSystem;

import java.sql.*;
import java.util.Scanner;

import java.util.Scanner;

import static java.lang.Class.forName;

public class BankingApp {
	private static final String url = "jdbc:mysql://localhost:3306/banking_system";
	private static final String username = "root";
	private static final String password = "sona@2003";
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("loaded seccesfully");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connected succesfully");
			Scanner sc = new Scanner(System.in);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}






























