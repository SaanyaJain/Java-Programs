<! JSP 3 !>
<html>
<head>    
    <title>JSP Page</title>
</head>
<body>
    <%@ page import = "java.sql.*" %>
    <center>
        <h1>The Required Result is: </h1>
        <h2>
            <%
                String un = request.getParameter("n");
                String p = request.getParameter("p");
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //out.println("Driver ok");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "1608");
                    String sql = "select * from login";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next())
                    {
                        if(un.equals(rs.getString(1)) && p.equals(rs.getString(2)))
                        {
                            out.println("Login Successful.......");
                        }
                        else
                        {
                            out.println("Login Failed.......");
                        }
                    }
                    rs.close();
                    con.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            %>
        </h2>
    </center>
</body>
</html>