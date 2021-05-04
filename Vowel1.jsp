<!--Lab 2 on JSP 5) -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <font color="black"><b>
        <% 
			int i,n;
            String s1;
            s1= request.getParameter("str");
            n=s1.length();
			i=0;
            do
			{
				char ch=s1.charAt(i);
				switch(ch)
				{
					case 'a': out.println("a");
								break;
					case 'e': out.println("e");
								break;
					case 'i': out.println("i");
								break;
					case 'o': out.println("o");
									break;
					case 'u': out.println("u");
									break;
					case 'A': out.println("A");
									break;
					case 'E': out.println("E");
									break;
					case 'I': out.println("I");
									break;
					case 'O': out.println("O");
									break;
					case 'U': out.println("U");
									break;
                }
                i++;
            } while(i<n);
          %></b>
       </font>
   </body>
</html>