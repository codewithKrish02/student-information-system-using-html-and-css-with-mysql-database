
<html>
<head>
<title>
Faculty Registration Form
</title>
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
            background: #2d85d0;
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
        #num{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #desig{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #ph{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #dept{
            width: 300px;
            padding: 7px;
            border: none;
            border-radius: 3px;
            outline: 0;
        }
        #sub{
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
    </style>
    <script>
        function checkpassword()
        {
            var p=f.pass.value;
            var cp=f.repass.value;
            
            if(p!=cp)
                {
                    msg=(p==cp)?"Both are some":"mismatch passwords";
                    alert(msg)
                }
           
        }
    </script>
</head>
<body style="background-color: rgb(243,254,255);">
<div align="center">
     <img src="studentinfo.jpg" width=100 height=80/>
<font face="vijaya" size=30px color="black">FACULTY INFORMATION SYSTEM</font>
</div>
    </br>
    
<%@include file="CSS3 Menu.html" %>
<h1 align="center">Faculty Registration Form</h1>
<div class="register">
<h2>Register here</h2>
<form id="register" method="post" name="f" action="Reg_faculty.jsp">
<label>FirstName</label><br>
<input type="text" name="Fname" id="name" placeholder="Enter First name" required=""><br><br>
<label>LastName</label><br>
<input type="text" name="Lname" id="name" placeholder="Enter Last name" required=""><br><br>
<label>College Email Id</label><br>
<input type="text" name="email" id="name" placeholder="Enter email" required="@"><br><br>
<label>Department</label><br>
<select id="dept" name="dept">
<option>COMPUTERS</option>
<option>ELECTRONICS</option>
<option>PHYSICS</option>
<option>MECHANICAL</option>
<option>MATHS</option>
</select><br><br>

<label>Designation</label><br>
<select id="desig" name="desig">
<option>Asst.Prof</option>
<option>Prof</option>
</select><br><br>

<label>Date Of Birth</label><br>
<input type="date" name="date" id="name" placeholder="Enter date of birth" required=""><br><br>

<label>Gender</label><br>
<select id="state" required="" name="male">
    <option>Male</option>
    <option>Female</option>
    <option>Others</option>
</select><br><br>

<label>Phone Number</label><br>
<input type="number" name="MNum" id="num" placeholder="Enter mobile number" required=""><br><br>
<label>Address</label><br>
<textarea cols=20 rows=10 placeholder="Enter address" name="addr" id="name" required=""></textarea><br><br>
<label>Faculty Id</label><br>
<input type="text" name="FacNo" id="num" placeholder="Enter your Id No" required=""><br><br>
<label>Password</label><br>
<input type="password" name="pass" id="name" placeholder="Enter password" required=""><br><br>
<label>Re-type Password</label><br>
<input type="password" name="repass" id="name" placeholder="Re-Enter password" required=""><br><br>
<label>Photo</label><br>
<input type="file" name="photo" id="name"><br><br>
<input type="checkbox" id="check" required=""/><label>  I Accept Terms and Conditions</label><br><br>
<input type="submit" value="Submit" id="sub" required="" onclick="checkpassword()">
<input type="reset" value="Cancel" id="can" required="">

</form>
</div>
</body>