<html>
<head>
<title>
LOGIN PAGE
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
        </style>
        <script>
            function checkpassword()
        {
            var p=f.pass.value;
            var cp=f.repass.value;
            
            if(p!=cp)
                {
                    msg=(p==cp)?"Both are Same":"mismatch passwords";
                    alert(msg)
                }
        }
        </script>
</head>
<body style="background-color: rgb(243,254,255);">
<br>
<div align="center">
    <img src="studentinfo.jpg" width="100" height="75" id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
    
<%@include file="CSS3 Menu.html" %>
<h1 align="center">ADMIN FORGOT PASSWORD</h1>
<div class="register">
<h2>Change here</h2>
<form id="register" name="f" action="AdminForgotPasswordAction.jsp">
<label>Username</label><br>
<input type="text" name="Uname" id="name" placeholder="Enter username" required=""><br><br>
<label>New Password</label><br>
<input type="password" name="pass" id="name" placeholder="Enter password" required=""><br><br>
<label>Re-type Password</label><br>
<input type="password" name="repass" id="name" placeholder="Enter password" required=""><br><br>

<input type="submit" value="Change" id="log">
<input type="reset" value="Cancel" id="can">

</form>
</div>
</body>
</html>