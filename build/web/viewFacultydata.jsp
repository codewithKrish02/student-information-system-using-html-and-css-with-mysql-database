<%-- 
    Document   : viewdata
    Created on : May 3, 2019, 1:52:05 PM
    Author     : krish
--%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faculty View Data</title>
    </head>
    <body style="background-color: rgb(243,254,255);">
        <div align="center">  
      <img src="studentinfo.jpg" width=100 height=80 id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
<%@include file="Adminprofilecss.html" %>
<br>
<br>
<%
    String k=(String)session.getAttribute("id");
%>
        
    <center>
        <h1>Faculty Registrations</h1>
        <table border="1">
            <tr>
                <td>FirstName</td>
                <td>LastName</td>
                <td>Email</td>
                <td>Department</td>
                <td>Designation</td>
                <td>Date Of Birth</td>
                <td>Gender</td>
                <td>Phone Number</td>
                <td>Address</td>
                <td>Faculty Id</td>
 
                <td>Password</td>
                <td>Re-type Password</td>
                <td>Photo</td>
                <td>Actions</td>
                
            </tr>
            <tbody>
                <%
                    String p="pending";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from faculty_registration");//where status='"+p+"'
                    while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                    <td><%=rs.getString(7)%></td>
                    <td><%=rs.getString(8)%></td>
                    <td><%=rs.getString(9)%></td>
                    <td><%=rs.getString(10)%></td>
                    <td><%=rs.getString(11)%></td>
                    <td><%=rs.getString(12)%></td>
                    <td><%=rs.getString(13)%></td>
                    <td><a href="UpdateRegistrationFaculty.jsp?FacNo=<%=rs.getString(10)%>">Update</a>&nbsp;&nbsp;<a href="DeleteFacultyRegistration.jsp?FacNo=<%=rs.getString(10)%>">Delete</a></td>
                </tr>
                <% }
                    %>
            </tbody>
        </table>
    </center>
    </body>
</html>
