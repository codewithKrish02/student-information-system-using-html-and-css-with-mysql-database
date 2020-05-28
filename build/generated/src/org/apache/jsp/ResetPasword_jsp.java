package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResetPasword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reset password</title>\n");
      out.write("        <style>\n");
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
      out.write("            background: #2d85b0;\n");
      out.write("            width: 500px;\n");
      out.write("            margin: 0px 0px 0px 410px;\n");
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
      out.write("        #dept{\n");
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
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: rgb(243,254,255);\">\n");
      out.write("        <br>\n");
      out.write("        <div align=\"center\">\n");
      out.write("    <img src=\"studentinfo.jpg\" width=100 height=80/>\n");
      out.write("<font face=\"vijaya\" size=30px color=\"black\">STUDENT INFORMATION SYSTEM</font>\n");
      out.write("</div>\n");
      out.write("    ");
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
      out.write("\t<li class=\"toplast\"><a href=\"Login.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/service.png\" alt=\"\"/>LOGIN</a></li>\r\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">HTML Top Menu </a> by Css3Menu.com</p>\r\n");
      out.write("<!-- End css3menu.com BODY section -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("    <h1 align=\"center\">RESET PASSWORD FORM</h1>\n");
      out.write("    <div class=\"register\">\n");
      out.write("<h2>Reset here</h2>\n");
      out.write("<form id=\"register\" method=\"post\" action=\"\">\n");
      out.write("<label>Old Password</label><br>\n");
      out.write("<input type=\"text\" name=\"Fname\" id=\"name\" placeholder=\"Enter First name\" required=\"\"><br><br>\n");
      out.write("<label>New Password</label><br>\n");
      out.write("<input type=\"text\" name=\"Lname\" id=\"name\" placeholder=\"Enter Last name\" required=\"\"><br><br>\n");
      out.write("<label>Retype Password</label><br>\n");
      out.write("<input type=\"text\" name=\"email\" id=\"name\" placeholder=\"Enter email\" required=\"@\"><br><br>\n");
      out.write("<input type=\"submit\" value=\"Submit\" id=\"sub\" required=\"\">\n");
      out.write("<input type=\"reset\" value=\"Cancel\" id=\"can\" required=\"\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
