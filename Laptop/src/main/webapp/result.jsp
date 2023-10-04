<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laptop Details</title>
</head>


<body>
<h3>Laptop Details:</h3>
<table border="1">
<tr>
<th>Laptop ID</th>
<th>Laptop Make</th>
<th>Laptop Cost</th>
</tr>

<%
ResultSet rst = (ResultSet) request.getAttribute("laptopResultSet");
while (rst.next()) { 
%>
<tr>
<td><%= rst.getInt("id") %></td>
<td><%= rst.getString("make") %></td>
<td><%= rst.getDouble("cost") %></td>
</tr>
<% }
%>
</table>
</body>
</html>