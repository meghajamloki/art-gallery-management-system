package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ArtistDao;
import com.model.Artist;

import java.io.IOException;

@WebServlet("/artistRegister")
public class ArtistServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;   
	private ArtistDao artistDao;

	public void init() {
		artistDao = new ArtistDao();
	    }
	    
	   
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	this.doPost(req,resp);
		}


	    @Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	
	    	String firstName = request.getParameter("firstName");
	    	String lastName = request.getParameter("lastName");
	    	String contact = request.getParameter("contact");
	    	String address = request.getParameter("address");
	    	String email = request.getParameter("email");
	    	String expertise = request.getParameter("expertise");
	    	
	    	
	    	Artist artist = new Artist();
	    	
	    	artist.setFirstName(firstName);
	    	artist.setLastName(lastName);
	    	artist.setAddress(address);
	    	artist.setContactNumber(contact);
	    	artist.setEmail(email);
	    	artist.setExpertise(expertise);
	    	
	    	try {
	            artistDao.insertArtist(artist);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	

