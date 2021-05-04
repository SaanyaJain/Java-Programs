import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class insertevent extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1608");
			String event_no=req.getParameter("evno");
			int evno=Integer.parseInt(event_no);
			String evname=req.getParameter("evname");
			String venue=req.getParameter("venue");
			PreparedStatement ps=con.prepareStatement("insert into event(evno,evname,venue) values (?,?,?)");
			ps.setInt(1, evno);
            		ps.setString(2, evname);
            		ps.setString(3, venue);
			int i = ps.executeUpdate();
            		if (i > 0) 
			{
      			    out.println("Inserted new event record successfully");
        		}
        		else
			{
				out.println("Error inserting record");
			}
                }	
		catch(Exception e) 
		{
			out.println(e);
		}
	}
}