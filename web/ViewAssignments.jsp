<%@page import="java.sql.Statement"%>
<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> View Attendance</title>
    </head>
   <body style="background-color: rgb(243,254,255);">
        <div align="center">  
      <img src="studentinfo.jpg" width=100 height=80 id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
<%@include file="Studentprofilecss.html" %>
<br>
<br>
        
        <center>
            <h1>ASSIGNMENTS</h1>
        <table border="1">
            <tr>
                <td>Assignement Number</td>
                <td>Assignment Description</td>
                <td>Course Name</td>
                
                <td>Faculty Email</td>
                
            </tr>
            <tbody>

                <%
                    
                     String k=(String)session.getAttribute("id");
                    String p="pending";
                    Statement st=con.createStatement();
                    
                     ResultSet rs=st.executeQuery("select * from Assignments");
                    while(rs.next()){
                %>
                <tr>
                  
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    
                   
                    
                  </tr>
                <% }
                    %>
            </tbody>
        </table>
    </center>
    </body>
</html>
