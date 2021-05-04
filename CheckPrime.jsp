<! JSP 1 !>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
    <center>
        <h1>The Required Result is: </h1>
        <h2>
            <%
                int n, i, flag=0;
                String ns = request.getParameter("n");
                n = Integer.parseInt(ns);
                if(n>1)
                {
                    for(i=2; i<=n/2; i++)
                    {
                        if(n%i == 0)
                        {
                            flag = 1;
                            break;
                        }
                    }
                }
                if(flag == 0)
                {
                    out.println(n+" is a prime Number.");
                }
                else
                {
                    out.println(n+" is not a prime Number.");
                }
            %>
        </h2>
    </center>
</body>
</html>


