<html>
<head>
<title>User Home Page</title>
</head>
<body>
	<%@ page errorPage="error.jsp" %>
<%
	String user = request.getParameter("user");
	String pwd = request.getParameter("password");

	if(user.equals("Admin") && pwd.equals("admin")){
		%><jsp:forward page = "welcome.jsp" /> <%
	}
	
	else{
		throw new ServletException("Mandatory Parameter missing");  //throw new RuntimeException("Error occcured!!!");
	} 
	
	//else{
	//	%><jsp:forward page = "error.jsp" /> <%
	//} 
%>


</body>
</html>
