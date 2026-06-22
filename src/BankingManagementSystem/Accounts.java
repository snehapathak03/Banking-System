package BankingManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

	public class Accounts {
	    private Connection con;
	    private Scanner sc;
	    public Accounts(Connection con, Scanner sc){
	        this.con = con;
	        this.sc = sc;
	    }
	 
	public long open_account(String email){
		if(!account_exist(email)) {
	    String open_account_query = "INSERT INTO Accounts(account_number, full_name, email, balance, security_pin) VALUES(?, ?, ?, ?, ?);";
	    sc.nextLine();
	    System.out.print("Enter Full Name: ");
	    String full_name = sc.nextLine();
	    System.out.print("Enter Initial Amount: ");
	    double balance = sc.nextDouble();
	    sc.nextLine();
	    System.out.print("Enter Security Pin: ");
	    String security_pin = sc.nextLine();
	    try {
	        long account_number = generateAccountNumber();
	        PreparedStatement ps = con.prepareStatement(open_account_query);
	        ps.setLong(1, account_number);
	        ps.setString(2, full_name);
	        ps.setString(3, email);
	        ps.setDouble(4, balance);
	        ps.setString(5, security_pin);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            return account_number;
	        } else {
	            throw new RuntimeException("Account Creation failed!!");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	 }
     throw new RuntimeException("Account Already Exist");

 } 
	
  
	    

}
