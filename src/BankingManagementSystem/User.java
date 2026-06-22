package BankingManagementSystem;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
	private Connection con;
	private Scanner sc;
	
	public User(Connection con, Scanner sc) {
		this.con = con;
		this.sc = sc;
	}
	
	public void register() {
		sc.nextLine();
		System.out.println("Full Name : ");
		String full_name = sc.nextLine();
		System.out.println("Email : ");
		String email = sc.nextLine();
		System.out.println("Password : ");
		String password = sc.nextLine();
		if(user_exist(email)) {
			System.out.println("User Already Exists for this Email Address.");
			return;
		}
		String register_query = "INSERT INTO User(full_name, email, password) VALUES(?, ?, ?); ";
		try {
			PreparedStatement ps = con.prepareStatement(register_query);
            ps.setString(1, full_name);
            ps.setString(2, email);
            ps.setString(3, password);
            if (affectedRows > 0) {
                System.out.println("Registration Successfull!");
            } else {
                System.out.println("Registration Failed!");
            }
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
