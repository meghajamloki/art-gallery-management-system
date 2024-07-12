package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ArtistDao;
import com.model.Artist;

import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

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
	    	
	    	try{
	    		String expertise = request.getParameter("expertise");
            
	    		request.setAttribute("expertise", expertise);
	    		request.getRequestDispatcher("/displaySearchList.jsp").forward(request, response);
	    	}
        catch(Exception e){
        	
        }
	    }
	}
	

