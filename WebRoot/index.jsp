<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
   <table>
   <tr>
   <td>用户ID</td>
   <td>用户姓名</td>
   <td>用户密码</td>
   <td>删除</td>
   <td>添加</td>
   <td>修改</td>
   </tr>
   <c:forEach var="aa" items="${allinfo}">
   <tr>
   <td>${aa.id}</td>
   <td>${aa.userName}</td>
   <td>${aa.userPassword}</td>
   <td><a href="${pageContext.request.contextPath}/delete.html/${aa.id}"><img src="static/images/schu.png"></img></a></td>   
   </tr>
   </c:forEach>
   <tr>
   <td><a href="${pageContext.request.contextPath}/addUserinfo.html">添加</a></td>
   </tr>
   </table>
  </body>
</html>
