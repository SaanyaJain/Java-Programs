<html>
<body>
<h2>UseBean Action of JSP</h2>
<jsp:useBean id="e1" class="pack.evenodd" scope="session" />
<jsp:setProperty name="e1" property="num" value="60" />
<%
out.println(e1.find());
%>
