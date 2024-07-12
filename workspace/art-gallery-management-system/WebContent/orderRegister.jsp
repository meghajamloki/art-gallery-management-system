<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
 <div align="center">
  <h1>Order Registration Form</h1>
  <form action="<%= request.getContextPath() %>/orderRegister" method="post">
   <table style="with: 80%">
    <tr>
     <td>Order Number</td>
     <td><input type="number" name="orderNumber" /></td>
    </tr>
    <tr>
     <td>Art ID</td>
     <td><input type="number" name="artId" /></td>
    </tr>
    <tr>
     <td>Customer ID</td>
     <td><input type="number" name="customerId" /></td>
    </tr>
    <tr>
     <td>Date</td>
     <td><input type="date" name="orderDate" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>

</html>