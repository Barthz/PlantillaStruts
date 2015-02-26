<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Persona</title>
</head>
<body>
	<s:form action="form" method="post" enctype="multipart/form-data">
		<s:textfield name = "persona.nombre"
					 label = "Nombre">
		</s:textfield>			 
		<s:textfield name = "persona.edad"
					 label = "Edad">
		</s:textfield>
		<s:file name="myFile" label="Archivo"/>
		<s:submit value="Enviar"/>
	</s:form>
	
	<!-- así compruebo si validate() añadió mensaje de error y los muestro -->
	<s:if test="hasActionErrors()">
		<s:actionerror/>
	</s:if>
</body>
</html>