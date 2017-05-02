<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty reuestScope.list && requestScope.list == null }">
		没有员工
	</c:if>
	<c:if test="${!empty requestScope.list && requestScope.list != null }">
		<center>
			<form action="">
				<table border="1" width="60%">
					<tr align="center">
						<th>部门Id</th>
						<th>部门名称</th>
						<th>修改</th>
						<th>删除</th>
					</tr>
					<c:forEach items="${requestScope.list }" var="depart">
						<tr align="center">
							<td>${depart.depaId }</td>
							<td>${depart.depaName }</td>
							<td><a href="${pageContext.request.contextPath }/depart/addUpdateDepart?tag=update&depaId=${depart.depaId }">修改</a></td>
							<td><a href="${pageContext.request.contextPath }/depart/addUpdateDepart?tag=delete&depaId=${depart.depaId }">删除</a></td>
						</tr>
					</c:forEach>
					<tr align="center">
						<td colspan="4"><a href="${pageContext.request.contextPath }/depart/addUpdateDepart?tag=add">添加</a></td>
					</tr>
				</table>
			</form>
		</center>
	</c:if>
</body>
</html>