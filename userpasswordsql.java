import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class userpasswordsql extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//out.println("Driver OK!");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1608");
			Statement st=conn.createStatement();
			//Scanner sc=new Scanner(System.in);
			String username=req.getParameter("username");
			String password=req.getParameter("pwd");
			ResultSet rs=st.executeQuery("select * from login1 where username='"+username+"' and  password='"+password+"'");
			if(rs.next())
			{
				out.println("Login Successful "+username);
			}
			else
			{
				out.println("Login Unsuccessful! Please try again");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}