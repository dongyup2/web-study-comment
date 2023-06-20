<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>
	<hr>
	<table border="1px">
		<thead>
			<tr>
				<th>게시글번호</th>
				<th>게시글이름</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
    <c:forEach var="postList" items="${postList}">
        <tr>
            <td>${postList.post_mno }</td>
            <td><a href="SelectPostByIdServlet?post_mno=${postList.post_mno}">${postList.post_name }</a></td>
            <td>${postList.author }</td>
        </tr>
    </c:forEach>
	</tbody>
</table>
</body>
</html>