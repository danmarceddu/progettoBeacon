<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benvenuto!</title>
</head>
<body>
	<sql:setDataSource driver="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@DESKTOP-GCE30VO:1521/XE" user="corso_java"
		password="admin" />

	<form id="frmOrdina" name="frmOrdina" method="get"
		action="ServletMezzi">
		<label>Seleziona mezzi <select name="optOrdina">
				<sql:query var="result">
   			 	 select id from mezzi
    		</sql:query>
				<option value="">scegli mezzo</option>
				<c:forEach items="${result.rows}" var="row">
					<option value="<c:out value="${row.id}" />">
						<c:out value="${row.id}" /></option>
				</c:forEach>
		</select>
		</label> <input type="submit" value="seleziona" name="invio"></input> <br></br>
		<input type="button" value="Registrazione nuovo mezzo"
			onclick="window.location.href='http://localhost:8088/gruppoTrack'" />
		<br></br> <a href=LoginHome.html> Logout </a>
	</form>

</body>
</html>