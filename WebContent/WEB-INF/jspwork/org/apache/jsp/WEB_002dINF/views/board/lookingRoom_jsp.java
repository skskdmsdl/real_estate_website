/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-08 10:41:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.BoardForList;
import board.model.vo.RoomBoard;
import java.util.List;
import member.model.vo.Member;
import broker.model.vo.Broker;

public final class lookingRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1596031197602L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1594259972000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("board.model.vo.BoardForList");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.RoomBoard");
    _jspx_imports_classes.add("broker.model.vo.Broker");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//session : 선언없이 사용할 수 있는 jsp내장객체
	Member memberLoggedIn = (Member) session.getAttribute("memberLoggedIn");
	Broker brokerLoggedIn = (Broker) session.getAttribute("brokerLoggedIn");

	//쿠키관련
	Cookie[] cookies = request.getCookies();
	boolean saveIdChecked = false;
	String saveIdValue = "";

	if (cookies != null) {
		for (Cookie c : cookies) {
			String k = c.getName();
			String v = c.getValue();

			//saveId 쿠키 존재여부 확인
			if ("saveId".equals(k)) {
				saveIdChecked = true;
				saveIdValue = v; //memberId
			}
		}

	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>DamoaBang</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//로그인\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#login\").submit(function(){\r\n");
      out.write("\t\tlet $loginId = $(\"#loginId\");\r\n");
      out.write("\t\tlet $loginPwd = $(\"#loginPwd\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($loginId.val().length == 0) {\r\n");
      out.write("\t\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t$loginId.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($loginPwd.val().length == 0) {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t$loginPwd.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//중복체크\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#userId\").blur(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tlet memberId = $(\"#userId\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"");
      out.print( request.getContextPath() );
      out.write("/member/checkIdDuplicate\",\r\n");
      out.write("\t\t\tmethod: \"GET\", \r\n");
      out.write("\t\t\tdata: {\"memberId\": memberId}, \r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tif(data==\"notUsable\"){\r\n");
      out.write("\t\t\t\t\t// 아이디 중복 시 문구\r\n");
      out.write("\t\t\t\t\t$(\"#id_check\").text(\"사용 불가\");\r\n");
      out.write("\t\t\t\t\t$(\"#id_check\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t$(\"#submit\").attr(\"disabled\", true);\r\n");
      out.write("\t\t\t\t}else if(memberId.length!=0&&data==\"usable\"){\r\n");
      out.write("\t\t\t\t\t$(\"#id_check\").text(\"사용가능\");\r\n");
      out.write("\t\t\t\t\t$(\"#id_check\").css(\"color\", \"blue\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, error : function() {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"실패\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("\t//회원 가입\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#register\").submit(function() {\r\n");
      out.write("\t\t\t//아이디검사\r\n");
      out.write("\t\t\tlet $memberId = $(\"#userId\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (!/^[\\w]{4,}$/.test($memberId.val())) {\r\n");
      out.write("\t\t\t\talert(\"아이디가 유효하지 않습니다.\");\r\n");
      out.write("\t\t\t\t$memberId.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t//아이디 중복검사 \r\n");
      out.write("\t\t\t/* let $isIdValid = $(\"#isIdValid\");\r\n");
      out.write("\t\t\tif($isIdValid.val() == 0){\r\n");
      out.write("\t\t\t\talert(\"아이디 중복검사 해주세요.\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t} */\r\n");
      out.write("\r\n");
      out.write("\t\t\t//비밀번호 검사\r\n");
      out.write("\t\t\tlet $pwd1 = $(\"#userPwd\");\r\n");
      out.write("\t\t\tlet $pwd2 = $(\"#userPwdChk\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($pwd1.val() !== $pwd2.val()) {\r\n");
      out.write("\t\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t\t\t$pwd1.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t//마이페이지 연결 리스트(토글버튼처럼 구현)\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\".nav-user-link\").click(function() {\r\n");
      out.write("\t\t\tif ($(\".profile__list\").css(\"display\") == \"none\")\r\n");
      out.write("\t\t\t\t$(\".profile__list\").show();\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\t$(\".profile__list\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\".filter-select__header\").click(function() {\r\n");
      out.write("\t\t\tif ($(\".filter-select__list\").css(\"display\") == \"none\")\r\n");
      out.write("\t\t\t\t$(\".filter-select__list\").show();\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\t$(\".filter-select__list\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header class=\"navbar navbar-expand\" id=\"mainNav\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("\" class=\"navbar-brand\">다모아방</a>\r\n");
      out.write("\t\t\t<div class=\"navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
if (memberLoggedIn != null || brokerLoggedIn != null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if (memberLoggedIn != null && brokerLoggedIn == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (memberLoggedIn.getMemberRole().equals("U")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item-community\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/community/communityQnA\" class=\"nav-link\">커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item-room\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\" class=\"nav-link\">방 찾기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-user-link\"><img style=\"background-color: rgb(255, 136, 81); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" /></a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"profile__list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-img\"><img style=\"background-color: rgb(255, 136, 81); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\">");
      out.print(memberLoggedIn.getMemberId());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-email\">");
      out.print(memberLoggedIn.getEmail());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-info\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberProfileView'\">내 정보 보기</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-logout\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/logout'\">로그아웃</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item-community\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/community/communityQnA\" class=\"nav-link\">커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item-room\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\" class=\"nav-link\">방 찾기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-user-link\"><img style=\"background-color: rgb(0, 0, 255); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"profile__list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-img\"><img style=\"background-color: rgb(0, 0, 255); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\">");
      out.print(memberLoggedIn.getMemberId());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-email\">");
      out.print(memberLoggedIn.getEmail());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-info\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/memberList';\">회원정보 조회</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-logout\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/logout'\">로그아웃</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item-community\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/community/communityQnA\" class=\"nav-link\">커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item-room\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/brokerBoard/boardList\" class=\"nav-link\">방 찾기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-user-link\"><img style=\"background-color: rgb(0, 255, 0); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" /></a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"profile__list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-img\"><img style=\"background-color: rgb(0, 255, 0); border-radius: 60%;\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/user.png\" /></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"login-profile\">");
      out.print(brokerLoggedIn.getBr_name());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"login-profile\" id=\"login-profile-email\">");
      out.print(brokerLoggedIn.getEmail());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-info\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/broker/brokerProfileView'\">내 정보 보기</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"login-mypage\" id=\"login-mypage-logout\"><div onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/broker/logout'\">로그아웃</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/community/communityQnA\" class=\"nav-link\">커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\" class=\"nav-link\">방 찾기</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\" onclick=\"signupbtn()\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 로그인 창 -->\r\n");
      out.write("\t<div id=\"signWrap\"></div>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t<div class=\"form-wrap\">\r\n");
      out.write("\t\t\t<div class=\"button-wrap\">\r\n");
      out.write("\t\t\t\t<div id=\"btn\"></div>\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"loginBtn\" class=\"togglebtn\" onclick=\"login()\">로그인</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"registerBtn\" class=\"togglebtn\" onclick=\"register()\">회원가입</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"HeaderCloseBtn\" id=\"closeBtn\" value=\"x\" onclick=\"closeBtn();\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/login\" id=\"login\" method=\"post\" class=\"input-group\">\r\n");
      out.write("\t\t\t\t<div class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/naver.png\" alt=\"naver\"> <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/facebook.png\" alt=\"facebook\"> <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/google.png\" alt=\"google\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"loginId\" name=\"memberId\" class=\"input-field\" placeholder=\"아이디를 입력해주세요\" required value=\"");
      out.print(saveIdChecked ? saveIdValue : "");
      out.write("\" /> <input type=\"password\" id=\"loginPwd\" name=\"password\" class=\"input-field\" placeholder=\"비밀번호를 입력해주세요\" required>\r\n");
      out.write("\t\t\t\t<div id=\"chkWrap\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" class=\"checkbox\" name=\"saveId\" ");
      out.print(saveIdChecked ? "checked" : "");
      out.write(" />아이디 저장 <span class=\"checkbox brokerChk\" id=\"br_frm\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/broker/index'\">중개인이세요?</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"submit\" value=\"로그인\" /> <a id=\"findLink\" onclick=\"findLink()\">비밀번호 찾기</a>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form id=\"register\" action=\"");
      out.print(request.getContextPath());
      out.write("/member/enroll\" method=\"post\" onsubmit=\"return resisterVal();\" class=\"input-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"userId\" name=\"memberId\" class=\"input-field\" placeholder=\"User ID\" required>\r\n");
      out.write("\t\t\t\t<div id=\"id_check\"></div>\r\n");
      out.write("\t\t\t\t<input type=\"email\" id=\"userEmail\" name=\"email\" class=\"input-field\" placeholder=abc@xyz.com required> <input type=\"password\" id=\"userPwd\" name=\"password\" class=\"input-field\" placeholder=\"Enter Password\" required> <input type=\"password\" id=\"userPwdChk\" class=\"input-field\" placeholder=\"Enter Password Check\" required> <input type=\"tel\" id=\"userPhone\" name=\"phone\" class=\"input-field\" placeholder=\"(-없이)01012345678\" maxlength=\"11\" required>\r\n");
      out.write("\t\t\t\t<button class=\"submit\">회원가입</button>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/broker/enroll\">중개인 회원가입</a>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 비밀번호 찾기 추가!!! -->\r\n");
      out.write("\t<div id=\"find_wrap\">\r\n");
      out.write("\t\t<div class=\"findFrm-wrap\">\r\n");
      out.write("\t\t\t<input type=\"button\" id=\"find_closeBtn\" value=\"x\" onclick=\"find_closeBtn();\">\r\n");
      out.write("\t\t\t<p>비밀번호 찾기</p>\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/findPwd\" id=\"find-pwd\" method=\"post\" class=\"input-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"input-email\" name=\"email\" class=\"input-field\" placeholder=\"이메일을 입력해주세요\" required /> \r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"findId-submit\" value=\"이메일 전송\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//로그인 관련\r\n");
      out.write("\t\tlet x = document.getElementById(\"login\");\r\n");
      out.write("\t\tlet y = document.getElementById(\"register\");\r\n");
      out.write("\t\tlet z = document.getElementById(\"btn\");\r\n");
      out.write("\t\tlet loginbtn = document.getElementById(\"loginBtn\");\r\n");
      out.write("\t\tlet registerbtn = document.getElementById(\"registerBtn\");\r\n");
      out.write("\r\n");
      out.write("\t\tfunction login() {\r\n");
      out.write("\t\t\tx.style.left = \"50px\";\r\n");
      out.write("\t\t\ty.style.left = \"450px\";\r\n");
      out.write("\t\t\tz.style.left = \"0\";\r\n");
      out.write("\t\t\tloginbtn.style.color = \"white\";\r\n");
      out.write("\t\t\tregisterbtn.style.color = \"black\";\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction register() {\r\n");
      out.write("\t\t\tx.style.left = \"-400px\";\r\n");
      out.write("\t\t\ty.style.left = \"50px\";\r\n");
      out.write("\t\t\tz.style.left = \"110px\";\r\n");
      out.write("\t\t\tloginbtn.style.color = \"black\";\r\n");
      out.write("\t\t\tregisterbtn.style.color = \"white\";\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction signupbtn() {\r\n");
      out.write("\t\t\twrap.style.display = \"block\";\r\n");
      out.write("\t\t\tsignWrap.style.display = \"block\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction closeBtn() {\r\n");
      out.write("\t\t\twrap.style.display = \"none\";\r\n");
      out.write("\t\t\tsignWrap.style.display = \"none\";\r\n");
      out.write("\t\t\t$(\"#register\").children().val('');\r\n");
      out.write("\t\t\t$(\"#loginPwd\").val('');\r\n");
      out.write("\t\t\t$(\"#id_check\").text(\"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/* 추가!!!!! */\r\n");
      out.write("\t\tfunction find_closeBtn() {\r\n");
      out.write("\t\t\tfind_wrap.style.display = \"none\";\r\n");
      out.write("\t\t\tsignWrap.style.display = \"none\";\r\n");
      out.write("\t\t\t$(\"#register\").children().val('');\r\n");
      out.write("\t\t\t$(\"#loginPwd\").val('');\r\n");
      out.write("\t\t\t$(\"#id_check\").text(\"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction findLink() {\r\n");
      out.write("\t\t\twrap.style.display = \"none\";\r\n");
      out.write("\t\t\tfind_wrap.style.display = \"block\";\r\n");
      out.write("\t\t\t$(\"#register\").children().val('');\r\n");
      out.write("\t\t\t$(\"#loginPwd\").val('');\r\n");
      out.write("\t\t\t$(\"#id_check\").text(\"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>");
      out.write('\r');
      out.write('\n');

	//List<Room> list = (List<Room>)request.getAttribute("list");
	List<RoomBoard> list = (List<RoomBoard>)request.getAttribute("list");
	String pageBar = (String)request.getAttribute("pageBar");
	int cnt = (int)request.getAttribute("totalContents");
	String location = (String)request.getAttribute("location");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/board.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"nav-bar\">\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\" class=\"RoomSearch-nav\">매물 검색</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"lookinRoomView\">\r\n");
      out.write("\t\t     \t<section id=\"option-tab\" style=\"display: inline\">\r\n");
      out.write("\t\t     \t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/board/searchRoom\" style=\"display: inline\">\r\n");
      out.write("\t\t\t            <select name=\"room_val\" class=\"selectOption\" >\r\n");
      out.write("\t\t\t                <option value=\"OO\">오픈형 원룸</option> \r\n");
      out.write("\t\t\t                <option value=\"SO\">분리형 원룸</option>\r\n");
      out.write("\t\t\t                <option value=\"OT\">오픈형 투룸</option>\r\n");
      out.write("\t\t\t                <option value=\"ST\">분리형 투룸</option>\r\n");
      out.write("\t\t\t            </select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t            <select name=\"tax_val\" class=\"selectOption\" >\r\n");
      out.write("\t\t\t                <option value=\"M\" >월세</option>\r\n");
      out.write("\t\t\t                <option value=\"Y\" >전세</option>\r\n");
      out.write("\t\t\t            </select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t            <select name=\"price\" class=\"selectOption\" >\r\n");
      out.write("\t\t\t                <option value=\"45\" >월 ~ 45</option>\r\n");
      out.write("\t\t\t                <option value=\"100\" >45 ~ 100</option>\r\n");
      out.write("\t\t\t            </select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t            <select name=\"fee\" class=\"selectOption\" >\r\n");
      out.write("\t\t\t                <option value=\"5\" >관리비 ~5만</option>\r\n");
      out.write("\t\t\t                <option value=\"10\" >5~10만 </option>\r\n");
      out.write("\t\t\t                <option value=\"20\" >10~20만</option>\r\n");
      out.write("\t\t\t            </select>\r\n");
      out.write("\t\t\t            <select name=\"option\" class=\"selectOption\" >\r\n");
      out.write("\t\t\t                <option value=\"oneRoom\" >추가옵션</option>\r\n");
      out.write("\t\t\t                <option value=\"twoRoom\" >세탁기</option>\r\n");
      out.write("\t\t\t                <option value=\"threeRoom\" >냉장고</option>\r\n");
      out.write("\t\t\t            </select>\r\n");
      out.write("\t\t     \t\t\t<input type=\"submit\" class=\"room-searchBtn\" value=\"검색\">\r\n");
      out.write("\t\t     \t\t</form>\r\n");
      out.write("\t\t     \t</section>\r\n");
      out.write("\t\t     \t\t<form action=\"");
      out.print( request.getContextPath() );
      out.write("/board/searchLocationRoom\"  id=\"map-searchFrm\">\r\n");
      out.write("\t\t\t            <input type=\"text\" name=\"localSearch\" id=\"localSearch\" placeholder=\"지역별 검색\" >\r\n");
      out.write("\t\t\t            <button type=\"submit\" class=\"room-searchBtn\">검색</button>\r\n");
      out.write("\t\t     \t\t</form>\r\n");
      out.write("\t\t     \t<section class=\"RoomInsert\">\r\n");
      out.write("\t\t     \t\t<button class=\"roomUpdateBtn\" >방 올리기</button>\r\n");
      out.write("\t\t     \t</section>\r\n");
      out.write("\t\t     </div>  \t\r\n");
      out.write("\t\t<div id=\"roomViewCon1\">\r\n");
      out.write("            <h2>전체 게시글 : ");
      out.print( cnt );
      out.write("개</h2>\r\n");
      out.write("\t ");
 
	 if(list == null || list.isEmpty()){ 
      out.write("           \r\n");
      out.write("         \t");
      out.write("\r\n");
      out.write("\t\t\t\t<div>조회된 행이 없습니다.</div>\r\n");
      out.write("\t\t");
 
			} 
		   	else {
				for(RoomBoard b : list){
		
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("               <div>\r\n");
      out.write("\t\t                ");
 if(b.getOk().equals("T")){ 
      out.write("\r\n");
      out.write("\t\t                \t\r\n");
      out.write("\t\t\t            \t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/board/boardView?board_num=");
      out.print( b.getBoard_num() );
      out.write("&br=");
      out.print( b.getBr_cp_id() );
      out.write("\" >\r\n");
      out.write("\t\t\t                \t<img src=\"");
      out.print(request.getContextPath());
      out.write("/upload/board/");
      out.print(b.getRenameName() );
      out.write("\" onerror=\"this.src='");
      out.print( request.getContextPath() );
      out.write("/images/roomImg01.jpg'\">\r\n");
      out.write("\t\t\t            \t</a>\r\n");
      out.write("\t\t            \t");
 } else{ 
      out.write("\r\n");
      out.write("\t\t            \t\t\t<input ");
      out.print( memberLoggedIn.getMemberRole().equals("A") ? "type='button'" : "type='hidden'" );
      out.write("  class=\"okBtn\" value=\"");
      out.print( b.getBoard_num() );
      out.write("\" style=\"z-index:10;cursor:pointer; width:400px; height:280px;background-color:rgba(0,0,0,0.1); border: none;color:rgba(0,0,0,0);position: absolute;margin: 0;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/upload/board/");
      out.print(b.getRenameName() );
      out.write("\" onerror=\"this.src='");
      out.print( request.getContextPath() );
      out.write("/images/roomImg01.jpg'\" ");
      out.print( memberLoggedIn.getMemberRole().equals("A") ? "" : "onclick='alret();'" );
      out.write(" style=\"filter: brightness(50%); cursor: pointer;\">\r\n");
      out.write("\t\t            \t\r\n");
      out.write("\t\t            \t");
 } 
      out.write(" \r\n");
      out.write("\t\t            <br>\r\n");
      out.write("\t\t            <input type=\"text\" value=\"등록날짜  ");
      out.print( b.getEnrolldate() );
      out.write("\"> <br />\r\n");
      out.write("\t\t             \t");
      out.print( b.getBoard_title() );
      out.write("\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t         ");
 		}
				
					} 
				
      out.write("  \t \r\n");
      out.write("\t\t<div id='pageBar'>\r\n");
      out.write("\t\t\t");
      out.print( pageBar );
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"roomViewCon2\">\r\n");
      out.write("\t\t<div id=\"map\" style=\"width:100%;height:800px;\" ></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=f812560fa3200866e643713203eb962f&libraries=services\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//방올리기\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    \r\n");
      out.write("    $(\".roomUpdateBtn\").click(function(){\r\n");
      out.write("    \talert(\"방을 올리시려면 중개인에게 연락해주세요!\");\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("function alret(){\r\n");
      out.write("    alert(\"비공개 게시글입니다.\");\r\n");
      out.write("}\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\".okBtn\").click(function(){\r\n");
      out.write("\tif(!confirm(\"게시물을 공개처리 하시겠습니까?\")) return;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.print( request.getContextPath() );
      out.write("/admin/moveOk\",\r\n");
      out.write("\t\t\tmethod: \"POST\", \r\n");
      out.write("\t\t\tdataType: \"text\", //html, text, json, xml 리턴된 데이터에 따라 자동설정됨\r\n");
      out.write("\t\t\tdata:  {\"board_num\": $(\".okBtn\").val()}, //사용자 입력값전달\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t//요청성공시 호출되는 함수\r\n");
      out.write("\t\t\t\tconsole.log(\"데이터\"+data);\r\n");
      out.write("\t\t\t\t//$(\".result-container\").html(data);\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/board/lookingRoom\";\r\n");
      out.write("\t\t\t\thistory.go(0);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(xhr, textStatus, errorThrown){\r\n");
      out.write("\t\t\t\tconsole.log(\"ajax 요청 실패!\");\r\n");
      out.write("\t\t\t\tconsole.log(xhr, textStatus, errorThrown);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("var mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("mapOption = {\r\n");
      out.write("    center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("    level: 3 // 지도의 확대 레벨\r\n");
      out.write("};  \r\n");
      out.write("\r\n");
      out.write("//지도를 생성합니다    \r\n");
      out.write("var map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("\r\n");
      out.write("//주소-좌표 변환 객체를 생성합니다\r\n");
      out.write("var geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\r\n");
      out.write("//주소로 좌표를 검색합니다\r\n");
      out.write("geocoder.addressSearch('");
      out.print( location );
      out.write("', function(result, status) {\r\n");
      out.write("\r\n");
      out.write("// 정상적으로 검색이 완료됐으면 \r\n");
      out.write(" if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\r\n");
      out.write("    var coords = new kakao.maps.LatLng(result[0].y, result[0].x);\r\n");
      out.write("\r\n");
      out.write("    // 결과값으로 받은 위치를 마커로 표시합니다\r\n");
      out.write("    var marker = new kakao.maps.Marker({\r\n");
      out.write("        map: map,\r\n");
      out.write("        position: coords\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다\r\n");
      out.write("    map.setCenter(coords);\r\n");
      out.write("} \r\n");
      out.write("});    \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>Copyright 2020 <strong class=\"rot\">RoomOfTruth</strong>. All rights reserved.</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
