<! JSP Assignment 2 !>
<html>
<head>    
    <title>JSP Page</title>
</head>
<body>
    <%@ page import = "java.sql.*" %>
        <h1>The Last Names are: </h1>
        <h2>
            <%
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //out.println("Driver ok");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "1608");
                    String sql = "select * from employee";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next())
                    {
						%> <ul> 
                            <li> <% out.println(rs.getString(3)); %> </li> </ul>
				    <% }
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