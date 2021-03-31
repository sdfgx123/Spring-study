<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 테스트</title>
</head>
<body>

	<h1>검색 테스트</h1>
	
	<form name="searchTest" action="/search/forName" method="get">
	<input type="text" id="bookName" name="bookName" placeholder="검색할 책 이름 입력">
	<br>
	<button type="submit">검색</button>
	</form>
</body>
</html>