<! JSP Assignment 3 !>  <! Lab 2 on JSP 2) !>
<html>
<head>    
    <title>JSP Page</title>
</head>
<body>
    <%@ page import = "java.sql.*" %>
        <h2>
            <%
				int sum = 0;
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //out.println("Driver ok");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "1608");
                    String sql = "select * from employee";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next())
                    {
							sum = sum + rs.getInt(4);
                    }
					out.println("Sum of salaries of all employess = " + sum);
                    rs.close();
                    con.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            %>
        </h2>
</body>
</html>