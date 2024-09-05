
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="logincheck">
  username: <input type="text" name="username"><br><br>
   password: <input type="text" name="password" ><br>
             <input type="submit"><br><br>

   
   <%if(request.getAttribute("msg") != null){
	   if(request.getAttribute("msg").equals("correct")) {
   %>
      <font color="green">
        <% out.println(request.getAttribute("msg"));%>
      </font>
      <%} 
          else
      { %>
         <font color="red">
        <% out.println(request.getAttribute("msg"));%>
      </font>
   
     <%}
   } %>
   </form>
</body>
</html>