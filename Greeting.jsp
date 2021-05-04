<!--Lab 2 on JSP 6) -->
<!DOCTYPE html>
<html>
    <body>
		<center>
		<%@ page import="java.util.*" %>
        <h3>
		<% 
			Date d = new Date();
			String name = request.getParameter("name");
			int hours = d.getHours();
			if(hours>=06 && hours<12)
			{
				 out.println("Good Morning " + name);
			}
			else if(hours>=12 && hours<17)
			{
				 out.println("Good Afternoon " + name);
			}
			else if(hours>=17 && hours<20)
			{
				 out.println("Good Evening " + name);
			}
			else if(hours>=20 || hours<06)
			{
				 out.println("Good Night " + name);
			}
        %>
	    </h3>
        </font>
	    </center>    
   </body>
</html>