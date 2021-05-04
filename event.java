//Display all the records from event table through a servlet. Event(evno, evname, venue)
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class event extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<html><body><table border=2>");
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1608");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from event");
			while(rs.next())
			{
			out.println("<tr><td>"+rs.getInt(1)+"<td>"+rs.getString(2)+"<td>"+rs.getString(3)+"</tr>");
			}
			out.println("</html></body></table>");
		}
		catch(Exception e) 
		{
			out.println(e);
		}
	}
}