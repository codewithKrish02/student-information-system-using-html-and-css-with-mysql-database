package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class MarkAttendance1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/connection.jsp");
    _jspx_dependants.add("/Facultyprofilecss.html");
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","root","1432");
        out.println("Connected");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> View Student</title>\n");
      out.write("    </head>\n");
      out.write("  <body style=\"background-color: rgb(243,254,255);\">\n");
      out.write("        <div align=\"center\">  \n");
      out.write("      <img src=\"studentinfo.jpg\" width=100 height=80 id=\"img1\"/>\n");
      out.write("<font face=\"vijaya\" size=30px color=\"black\">STUDENT INFORMATION SYSTEM</font>\n");
      out.write("</div>\n");
      out.write("    </br>\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>css3menu.com</title>\r\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"Facultyprofilecss_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\r\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#EBEBEB\">\r\n");
      out.write("<!-- Start css3menu.com BODY section -->\r\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\r\n");
      out.write("\t<li class=\"topfirst\"><a href=\"FacultyHome.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"Facultyprofilecss_files/css3menu1/home.png\" alt=\"\"/>HOME</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"FacultyProfile.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"Facultyprofilecss_files/css3menu1/service.png\" alt=\"\"/>PROFILE</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"#\" style=\"height:32px;line-height:32px;\"><span><img src=\"Facultyprofilecss_files/css3menu1/contact.png\" alt=\"\"/>EXAMINATION</span></a>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"#\"><span>ASSIGN MARK</span></a>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"AssignCatMarks.jsp\">CAT MARKS</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"AssignAssignmentMarks.jsp\">ASSIGNMENT MARKS</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"AssignInternalMarks.jsp\">INTERNAL MARKS</a></li>\r\n");
      out.write("                        <li><a href=\"giveAssignment.jsp\">GIVE ASSIGNMENT</a></li>\r\n");
      out.write("                        <li><a href=\"giveGrade.jsp\">GIVE GRADE</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t</ul></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"MarkAttendance.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"Facultyprofilecss_files/css3menu1/news.png\" alt=\"\"/>ATTENDANCE</a></li>\r\n");
      out.write("\t<li class=\"toplast\"><a href=\"FacultyLogin.jsp\" onclick=\"session.terminate()\" style=\"height:32px;line-height:32px;\"><img src=\"Facultyprofilecss_files/css3menu1/register.png\" alt=\"\"/>LOGOUT</a></li>\r\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">HTML Top Menu </a> by Css3Menu.com</p>\r\n");
      out.write("<!-- End css3menu.com BODY section -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");

    String k=(String)session.getAttribute("id");

      out.write("\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <form action=\"MarkAttendanceAction1.jsp\">\n");
      out.write("            <h1>Student Attendance</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>Registration Number</td>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td>Course</td>\n");
      out.write("                <td>Attendance</td>\n");
      out.write("               </tr>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    String p="pending";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from student_registration");//where status='"+p+"'
                    while(rs.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"regno\" value=\"");
      out.print(rs.getString(9));
      out.write("\"></td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write(' ');
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td><select name=\"course\">\n");
      out.write("                            <option>Java</option>\n");
      out.write("                        </select></td>\n");
      out.write("                        <td><select name=\"attend\">\n");
      out.write("                            <option>Present</option>\n");
      out.write("                            <option>Absent</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                    
      out.write("\n");
      out.write("                                 \n");
      out.write("                 \n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("                     <input type=\"submit\" value=\"submit\">\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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
