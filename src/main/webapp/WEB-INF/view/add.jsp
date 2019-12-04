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
				$("#typeId").append("<option value='"+list[i].bid+"'>"+list[i].bname+"</option>");
			}
		},"json")
	})

	function add(){
		var param = $("form").serialize();
		alert(param);
		$.post("/add",param,function(flag){
			alert(flag);
			if(flag){
				alert("增加成功");
				location="select";
			}else{
				alert("增加失败");				
			}
		},"json")
	}
</script>
<body>
<form action="/add" method="post">
	<table>
		<tr>
			<td>品牌</td>
			<td><input type="text" name="gname"></td>、
		</tr>
		<tr>
			<td>分类</td>
			<td>
				<select name="typeId">
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
			<td><input type="date" name="datea"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="保存" onclick="add()"></td>
		</tr>
	</table>
</form>
</body>
</html>