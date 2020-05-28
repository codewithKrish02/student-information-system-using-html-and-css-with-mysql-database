<%-- 
    Document   : Reg_faculty
    Created on : May 2, 2019, 11:04:35 AM
    Author     : krish
--%>
<%@page import="java.sql.PreparedStatement"%>
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
            String fname=request.getParameter("Fname");
            String lname=request.getParameter("Lname");
            String email=request.getParameter("email");
            String dept=request.getParameter("dept");
            String dob=request.getParameter("date");
            String gender=request.getParameter("male");
            String phone=request.getParameter("MNum");
            String address=request.getParameter("addr");
            String facultyid=request.getParameter("FacNo");
            String pass=request.getParameter("pass");
            String repass=request.getParameter("repass");
            String photo=request.getParameter("photo");
            String state=request.getParameter("state");
            
            PreparedStatement ps=con.prepareStatement("DELETE FROM student_registration where facultyid=?");

            ps.setString(1, facultyid);
            ps.executeUpdate();
            out.println("Deleted successfully");
        %>
    </body>
</html>
