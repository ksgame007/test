<%--
获得sso单点登录跳转至shr的url
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.com.kingdee.shr.sso.client.util.SSOUtil"%>

<%
	String url = SSOUtil.generateUrl(request);	
	System.out.println("url: " + url);
%>
<%=url%>