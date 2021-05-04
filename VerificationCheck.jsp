<! JSP 2 !>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
    <center>
        <h1>The Required Result is: </h1>
        <h2>
            <%
                String un = request.getParameter("n");
                String p = request.getParameter("p");
                if(un.equals("admin") && p.equals("admin@123"))
                {
                    out.println("Login Successful.......");
                }
                else
                {
                    out.println("Login Failed.......");
                }
            %>
        </h2>
    </center>
</body>
</html>
