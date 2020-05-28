<%@include file="connection.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STUDENT INFORMATION SYSTEM</title>
         <style>
        *{
            margin: 0;
            padding: 0;
        }
        h1{
            text-align: center;
            padding: 20px;
        }
        h2{
            text-align: center;
            padding: 20px;
        }
        .register{
            background: #2d85b0;
            width: 500px;
            margin: 0px 0px 0px 480px;
            color: white;
            font-size: 18px;
            padding: 20px;
            border-radius: 10px;
        }
        #register{
            margin-left: 80px;
        }
        label{
        color: white;
        font-family: sans-serif; 
        font-size: 18px;
        font-style: italic;
        }
        #name{
            width: 300px;
            border: none;
            border-radius: 3px;
            outline: 0;
            padding: 7px;
        }
        #ph{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #log{
            width: 120px;
            padding: 7px;
            font-size: 16px;
            font-family: sans-serif;
            font-style: italic;
            font-weight: 600;
            border: none;
            border-radius: 3px;
        }
        #can{
                width: 120px;
            padding: 7px;
            font-size: 16px;
            font-family: sans-serif;
            font-style: italic;
            font-weight: 600;
            border: none;
            border-radius: 3px;
        }
        #dept{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
      
        </style>
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
            <h1>CAT MARKS</h1>
        <table border="1">
            <tr>
                <td>Registration Number</td>
                <td>Course Name</td>
                <td>CAT Number</td>
                <td>Marks</td>               
                
            </tr>
            <tbody>

                <%
                    String p="pending";
                    Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select * from catmarks order by RegistrationNumber");
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
        <h1 align="center">ASSIGN GRADE</h1>
<div class="register">
<h2>Assgin Here</h2>
<form id="register" action="giveGradeAction.jsp">
<label>Registration No</label><br>
<input type="text" name="Uname" id="name" placeholder="Enter RegNo" required=""><br><br>
<label>Course Name</label><br>
<input type="text" name="Cname" id="name" placeholder="Enter CourseName" required=""><br><br>
<label>Grade</label><br>
<select id="dept" name="date">
<option>S</option>
<option>A</option>
<option>B</option>
<option>C</option>
<option>D</option>
<option>E</option>
<option>F</option>
</select><br><br>



<input type="submit" value="Mark" id="log">
<input type="reset" value="Cancel" id="can">




</form>
</div><br>
        <center>
    <table border="3">
        <tr>
            <td>Grade</td>
            <td>Marks</td>
        </tr>
        <tr>
            <td>Grade S</td>
            <td>140-150</td>
        </tr>
        <tr>
            <td>Grade A</td>
            <td>130-140</td>
        </tr>
        <tr>
            <td>Grade B</td>
            <td>120-130</td>
        </tr>
        <tr>
            <td>Grade C</td>
            <td>110-120</td>
        </tr>
        <tr>
            <td>Grade d</td>
            <td>90-110</td>
        </tr>
        <tr>
            <td>Grade E</td>
            <td>80-90</td>
        </tr>
        <tr>
            <td>Grade F</td>
            <td><80</td>
        </tr>
        
        
    </table>
</center>
    </body>
</html>
