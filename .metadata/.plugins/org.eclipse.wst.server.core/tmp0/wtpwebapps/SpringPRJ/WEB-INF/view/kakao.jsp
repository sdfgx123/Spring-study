<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카카오 API 테스트</title>
</head>
<body>

	<h1>웹문서 검색 테스트</h1>

	<p></p>
	<br>
	<br>
	<br>
	<div id="title" style="text-align: center;"></div>
	<br>
	<div id="thumbnail" style="text-align: center;"></div>
	<br>
	<div id="contents"
		style="text-align: center; height: 100px; width: 300px; margin: auto;"></div>
	<br>
	<br>
	<br>

	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>

	<script>
		$.ajax({
			method : "GET",
			url : "https://dapi.kakao.com/v2/search/web",
			data : {
				query : "이효리"
			},
			headers : {
				Authorization : "KakaoAK d6ed1d1cbb3e2caa8769e2c3e233acca"
			}
		}).done(
				function(msg) {
					console.log(msg.documents[0].datetime);
					console.log(msg.documents[0].contents);
					$("p").append(
							"<strong>" + msg.documents[0].datetime
									+ "</strong>");
					$("p").append(
							"<strong>" + msg.documents[0].contents
									+ "</strong>");
					$("p").append(
							"<img src='" + msg.documents[0].contents + "'/>");

				});
	</script>

	<script>
		$.ajax({
			method : "GET",
			url : "https://dapi.kakao.com/v3/search/book?target=title",
			data : {
				query : "미움받을 용기"
			},
			headers : {
				Authorization : "KakaoAK d6ed1d1cbb3e2caa8769e2c3e233acca"
			}
		}).done(
				function(msg) {
					console.log(msg.documents[1].title);
					console.log(msg.documents[1].thumbnail);
					console.log(msg.documents[1].contetns);
					$("#title").append(
							"<strong>" + msg.documents[1].title + "</strong>");
					$("#thumbnail").append(
							"<img src='" + msg.documents[1].thumbnail + "'/>");
					$("#contents").append(
							"<strong>" + msg.documents[1].contents
									+ "</strong>");

				});
	</script>


</body>
</html>