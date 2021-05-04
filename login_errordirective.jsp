<!-- Write a JSP program which forwards user request to login page: if user enters correct user name and
password system should display welcome message otherwise system should call error page using errorPage directive. -->

<html>
    <head>
        <title>Login Page</title>
    </head>
    <body bgcolor="SkyBlue">
        <center><h1>Enter your details</h1><hr>
            <form action="verification_errordirective.jsp">
                <br><b>Username: <input type="text" name="user"></b><br>
                <br><b>Password: <input type="password" name="password"></b><br>
                <br><input type="submit" value="Login">
            </form>
            <br>
    </center>
    </body>
</html>
