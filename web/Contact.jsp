
<html>
<head>
<title>
Student Information System
</title>
    <style>
        .contact{
    width: 360px;
    float: left;
    margin-right: 20px;
}
.contactpic{
    width: 360px;
    float: left;
    margin-right: 500px;
}
        .sicon{width:800px;
margin:0 auto;
}
.sicon ul {
text-align:right;
}
.sicon ul li {
list-style-type:none;
display:inline;
}
.sicon ul li a{
opacity:0.7;
padding:5px 10px 5px 10px;
}
.sicon ul li a:hover{
opacity:1;
}

    </style>
  
</head>
<body style="background-color: rgb(243,254,255);">
    
<div align="center">  
      <img src="studentinfo.jpg" width=100 height=80 id="img1"/>
<font face="vijaya" size=30px color="black">STUDENT INFORMATION SYSTEM</font>
</div>
    </br>
<%@include file="CSS3 Menu.html" %>
<br>
<br>
    
<div class="contactpic">
        <img src="CONTACT1.png" id="img11"/>
        <img src="CONTACT2.png" id="img12">
</div>
    <div class="contact" align="center">
        <form method="post" action="Contactdb.jsp"> 
        <h1>Contact Us</h1>
        <input type="text" placeholder="Enter Name" size="50" name="name"/><br><br>
        <input type="text" placeholder="Enter Email" size="50" name="email"/><br><br>
        <textarea cols="47" rows="10" Placeholder="Enter Description" name="description"></textarea><br><br>
        <input type="submit" value="submit"/>
        <input type="reset" value="cancel"/>
        </form>
        </div>    
<div class="sicon">
<ul>
<li><a href="https://www.facebook.com/"><img src="si1.png" /></a></li><li><a href="https://www.linkedin.com/uas/login"><img src="si2.png" /></a></li><li><a href="https://twitter.com/login/"><img src="si3.png" /></a></li><li><a href="https://plus.google.com"><img src="si4.png" /></a></li>
</ul></div>
</body>
</html>