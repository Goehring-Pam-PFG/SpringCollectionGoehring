<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC From Handling</title>
</head>
<body>
<h2>Collection Registration Result</h2>
<table>
<tr>
<td> Collection Owner </td>
<td>${c.collectionOwner}</td>
</tr>
<tr>
<td> Count of Items </td>
<td>${c.countItems}</td>
</tr>
<tr>
<td> Collector Level </td>
<td>${c.collectorLevel}</td>
</tr>
<tr>
<td> Collection Type </td>
<td>${c.collectionType}</td>
</tr>
</table>
<a href="viewAll.mvc">View All Collections</a>
</body>
</html>