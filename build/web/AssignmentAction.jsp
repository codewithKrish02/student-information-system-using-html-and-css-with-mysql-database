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
            String Email=request.getParameter("Email");
            String AssignmentNo=request.getParameter("Ano");
            String CourseName=request.getParameter("Cname");
            String AssignmentDescription=request.getParameter("Ad");
           
            PreparedStatement ps=con.prepareStatement("INSERT INTO Assignments VALUES(?,?,?,?)");
            
            ps.setString(1, AssignmentNo);
            ps.setString(3, CourseName);
            ps.setString(2, AssignmentDescription);
            ps.setString(4, Email);
            
            
            ps.executeUpdate();
            out.println("inserted successfully");
        %>
    </body>
</html>
