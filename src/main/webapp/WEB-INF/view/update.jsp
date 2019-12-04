<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<link href="/resource/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<meta charset="UTF-8">
<title>商品增加页面</title>
</head>
<script type="text/javascript">
	$(function(){
		$.get("/selectByBrand",function(list){
			for ( var i in list) {
				$("#bname").append("<option value='"+list[i].bid+"'>"+list[i].bname+"</option>");
			}
		},"json")
	})

	function add(){
		var param = $("form").serialize();
		
		$.post("update",param,function(flag){
			if(flag){
				alert("修改成功");
				location="select";
			}else{
				alert("修改失败");				
			}
		},"json")
	}
</script>
<body>
<form action="update" method="post">
	<input type="hidden" name="gid" value="${g.gid }">
	<table>
		<tr>
			<td>品牌</td>
			<td><input type="text" name="gname" value="${g.gname }"></td>、
		</tr>
		<tr>
			<td>分类</td>
			<td>
				<select name="bname">
					<option value="请选择">请选择</option>
					<option value="电器">电器</option>
					<option value="数码">数码</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>价格</td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td>时间</td>
			<td><input type="date" name="datea" value="${datea}"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="保存" onclick="add()"></td>
		</tr>
	</table>
</form>
</body>
</html>