<! JSP 2 !>
<html>
    <head>
        <title>Home Page</title>
    </head>
    <body bgcolor="beige">
        <center>
		<h1>
        <%
        String s1=request.getParameter("user");
        String s2=request.getParameter("password");

        if(s1.equals("admin") && s2.equals("12345")){
            out.println("Welcome!");  
        }
        else{
            out.println("Invalid Credentials!"); 
        }
        %>
		</h1>
        <br><br>
        <a href="login.jsp">User Login</a>
        </center>
    </body>
</html>
