<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> View Student</title>
    </head>
  <body style="background-color: rgb(243,254,255);">
        <div align="center">  
      <img src="studentinfo.jpg" width=100 height=80 id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
<%@include file="Facultyprofilecss.html" %>
<br>
<br>
<%
    String k=(String)session.getAttribute("id");
%>

        <center>
            <form action="MarkAttendanceAction1.jsp">
            <h1>Student Attendance</h1>
        <table border="1">
            <tr>
                
                <td>Registration Number</td>
                <td>Name</td>
                <td>Course</td>
                <td>Attendance</td>
               </tr>
            <tbody>
                <%
                    String p="pending";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from student_registration");//where status='"+p+"'
                    while(rs.next()){
                %>
                <tr>
               
                    <td><input type="text" name="regno" value="<%=rs.getString(9)%>"></td>
                    <td><%=rs.getString(2)%> <%=rs.getString(1)%></td>
                    <td><select name="course">
                            <option>Java</option>
                        </select></td>
                        <td><select name="attend">
                            <option>Present</option>
                            <option>Absent</option>
                        </select></td>
                    
                </tr>
                <% }
                    %>
                                 
                 
            </tbody>
        </table><br>
                     <input type="submit" value="submit">
        </form>
    </center>
    </body>
</html>
