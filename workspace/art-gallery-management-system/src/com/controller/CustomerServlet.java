package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustomerDao;
import com.model.Customer;

import java.io.IOException;

@WebServlet("/customerRegister")
public class CustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;   
	private CustomerDao customerDao;

	public void init() {
		customerDao = new CustomerDao();
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
	    	
	    	
	    	Customer customer = new Customer();
	    	
	    	customer.setFirstName(firstName);
	    	customer.setLastName(lastName);
	    	customer.setAddress(address);
	    	customer.setContactNumber(contact);
	    	customer.setEmail(email);
	    	
	    	try {
	            customerDao.insertCustomer(customer);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	

