package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.model.Order;

public class OrderDao {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Connection conn = null;
	
	String connectionUrl = "jdbc:mysql://localhost:3306/art_gallery?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
	String dbUser = "root";
	String dbPwd = "meghajamloki";
	
	private static final String INSERT_ORDER = "INSERT INTO artorder" + "  (orderNumber, artId, customerId, orderDate) VALUES " +
	        " (?, ?, ?, ?);";
	
	public OrderDao() {

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

	public void insertOrder(Order order)throws SQLException {
		SimpleDateFormat sdf2 = null;
		String dt = null;
		try {			
			Connection conn = getConnection();
			
			try {
			    String dateString = order.getOrderDate();
			    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			    sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			    dt = sdf2.format(sdf.parse(dateString));
			} catch (ParseException e) {
			    e.printStackTrace();
			}
			
			preparedStatement = conn.prepareStatement(INSERT_ORDER);
		//	preparedStatement.setInt(1, artist.getArtistId());
			preparedStatement.setInt(1, order.getOrderNumber());
			preparedStatement.setInt(2, order.getArtId());
			preparedStatement.setInt(3, order.getCustomerId());
			preparedStatement.setString(4, dt);
			preparedStatement.executeUpdate();
			
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
