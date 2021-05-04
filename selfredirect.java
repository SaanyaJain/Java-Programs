import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class selfredirect extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String num=req.getParameter("num");
		String power=req.getParameter("power");
		int i, result=1;
		if(num!=null && power!=null)
		{
		int n=Integer.parseInt(num);
		int p=Integer.parseInt(power);
		i=1;
		while(i<=p)	
		{
		result=result*n;
		i++;
		}
		out.println("Result is : "+result);
		}
		out.println("<html><body bgcolor=white><form action='http://localhost:8080/practs/selfredirect'>");
		out.println("<font color=blue> Enter number <input type=text size=20 name=num></font><br>");
		out.println("<font color=blue> Enter power <input type=text size=20 name=power></font>");
		out.println("<input type=submit></form></body></html>");
	}
}

