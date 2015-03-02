<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- tags para cosas de javascript de struts -->
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- etiqueta equivalente a los script de javascript -->
<sx:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Persona</title>
</head>
<body>
	<s:form action="form" method="post" enctype="multipart/form-data">
	<!-- Cada ocurrencia de persona que encuentre se guardará en una posición del
		array de valores en la clase Conversor, en orden -->
		<s:textfield name="persona" label="Nombre"/>
		<s:textfield name="persona" label="Edad"/>
		<s:submit value="Enviar" />
	</s:form>

	<!-- así compruebo si validate() añadió mensaje de error y los muestro -->
	<s:if test="hasActionErrors()">
		<s:actionerror />
	</s:if>
</body>
</html>