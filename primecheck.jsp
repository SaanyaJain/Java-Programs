<! JSP 1 !>
<html>
    <head>
        <title>Check for Prime No.</title>
    </head>
    <body><center><h2>The result is:</h2>
        <h3>
            <%
            int n,i,flag=0;
            String n1 = request.getParameter("n");
            n=Integer.parseInt(n1);
            if(n > 1)
            {
                for(i=2; i<=n/2; i++)
                {
                    if(n%i==0)
                    {
						flag = 1;
						break;
                    }
                }
					
				if(flag==0)
				{
					out.println("<pre>");
					out.println(n + " is a prime no.");
					out.println("</pre>");
				}
			}
			
			if (n==0 || n==1)
			{
				out.println(n + " is neither a prime no. or composite no.");
			}
			
            else
            {
                out.println("<pre>");
                out.println(n + " is not a prime no.");
                out.println("</pre>");
            }
          
            %>
            
           </h3></center>
    </body>
</html>