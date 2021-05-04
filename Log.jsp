<!--Lab 2 on JSP 1) -->
<html>
<head>
	<title>JSP Login Page</title>
</head>
	<body>
		<center>
			<h2>
			<%
				String fname= request.getParameter("f");
				String lname=request.getParameter("l");
				String dt=request.getParameter("dt");
				String email=request.getParameter("email");
				String zip=request.getParameter("zip");
				out.println("Registration Details are: <br>");
				out.println("First Name: "+fname+"<br>");
				out.println("Last Name: "+lname+"<br>");
				out.println("Date of birth: "+dt+"<br>");
				out.println("E-mail: "+email+"<br>");
				out.println("ZIP Code: "+zip+"<br>");
				out.println("Registration Successful!!!");
			%>
			</h2>
		</center>
	</body>	
</html>

