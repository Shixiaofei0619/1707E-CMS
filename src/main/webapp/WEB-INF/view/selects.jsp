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
<title>商品展示页面</title>
</head>
<script type="text/javascript">
//全选
function chkAll(){
	$("[name='gid']").each(function(){
		$(this).prop("checked",!$(this).prop("checked"))
	})
}
function chkNo(){
	$("[name='gid']").each(function(){
		$(this).prop("checked",false)
	})
}
</script>
<body>
<form action="select" method="post">
	商品:<input type="text" name="gname" value="${gname }">
	<button>查询</button>
	<a href="/toAdd">添加</a>
	<table>
		<tr>
			<td>
				<input type="checkbox" onclick="chkAll()">全选
				<input type="checkbox" onclick="chkNo()">全不选
			</td>
			<td>编号</td>
			<td>品牌</td>
			<td>分类</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list}" var="g" varStatus="i">
		<tr>
			<td>
				<input type="checkbox" name="gid" value="${g.gid }">
			</td>	
			<td>${i.index+1 }</td>
			<td>${g.gname }</td>
			<td>${g.bname }</td>
			<td><fmt:formatDate value="${g.datea }" pattern="yyyy-MM-dd"/></td>
			<td>
				<a href="/selectGoods?gid=${g.gid }" target="_blank">详情</a>
				<a href="/update?gid=${g.gid }">编辑</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<button name="page" value="1">首页</button>
				<button name="page" value="${info.prePage==0?1:info.prePage }">上一页</button>
				<button name="page" value="${info.nextPage==0?info.pages:info.nextPage }">下一页</button>
				<button name="page" value="${info.pages }">尾页</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>