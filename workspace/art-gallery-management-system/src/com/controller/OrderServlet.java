package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.OrderDao;
import com.model.Order;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/orderRegister")
public class OrderServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;   
	private OrderDao orderDao;

	public void init() {
		orderDao = new OrderDao();
	    }
	    
	   
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	this.doPost(req,resp);
		}


	    @Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	
	    	int orderNumber = Integer.valueOf(request.getParameter("orderNumber"));
	    	int artId = Integer.valueOf(request.getParameter("artId"));
	    	int customerId = Integer.valueOf(request.getParameter("customerId"));
	    	String orderDate = request.getParameter("orderDate");
	    	
	    	Order order = new Order();
	    	order.setOrderNumber(orderNumber);
	    	order.setArtId(artId);
	    	order.setCustomerId(customerId);
	    	order.setOrderDate(orderDate);
	    	
	    	try {
	            orderDao.insertOrder(order);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	

