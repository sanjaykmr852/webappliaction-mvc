<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--     <link rel="stylesheet" href="/webjars/bootstrap/3.2.0/css/bootstrap.min.css"> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first JSP program</title>
</head>
<body>
<form action="\load2" method="post">
<div id="error-div" style="color:red; font-size:large;">
<p>
${errorMessage} 
</p>
</div>
<div>
UserName:<input id="username-input" class="form-control" type="text" name="name"/>
</div>
<div style="padding-left:9px;padding-top:8px;">
password:<input id="password-input" type="password" name="password"/>
</div>
<div>
<input id="submit-button" type="submit" name="Login"/>
</div>
</form>
<!--     <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script> -->
<!--     <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script> -->
<script src="/js/login/login.js"/>

</body>
</html> 