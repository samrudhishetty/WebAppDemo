<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% //scriplet tag
	int sq=(int)session.getAttribute("sq");
	out.println("Sqaure of additon(result.jsp)= " +sq ); //to print in browser


%>

</body>
</html>