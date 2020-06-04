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
	<!-- index.jsp(웹컴페이지)까지 작성하고 나면 -->
	<!-- 1. 라이브러리들 web폴더 아래의 lib폴더에 세팅해 놓기
		 2. xml 설정하기
		 	window -> preferences -> xml -> xml Catalog
		 	-> User Specified Entries에서 add
		 	-> https://mybatis.org/mybatis-3/ko/getting-started.html (마이바티스 사이트)
		 		들어가서 location과 key를 configuration용 xml과 mapper용 xml로 채워서 2개 등록하기
		 3. project 바로 아래에 resources 폴더 만들기
		 4. script 폴더를 만들고 그 아래에 sql(DB생성을 위한) 파일 넣기
		 5. mybatis-config.xml(configuration용 xml) 만들기(properties를 활용할 수도 있다.)
		 6. request.getContextPath() 대신에 쓸 수 잇는 변수를 jstl의 core태그를 통해서 작성해 두자.
	 -->
	
	
	<!-- request.getContextPath()를 매번 스기 힘드니까 간다하게 줄여보자 -->
	<c:set var="contextPath" value="${pageContext.servletContext.contextPath }" scope="application"/>
	
	<jsp:forward page="views/main/main.jsp"/>
	
	
	
</body>
</html>