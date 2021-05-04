import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class factorial extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	String num=req.getParameter("num");
	int n=Integer.parseInt(num);
	int fact=1,i;
	for(i=1;i<=n;i++)
	fact=fact*i;
	out.println("factorial="+fact);
	
	}
}