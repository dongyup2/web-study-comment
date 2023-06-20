<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Get 방식으로 데이터 보내기1</h3>
<a href="receive_data.jsp?data=xxx">데이터받기 페이지로 파라미터 보내기</a><br>
<a href="test_setAttribute.jsp?data=xxx">테스트셋어트리뷰트 페이지로 파라미터 보내기</a><br>
<form action="result3.jsp" method="get">
	<input type="text" name="form_txt" value="testdata">
	<input type="submit" value="전송" >
</form>
폼으로 전송하기<br>
<form action="result3" method="get">
	<input type="text" name="form_txt" value="testdata">
	<input type="submit" value="전송" >
</form>
</body>
</html>


