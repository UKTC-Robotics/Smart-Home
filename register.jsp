<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/NewFile.css"`rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form class="" action="registerServlet" method="post">

<div class="register">
      <input type="text" name="fName" placeholder="First Name"> <br>
      <input type="text" name="lName" placeholder="Last Name"> <br>
      <input type="text" name="uName"placeholder="User Name"> <br>
      <input type="text" name="eMail" placeholder="e-Mail"> <br>
      <input type="text" name="country" placeholder="Country"> <br>
      <input type="text" name="pass" placeholder="Password"> <br>
      <input type="button" type="submit" name="register" value="Register"> <br>
</div>

<div id="sign">
  <p><b>Ако не сте се регистрирали моля направете го!</b></p>
</div>

<div class="LogIn">
  <input type="text" name="uName" placeholder="User Name"> <br>
  <input type="password" name="pass" placeholder="Password"> <br>
  <input type="button" type="submit" name="logIn" value="Log In"> <br>
</div>

    </form>

</body>

</body>
</html>