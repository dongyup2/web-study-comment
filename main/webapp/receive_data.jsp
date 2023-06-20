<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	//localhost:8090/test/receive_data.jsp?data=xxxx
	String x = request.getParameter("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>데이터 받기 결과</h3>
<hr>
1. x 값 읽기(표현식) :<%= x %> <br>
2. x 값 읽기(EL) : ${param.data } <br>
3. x 값 읽기(EL)2 : ${x }<br>
</body>
</html>