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
  <h1>Search</h1>
  <form action="<%= request.getContextPath() %>/displaySearchList.jsp" method="post">
   <table style="with: 80%">
    <tr>
     <td>Enter expertise to be searched</td>
     <td><input type="text" name="expertise" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
   
  </form>
 </div>
</body>

</html>