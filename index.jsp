<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//此处以user为样例模拟登录，项目中根据情况参考ssoShrLogin.ShrLogin类实现IUserNameBuilder接口来获取当前登录的用户
request.getSession().setAttribute("username","user");%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <a href="shr/loginhr.jsp?redirectTo=/home.do">登录金蝶SHR</a>
	<a href="logout.jsp">注销</a>
	<a href="shr/loginhr.jsp?redirectTo=/dynamic.do?uipk=com.com.kingdee.eas.basedata.person.app.Person.dynamicList&serviceId=IKbSNaOER2eTbDRX81jI7fI9KRA%3D&inFrame=true">打开员工列表</a>
  </body>
</html>
