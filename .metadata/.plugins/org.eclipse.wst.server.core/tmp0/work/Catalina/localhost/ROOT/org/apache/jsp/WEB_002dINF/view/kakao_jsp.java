/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2021-04-01 03:59:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kakao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>카카오 API 테스트</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<h1>웹문서 검색 테스트</h1>\r\n");
      out.write("\r\n");
      out.write("\t<p></p>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"title\" style=\"text-align: center;\"></div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"thumbnail\" style=\"text-align: center;\"></div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"contents\"\r\n");
      out.write("\t\tstyle=\"text-align: center; height: 100px; width: 300px; margin: auto;\"></div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n");
      out.write("\t\tintegrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tmethod : \"GET\",\r\n");
      out.write("\t\t\turl : \"https://dapi.kakao.com/v2/search/web\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tquery : \"이효리\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\theaders : {\r\n");
      out.write("\t\t\t\tAuthorization : \"KakaoAK d6ed1d1cbb3e2caa8769e2c3e233acca\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).done(\r\n");
      out.write("\t\t\t\tfunction(msg) {\r\n");
      out.write("\t\t\t\t\tconsole.log(msg.documents[0].datetime);\r\n");
      out.write("\t\t\t\t\tconsole.log(msg.documents[0].contents);\r\n");
      out.write("\t\t\t\t\t$(\"p\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<strong>\" + msg.documents[0].datetime\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</strong>\");\r\n");
      out.write("\t\t\t\t\t$(\"p\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<strong>\" + msg.documents[0].contents\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</strong>\");\r\n");
      out.write("\t\t\t\t\t$(\"p\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<img src='\" + msg.documents[0].contents + \"'/>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tmethod : \"GET\",\r\n");
      out.write("\t\t\turl : \"https://dapi.kakao.com/v3/search/book?target=title\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tquery : \"name\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\theaders : {\r\n");
      out.write("\t\t\t\tAuthorization : \"KakaoAK d6ed1d1cbb3e2caa8769e2c3e233acca\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).done(\r\n");
      out.write("\t\t\t\tfunction(msg) {\r\n");
      out.write("\t\t\t\t\tconsole.log(msg.documents[1].title);\r\n");
      out.write("\t\t\t\t\tconsole.log(msg.documents[1].thumbnail);\r\n");
      out.write("\t\t\t\t\tconsole.log(msg.documents[1].contetns);\r\n");
      out.write("\t\t\t\t\t$(\"#title\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<strong>\" + msg.documents[1].title + \"</strong>\");\r\n");
      out.write("\t\t\t\t\t$(\"#thumbnail\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<img src='\" + msg.documents[1].thumbnail + \"'/>\");\r\n");
      out.write("\t\t\t\t\t$(\"#contents\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\"<strong>\" + msg.documents[1].contents\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</strong>\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
