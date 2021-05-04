import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class num_power extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	String num=req.getParameter("num");
	int n=Integer.parseInt(num);
	String power=req.getParameter("power");
	int p=Integer.parseInt(power);
	int m=1;
	for(int i=1;i<=p;i++)
	m=m*n;
	out.println("<h2>Result = "+m);
	}
}