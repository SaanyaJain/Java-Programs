<!--Lab 2 on JSP 5) -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
		<center>
        <font color="black">
        <h3>
		<% 
			int i,n;
            String str;
            str= request.getParameter("str");
            n=str.length();
			for(i=0;i<n;i++)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
				str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' || str.charAt(i)=='U')
				{
					out.println(str.charAt(i));
				}
			}
        %>
		</h3>
        </font>
	    </center>    
   </body>
</html>