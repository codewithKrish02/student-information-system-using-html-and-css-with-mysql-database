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
            String fname=request.getParameter("Fname");
            String lname=request.getParameter("Lname");
            String email=request.getParameter("email");
            String dept=request.getParameter("dept");
            String desig=request.getParameter("desig");
            String dob=request.getParameter("date");
            String gender=request.getParameter("male");
            String phone=request.getParameter("MNum");
            String address=request.getParameter("addr");
            String facultyid=request.getParameter("FacNo");
            
            String pass=request.getParameter("pass");
            String repass=request.getParameter("repass");
            String photo=request.getParameter("photo");
            
            PreparedStatement ps=con.prepareStatement("INSERT INTO faculty_registration VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, dept);
            ps.setString(5, desig);
            ps.setString(6, dob);
            ps.setString(7, gender);
            ps.setString(8, phone);
            ps.setString(9, address);
            ps.setString(10, facultyid);
           
            ps.setString(11, pass);
            ps.setString(12, repass);
            ps.setString(13, photo);
            ps.executeUpdate();
            out.println("inserted successfully");
        %>
    </body>
</html>
