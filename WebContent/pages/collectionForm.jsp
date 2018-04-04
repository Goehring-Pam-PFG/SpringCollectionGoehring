<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Collection Registration Form</h2>
	<mvc:form modelAttribute="collection" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="collectionOwner">Collection Owner</mvc:label></td>
				<td><mvc:input path="collectionOwner" /></td>
			<tr>
			<tr>
				<td><mvc:label path="countItems">Count of Items</mvc:label></td>
				<td><mvc:input path="countItems" /></td>
			<tr>
			<tr>
				<td><mvc:label path="collectorLevel">Collector Level</mvc:label></td>
				<td><mvc:input path="collectorLevel" /></td>
<!-- 			<tr> -->
<%-- 				<td><mvc:label path="collectionType">Collection Type</mvc:label></td> --%>
<%-- 				<td><mvc:input path="collectionType" /></td> --%>
<!-- 			<tr> -->
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>

	<a href="viewAll.mvc">View all Collections</a>
</body>
</html>