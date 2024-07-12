package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Customer;

public class CustomerDao {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Connection conn = null;
	
	String connectionUrl = "jdbc:mysql://localhost:3306/art_gallery?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
	String dbUser = "root";
	String dbPwd = "meghajamloki";
	
	private static final String INSERT_CUSTOMER = "INSERT INTO customer" + "  (firstName, lastName, contact, address, email) VALUES " +
	        " (?, ?, ?, ?, ?);";
	
	public CustomerDao() {

	}
	
	protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
            System.out.println("Connection established Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return connection;
    }

	public void insertCustomer(Customer customer)throws SQLException {
	
		try {			
			Connection conn = getConnection();
			preparedStatement = conn.prepareStatement(INSERT_CUSTOMER);
		//	preparedStatement.setInt(1, artist.getArtistId());
			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getContactNumber());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setString(5, customer.getEmail());
			preparedStatement.executeUpdate();
			
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
