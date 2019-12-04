<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resource/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<meta charset="UTF-8">
<title>商品详情页面</title>
</head>
<body>
		<table>
		<c:forEach items="${goods}" var="g" varStatus="i">
		<tr>
			<td>编号:${i.index+1 }</td>
		</tr>
		<tr>
			<td>品牌:${g.gname }</td>
		</tr>
		</tr>
		<tr>
			<td>分类:${g.bname }</td>
		</tr>
		<tr>
			<td>发布时间:<fmt:formatDate value="${g.datea }" pattern="yyyy-MM-dd"/></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>