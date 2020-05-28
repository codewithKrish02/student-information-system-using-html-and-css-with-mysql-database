<%-- 
    Document   : Reg_faculty
    Created on : May 2, 2019, 11:04:35 AM
    Author     : krish
--%>
<%@include file="connection.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String uname=request.getParameter("Uname");
            String cname=request.getParameter("Cname");
            String dept=request.getParameter("dept");
            String date=request.getParameter("date");
            
            PreparedStatement ps=con.prepareStatement("INSERT INTO catmarks VALUES(?,?,?,?)");
            
            ps.setString(1, uname);
            ps.setString(2, cname);
            ps.setString(3, dept);
            ps.setString(4, date);
            ps.executeUpdate();
            out.println("inserted successfully");
        %>
    </body>
</html>
