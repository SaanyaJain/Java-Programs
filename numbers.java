import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class numbers extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	String num1=req.getParameter("num1");
	int n1=Integer.parseInt(num1);
	String num2=req.getParameter("num2");
	int n2=Integer.parseInt(num2);
	int add=n1+n2;
	int sub=n1-n2;
	out.println("Addition="+add);
	out.println("<br>Subtraction="+sub);
	}
}