<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>airline-Home</title>
<link rel="stylesheet/less" href="<c:url value='/resources/less/style.less'/>" type="text/css" />
<script src="<c:url value='/resources/less/less-1.3.0.min.js'/>" type="text/javascript"></script>
</head>
<body>
	<h2>
		<a href="<c:url value="/clickHere" />"><spring:message code="click.here" /></a>
	</h2>
	<h3>
		<a href="secure/index.jsp">spring-security</a>
	</h3>
	
	<h3>
		<a href="<c:url value="/slowlySpead" />">spring-ws-slowly</a>
	</h3>
</body>
</html>