package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Artist;

public class ArtistDao {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Connection conn = null;
	
	String connectionUrl = "jdbc:mysql://localhost:3306/art_gallery?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
	String dbUser = "root";
	String dbPwd = "meghajamloki";
	
	private static final String INSERT_ARTIST = "INSERT INTO artist" + "  (firstName, lastName, contact, address, email, expertise) VALUES " +
	        " (?, ?, ?, ?, ?, ?);";
	
	public ArtistDao() {

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

	public void insertArtist(Artist artist)throws SQLException {
	
		try {			
			Connection conn = getConnection();
			preparedStatement = conn.prepareStatement(INSERT_ARTIST);
		//	preparedStatement.setInt(1, artist.getArtistId());
			preparedStatement.setString(1, artist.getFirstName());
			preparedStatement.setString(2, artist.getLastName());
			preparedStatement.setString(3, artist.getContactNumber());
			preparedStatement.setString(4, artist.getAddress());
			preparedStatement.setString(5, artist.getEmail());
			preparedStatement.setString(6, artist.getExpertise());
			preparedStatement.executeUpdate();
			
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void searchArtist(Artist artist)throws SQLException{
		
		String expertise = artist.getExpertise();
		
		PreparedStatement statement = connection.prepareStatement("select * from artist where expertise = ?");    
		statement.setString(1, expertise);    
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			
		}

	}

}
