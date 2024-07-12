<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	try {

		String connectionURL = "jdbc:mysql://localhost:3306/art_gallery?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(connectionURL, "root", "meghajamloki");
		statement = connection.createStatement();
		String QueryString = "SELECT * from artist";
		rs = statement.executeQuery(QueryString);
%>

<table align="center" border="1" cellpadding="5">

	<tr>
		 <th>Artist ID</th>
         <th>First Name</th>
         <th>Last Name</th>
         <th>Contact</th>
         <th>Address</th>
         <th>Email</th>
         <th>Expertise</th>
   </tr>
<%
while (rs.next()) {
%>
	<TR>
	<TD><%=rs.getString(1)%></TD>
	<TD><%=rs.getString(2)%></TD>
	<TD><%=rs.getString(3)%></TD>
	<TD><%=rs.getString(4)%></TD>
	<TD><%=rs.getString(5)%></TD>
	<TD><%=rs.getString(6)%></TD>
	<TD><%=rs.getString(7)%></TD>
	</TR>
<% 
} 
%>
<%

rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
<%
	out.println("Unable to connect to database.");
}
%>
</TABLE>

</body>
</html>