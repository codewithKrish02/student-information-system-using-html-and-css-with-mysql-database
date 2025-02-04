package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentRegistrationForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CSS3 Menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>\n");
      out.write("Student Registration Form\n");
      out.write("</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .register{\n");
      out.write("            background: #2d85d0;\n");
      out.write("            width: 500px;\n");
      out.write("            margin: 0px 0px 0px 480px;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        #register{\n");
      out.write("            margin-left: 80px;\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("        color: white;\n");
      out.write("        font-family: sans-serif; \n");
      out.write("        font-size: 18px;\n");
      out.write("        font-style: italic;\n");
      out.write("        }\n");
      out.write("        #name{\n");
      out.write("            width: 300px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("            padding: 7px;\n");
      out.write("        }\n");
      out.write("        #num{\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 7px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("        }\n");
      out.write("        #desig{\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 7px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("        }\n");
      out.write("        #ph{\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 7px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("        }\n");
      out.write("        #dept{\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 7px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("        }\n");
      out.write("        #state{\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 7px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: 0;\n");
      out.write("        }\n");
      out.write("        #sub{\n");
      out.write("            width: 120px;\n");
      out.write("            padding: 7px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            font-style: italic;\n");
      out.write("            font-weight: 600;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("        #can{\n");
      out.write("                width: 120px;\n");
      out.write("            padding: 7px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            font-style: italic;\n");
      out.write("            font-weight: 600;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function checkpassword()\n");
      out.write("        {\n");
      out.write("            var p=f.pass.value;\n");
      out.write("            var cp=f.repass.value;\n");
      out.write("            \n");
      out.write("            if(p!=cp)\n");
      out.write("                {\n");
      out.write("                    msg=(p==cp)?\"Both are some\":\"mismatch passwords\";\n");
      out.write("                    alert(msg)\n");
      out.write("                }\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: rgb(243,254,255);\">\n");
      out.write("<div align=\"center\">\n");
      out.write("     <img src=\"studentinfo.jpg\" width=100 height=80/>\n");
      out.write("<font face=\"vijaya\" size=30px color=\"black\">STUDENT INFORMATION SYSTEM</font>\n");
      out.write("</div>\n");
      out.write("    </br>\n");
      out.write("    \n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>css3menu.com</title>\r\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS3 Menu_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\r\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#EBEBEB\">\r\n");
      out.write("<!-- Start css3menu.com BODY section -->\r\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\r\n");
      out.write("\t<li class=\"topfirst\"><a href=\"Home.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/home.png\" alt=\"\"/>HOME</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"About.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/find.png\" alt=\"\"/>ABOUT</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"Contact.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/help.png\" alt=\"\"/>CONTACT US</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"#\" style=\"height:32px;line-height:32px;\"><span><img src=\"CSS3 Menu_files/css3menu1/favour.png\" alt=\"\"/>REGISTER</span></a>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"StudentRegistrationForm.jsp\">STUDENT</a></li>\r\n");
      out.write("\t\t<li><a href=\"FacultyRegistrationForm.jsp\">FACULTY</a></li>\r\n");
      out.write("\t</ul></li>\r\n");
      out.write("\t<li class=\"toplast\"><a href=\"#\" style=\"height:32px;line-height:32px;\"><span><img src=\"CSS3 Menu_files/css3menu1/service.png\" alt=\"\"/>LOGIN</span></a>\r\n");
      out.write("        <ul>\r\n");
      out.write("\t\t<li><a href=\"StudentLogin.jsp\">STUDENT LOGIN</a></li>\r\n");
      out.write("\t\t<li><a href=\"FacultyLogin.jsp\">FACULTY LOGIN</a></li>\r\n");
      out.write("                <li><a href=\"AdminLogin.jsp\">ADMIN LOGIN</a></li>\r\n");
      out.write("                \r\n");
      out.write("\t</ul></li>\r\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">HTML Top Menu </a> by Css3Menu.com</p>\r\n");
      out.write("<!-- End css3menu.com BODY section -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<h1 align=\"center\">Student Registration Form</h1>\n");
      out.write("<div class=\"register\">\n");
      out.write("<h2>Register here</h2>\n");
      out.write("<form id=\"register\" method=\"post\" name=\"f\" action=\"Reg_Student.jsp\">\n");
      out.write("<label>FirstName</label><br>\n");
      out.write("<input type=\"text\" name=\"Fname\" id=\"name\" placeholder=\"Enter First name\" required=\"\"><br><br>\n");
      out.write("<label>LastName</label><br>\n");
      out.write("<input type=\"text\" name=\"Lname\" id=\"name\" placeholder=\"Enter Last name\" required=\"\"><br><br>\n");
      out.write("<label>College Email Id</label><br>\n");
      out.write("<input type=\"text\" name=\"email\" id=\"name\" placeholder=\"Enter email\" required=\"@\"><br><br>\n");
      out.write("<label>Branch</label><br>\n");
      out.write("<select id=\"dept\" name=\"dept\">\n");
      out.write("<option>CSE</option>\n");
      out.write("<option>ECE</option>\n");
      out.write("<option>EEE</option>\n");
      out.write("<option>MECH</option>\n");
      out.write("<option>IT</option>\n");
      out.write("<option>MTSE</option>\n");
      out.write("<option>MTBT</option>\n");
      out.write("</select><br><br>\n");
      out.write("\n");
      out.write("<label>State</label><br>\n");
      out.write("<select id=\"state\" name=\"state\">\n");
      out.write("<option>Andhra pradesh</option>\n");
      out.write("<option>Arunachal pradesh</option>\n");
      out.write("<option>Assam</option>\n");
      out.write("<option>Bihar</option>\n");
      out.write("<option>Chhattisgarh</option>\n");
      out.write("<option>Goa</option>\n");
      out.write("<option>Gujarath</option>\n");
      out.write("<option>Haryana</option>\n");
      out.write("<option>Himachal pradesh</option>\n");
      out.write("<option>Jammu and kashmir</option>\n");
      out.write("<option>Jharkhand</option>\n");
      out.write("<option>Karnataka</option>\n");
      out.write("<option>Kerala</option>\n");
      out.write("<option>Madhya pradesh</option>\n");
      out.write("<option>Maharashtra</option>\n");
      out.write("<option>Manipur</option>\n");
      out.write("<option>Meghalaya</option>\n");
      out.write("<option>Mizoram</option>\n");
      out.write("<option>Nagaland</option>\n");
      out.write("<option>Odisha</option>\n");
      out.write("<option>Punjab</option>\n");
      out.write("<option>Rajasthan</option>\n");
      out.write("<option>Sikkim</option>\n");
      out.write("<option>Tamil nadu</option>\n");
      out.write("<option>Telangana</option>\n");
      out.write("<option>Tripura</option>\n");
      out.write("<option>Uttar pradesh</option>\n");
      out.write("<option>Uttarkhand</option>\n");
      out.write("<option>West bengal</option>\n");
      out.write("</select><br><br>\n");
      out.write("\n");
      out.write("<label>Date Of Birth</label><br>\n");
      out.write("<input type=\"date\" name=\"date\" id=\"name\" placeholder=\"Enter date of birth\" required=\"\"><br><br>\n");
      out.write("\n");
      out.write("<label>Gender</label><br>\n");
      out.write("<select id=\"state\" required=\"\" name=\"male\">\n");
      out.write("    <option>Male</option>\n");
      out.write("    <option>Female</option>\n");
      out.write("    <option>Others</option>\n");
      out.write("</select><br><br>\n");
      out.write("<label>Phone Number</label><br>\n");
      out.write("<input type=\"number\" name=\"MNum\" id=\"num\" placeholder=\"Enter mobile number\" required=\"\"><br><br>\n");
      out.write("<label>Address</label><br>\n");
      out.write("<textarea cols=20 rows=10 placeholder=\"Enter address\" name=\"addr\" id=\"name\" required=\"\"></textarea><br><br>\n");
      out.write("<label>Registration Number</label><br>\n");
      out.write("<input type=\"text\" name=\"FacNo\" id=\"num\" placeholder=\"Enter your Id No\" required=\"\"><br><br>\n");
      out.write("<label>Password</label><br>\n");
      out.write("<input type=\"password\" name=\"pass\" id=\"name\" placeholder=\"Enter password\" required=\"\"><br><br>\n");
      out.write("<label>Re-type Password</label><br>\n");
      out.write("<input type=\"password\" name=\"repass\" id=\"name\" placeholder=\"Re-Enter password\" required=\"\"><br><br>\n");
      out.write("<label>Photo</label><br>\n");
      out.write("<input type=\"file\" name=\"photo\" id=\"name\"><br><br>\n");
      out.write("<input type=\"checkbox\" id=\"check\" required=\"\" checked=\"\"/><label>  I Accept Terms and Conditions</label><br><br>\n");
      out.write("<input type=\"submit\" value=\"Submit\" id=\"sub\" required=\"\" onclick=\"checkpassword()\">\n");
      out.write("<input type=\"reset\" value=\"Cancel\" id=\"can\" required=\"\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
