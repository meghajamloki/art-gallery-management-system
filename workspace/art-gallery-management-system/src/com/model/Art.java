package com.model;

public class Art {
	
	private int artId;
	private String name;
	private String type;
	private int price;
	private int artistId;
	private int year;
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Art(int artId, String name, String type, int price, int artistId, int year) {
		super();
		this.artId = artId;
		this.name = name;
		this.type = type;
		this.price = price;
		this.artistId = artistId;
		this.year = year;
	}
	public Art() {
		super();
	}
	
}
