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
            String regno=request.getParameter("regno");
            String cname=request.getParameter("course");
            String attend=request.getParameter("attend");
            
            
            PreparedStatement ps=con.prepareStatement("INSERT INTO attendance1 VALUES(?,?,?)");
            
            ps.setString(1, regno);
            ps.setString(2, cname);
            ps.setString(3, attend);
          
            ps.executeUpdate();
            out.println("inserted successfully");
        %>
    </body>
</html>
