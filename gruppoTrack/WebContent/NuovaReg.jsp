<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuovi utenti</title>
</head>
<body>
<FORM METHOD="GET" ACTION="http://localhost:8088/gruppoTrack/">
	 <fieldset>
    <legend>Nuova registrazione</legend><br /><br />
		Username: <INPUT TYPE="text" NAME="username" SIZE="25" MAXLENGTH="100" placeholder= "Enter username" required > <BR> <BR>
		Password: <INPUT TYPE="password" NAME="password" SIZE="25" MAXLENGTH="100" placeholder= "Enter password" required> <BR> <BR>
		<INPUT TYPE="submit" VALUE="Registrati" >
		</fieldset>
		</FORM>
</body>
</html>