<! JSP 4 !>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
    <center>
        <h2>
            <% String bgColor = request.getParameter("c"); %>
            <% if(bgColor == null) { %>
                <body BGCOLOR="FFFFFF">
            <% } else { %> 
            <body BGCOLOR="<%= bgColor %>">
        <% } %>
        </h2>
    </center>
</body>
</html>

