<%--
[page 지시자]
language: .jsp 파일에서 사용되는 프로그래밍 언어 (생략가능)
pageEncoding: .jsp 파일로 저장할때 사용되는 문자셋 (생략가능)
contentType : .jsp가 실행 후 만들어지는 결과물의 종류
	MIME 타입을 지정 
		text/html : 문자 내용으로 html 태그를 구성한 것
		application/json : 문자 내용으로 json 표기로 구성된 것
		image/jpeg : 이미지내용으로 jpeg로 인코딩한것
		image/png: 이미지 내용으로 png로 인코딩 한것
	문자셋 지정
		브라우저로 전달할때 사용되는 문자셋 (문자내용은 반드시 기술을 해야함)
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%--import 속성 --%>
  <%@ page import="java.util.*, java.text.*" %>   

 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">

	</head>
		
	<body>
		<div class="wrap">
			<%--공통 헤더--%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			
			<%--내용--%>
			<div class="mainCenter">
					<%--공통메뉴--%>
					<jsp:include page="/WEB-INF/views/include/menu.jsp"/>

						<div class="content">
							<div class="sector">
								<h5>스크립트릿/표현식</h5>
								<div>
									<%---- Scriptlet(스크립트릿)이라고 부른다. --> --%>
									<%
									Date now = new Date();
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
									String strNow = sdf.format(now);
									%>
									<%--표현식 --%>
									오늘 날짜 : <%=strNow%> <%--위에 정의된 값을 아래에 넣겠다라는 뜻에서 <%=를 사용 --%>
								</div>						
							</div>
							<div class="sector">
								<h5>스크립트릿/표현식</h5>
								<div>
									<%for(int i=1; i<=6; i++) {%>
										<h<%=i%>>Hello JSP</h<%=i%>>
									<%}%>
								</div> 					
							</div>
						</div>
						
			</div>

		</div>
</body>
</html>