<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin:0;
		padding:0;
	}
	#b{
		width:300px;
		height:200px;
		border:1px solid #000;
		margin:10px;
		display:flex;
	}
	#c{
		margin:auto;
	}
</style>
</head>
<body>
	<div id="b">
		<div id="c">
			<form action="upd" method="post">
					<input type="hidden" maxlength="10" name="loginId" value="${list.loginId}"/><br/>
					昵称：<input maxlength="10" name="name" value="${list.name}"/><br/>
					电话：<input maxlength="10" name="phone" value="${list.phone}"/><br/>
					密码：<input type="password" name="password" value="${list.password}"/><br/>

					性别：<label><input type="radio" name="sex" value="1" <c:if test="${list.sex==1}">checked="checked"</c:if>/>男</label>
						  <label><input type="radio" name="sex" value="0" <c:if test="${list.sex==0}">checked="checked"</c:if>/>女</label><br/>
					生日：<input type="date" name="birthday" value="${list.birthday}"/><br/>
					邮箱：<input maxlength="50" name="email" value="${list.email}"/><br/>
					地址：<input maxlength="100" name="address" value="${list.address}"/><br/>
					<button type="submit">确定</button>
				</form>
		</div>
	</div>
	
	
</body>
</html>