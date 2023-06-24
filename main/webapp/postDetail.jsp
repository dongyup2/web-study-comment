<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 상세보기</title>
</head>
<body>
    <h1>게시물 상세보기</h1>
    
    <h2>${postVO.post_name}</h2>
    <p>작성자: ${postVO.author}</p>
    
    <h3>게시물 내용</h3>
    <div>
        ${postVO.post_content}
    </div>
    
    <h3>댓글 목록</h3>
    <ul>
        <c:forEach var="comment" items="${comments}">
            <li>
                <p>댓글 내용: ${comment.comment}</p> <!-- commentText에서 comment로 수정 -->
                <p>작성자: ${comment.author}</p> <!-- commentAuthor에서 author로 수정 -->
            </li>
        </c:forEach>
    </ul>
</body>
</html>
