<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	int n1 = 10;
	request.setAttribute("n2",n1);
	//response.sendRedirect("result.jsp");
	//response.sendRedirect("result.jsp?xxx=aaa"+URLEncoder.encode("홍길동","utf-8"));
	request.getRequestDispatcher("result.jsp?xxx=aaa"+URLEncoder.encode("홍길동","utf-8")).forward(request,response);
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>