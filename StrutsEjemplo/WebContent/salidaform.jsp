<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Respuesta Form</title>
</head>
<body>
	<!-- así comprueba si validate() añadió mensajes de error y los muestro -->
	<s:if test="hasActionMessages()">
		<s:actionmessage/>
	</s:if>
	<h2>Persona</h2>
	<p><s:property value="persona.nombre"/> <s:property value="apellido"/></p>
	<p><s:property value="persona.edad"/></p>
	<p><s:property value="persona.fecha"/></p> 
	<img src="<s:property value="myFileFileName"/>"/>
</body>
</html>