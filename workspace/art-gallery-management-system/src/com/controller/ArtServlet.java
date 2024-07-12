package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ArtDao;
import com.model.Art;

import java.io.IOException;

@WebServlet("/artRegister")
public class ArtServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;   
	private ArtDao artDao;

	public void init() {
		artDao = new ArtDao();
	    }
	    
	   
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	this.doPost(req,resp);
		}


	    @Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	
	    	String name = request.getParameter("name");
	    	String type = request.getParameter("type");
	    	int price = Integer.valueOf(request.getParameter("price"));
	    	int artistId = Integer.valueOf(request.getParameter("artistId"));
	    	int year = Integer.valueOf(request.getParameter("year"));
	    	
	    	
	    	Art art = new Art();
	    	
	    	art.setName(name);
	    	art.setType(type);
	    	art.setPrice(price);
	    	art.setArtistId(artistId);
	    	art.setYear(year);
	    	
	    	try {
	            artDao.insertArt(art);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	

