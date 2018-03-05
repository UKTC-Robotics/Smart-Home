
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form class="" action="loginServlet" method="post">


  <div class="LogIn">
    <input type="text" name="uName" placeholder="User Name"> <br>
    <input type="password" name="pass" placeholder="password"> <br>
    <input type="submit" value="Log In"> <br>
  </div>

  <div class="menu">
    <a href="register.jsp" id="registerSighn"><b>Register</b></a>
  </div>

  <div class="menu">
   <p><b>Моля влезте в профила си за да продължите</b></p>
   <p><b>Ако все още нямате такъв моля <a href="register.jsp" id="loginDetails">регистрирайте се</b></a> </p>
  </div>

</form>


</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form class="" action="index.html" method="post">


  <div class="LogIn">
    <input type="text" name="uName" placeholder="User Name"> <br>
    <input type="password" name="pass" placeholder="password"> <br>
    <input type="button" type="submit" value="Log In"> <br>
  </div>

  <div class="menu">
    <a href="register.jsp" id="registerSighn"><b>Register</b></a>
  </div>

  <div class="menu">
   <p><b>Моля влезте в профила си за да продължите</b></p>
   <p><b>Ако все още нямате такъв моля <a href="#" id="loginDetails">регистрирайте се</b></a> </p>
  </div>

</form>


</body>
</html>