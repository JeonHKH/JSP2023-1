<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>product 정보 조회</title>
</head>
<body>
<h1> 상품정보조회 </h1>
<ul>
<li>상품코드: ${p.id}</li>
<li>상품이름: ${p.name}</li>
<li>상품제조회사: ${p.maker}</li>
<li>상품가격: ${p.price}</li>
<li>등록일: ${p.date}</li>
</ul>

</body>
</html>