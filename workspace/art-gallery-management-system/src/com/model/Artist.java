package com.model;

public class Artist {
	
	private int artistId;
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private String expertise;
	private String email;
	
	
	public Artist() {
		super();
	}
	

	public Artist(int artistId, String firstName, String lastName, String address, String contactNumber,
			String expertise, String email) {
		super();
		this.artistId = artistId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.expertise = expertise;
		this.email = email;
	}




	public int getArtistId() {
		return artistId;
	}


	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getExpertise() {
		return expertise;
	}


	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
