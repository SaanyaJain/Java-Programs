import javax.servlet.*;
import java.io.*;

public class genericserv extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
	{
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");//MIME
	out.println("<h2> Trying Generic Servlet ....</h2>");
	out.println("<font color=Blue> Welcome user</font");
	}
}

