package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Art;

public class ArtDao {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Connection conn = null;
	
	String connectionUrl = "jdbc:mysql://localhost:3306/art_gallery?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
	String dbUser = "root";
	String dbPwd = "meghajamloki";
	
	private static final String INSERT_ART = "INSERT INTO art" + "  (name, type, price, artistId, year) VALUES " +
	        " (?, ?, ?, ?, ?);";
	
	public ArtDao() {

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

	public void insertArt(Art art)throws SQLException {
	
		try {			
			Connection conn = getConnection();
			preparedStatement = conn.prepareStatement(INSERT_ART);
		//	preparedStatement.setInt(1, artist.getArtistId());
			preparedStatement.setString(1, art.getName());
			preparedStatement.setString(2, art.getType());
			preparedStatement.setInt(3, art.getPrice());
			preparedStatement.setInt(4, art.getArtistId());
			preparedStatement.setInt(5, art.getYear());
			preparedStatement.executeUpdate();
			
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
