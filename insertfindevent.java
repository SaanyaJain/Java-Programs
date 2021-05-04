import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class insertfindevent extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		String button1=req.getParameter("Insert");
		String button2=req.getParameter("Find");
		if(button2 == null)
		{
			PrintWriter out=res.getWriter();
			try
			{
				//out.println("Insert is Clicked!!");
				res.setContentType("text/html");
				//connection
				Class.forName("com.mysql.jdbc.Driver");
				//out.println("Driver OK!");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1608");
				int evno=Integer.parseInt(req.getParameter("evno"));
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
				PreparedStatement ps1=con.prepareStatement("select * from event");
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					
					out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
					out.println("<br>");
				}
				con.close();
			}	
			catch(Exception e) 
			{
				out.println(e);
			}
		}
		if(button1 == null )
		{
			PrintWriter out=res.getWriter();
			try
			{
				//out.println("Find is Clicked!!");
				res.setContentType("text/html");
				//connection
				Class.forName("com.mysql.jdbc.Driver");
				//out.println("Driver OK!");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1608");
				Statement st=con.createStatement();
				//int evno=Integer.parseInt(req.getParameter("evno"));
				String evname=req.getParameter("evname");
				//String venue=req.getParameter("venue");
				ResultSet rs=st.executeQuery("select * from event where evname='"+evname+"'");
					while(rs.next())
					{
						out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
						out.println("<br>");
					}
				con.close();
			}
			catch(Exception e)
			{
				out.println(e);
			}	
		}
	}
}