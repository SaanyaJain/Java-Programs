<! JSP Assignment 1 !>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
    <center>
        <h2>
            <%
                String name, a;
				int age;
                name = request.getParameter("nam");
				a = request.getParameter("age");
				age = Integer.parseInt(a);
                
                if(age < 10)
                {
                    out.println("Movie ticket price for " + name + " with age " + age + " is " + " Rs. 100");
                }
                else if(age > 62)
                {
                    out.println("Movie ticket price for " + name + " with age " + age + " is " + " Rs. 250");
                }
                else
                {
                    out.println("Movie ticket price for " + name + " with age " + age + " is " + " Rs. 200");
                }
            %>
        </h2>
    </center>
</body>
</html>


