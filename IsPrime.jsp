<html>
	<head>
		<title>Is Prime</title>
	</head>
	<body>
		<center>
			<h2>
			<% 
				String n=request.getParameter("num");
				int num=Integer.parseInt(n);
				out.println(num);
			%>
			<%!
				String isPrime(int num)
				{
					int flag=0,i;
					if(num > 1)
					{
						for(i=2;i<=num/2;i++)
						{
							if(num%i == 0)
							{
								flag=1;
								break;
							}
						}
					}
					if (flag==1)
					{
						return "Not Prime";
					}
					else
					{
						return "Prime";
					}
				}
			%>
			<p>The number entered is <%= isPrime(num) %></p>
			</h2>
		</center>
	</body>
</html>
