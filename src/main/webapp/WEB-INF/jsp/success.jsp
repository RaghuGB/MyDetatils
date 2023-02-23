 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<html>
<head>
<style>
       table td{font-family:verdana;font-size: 12px;}
</style>
</head>

<body>
<font face="verdana" size="2">Welcome Mr. <b>${lfobj.user}</b>,<br>
Validations Success..!<br><br>
You Entered<br>
</font>

<table>
    <tr><td>UserId</td><td>${lfobj.userid}</td></tr>
    <tr><td>Email</td><td>${lfobj.email}</td></tr>
    <tr><td>Phone</td><td>${lfobj.phone}</td></tr>
    <tr><td>Web site</td><td>${lfobj.blog}</td></tr>
</table>
</body>
</html>