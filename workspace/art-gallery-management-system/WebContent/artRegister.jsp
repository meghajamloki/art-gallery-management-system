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
  <h1>Art Registration Form</h1>
  <form action="<%= request.getContextPath() %>/artRegister" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Type</td>
     <td><input type="text" name="type" /></td>
    </tr>
    <tr>
     <td>Price</td>
     <td><input type="number" name="price" /></td>
    </tr>
    <tr>
     <td>Artist Id</td>
     <td><input type="number" name="artistId" /></td>
    </tr>
    <tr>
     <td>Year of Creation</td>
     <td><input type=number name="year" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>

</html>