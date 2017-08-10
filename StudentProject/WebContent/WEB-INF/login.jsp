<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
 <head>
	<title>Student System</title>
	 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/login.css">
 </head>
 <body>
	<div class="wrap-content-header">sgdsgfsd</div>
	<div class="wrap-content">
		<div class="wrap-content-right">sdfgsdfg</div>
		<div class="wrap-content-left">
			<div style="height:100px;"></div>
			<div class="wrap-content-login">
				<form action="/action_page.php">
				  <div class="imgcontainer">
						<img src="${pageContext.request.contextPath }/static/img/3.png" alt="Avatar" class="avatar" width="100" height="100">
				  </div>

				  <div class="container">
					<label><b>User ID</b></label>
					<input type="text" placeholder="Enter Username" name="uname" required>

					<label><b>Password</b></label>
					<input type="password" placeholder="Enter Password" name="psw" required>
						
					<button type="submit">Login</button>
					<input type="checkbox" checked="checked"> Remember me
				  </div>

				  <div class="container" style="background-color:#f1f1f1">
					<button type="button" class="cancelbtn">Cancel</button>
					<span class="psw">Forgot <a href="#">password?</a></span>
				  </div>
				</form>
			</div>
			<div></div>
		</div>
	</div>
	<div class="wrap-content-footer">sdfgsdgf</div>
 </body>
</html>