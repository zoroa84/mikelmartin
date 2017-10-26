<%@page import="com.eltiempomundial.pojo.localizacion"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>final</title>

<link
	href="${pageContext.request.contextPath}/vendors/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/vendors/fonts/stylesheet.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/tiempo.css"
	rel="stylesheet">
</head>
<body>
<div id="grande">
	<div class="tiempoIcono"><%
				localizacion w = (localizacion) request.getAttribute("tiempo");
				int temperatura = Integer.parseInt((String) request.getAttribute("temperatura"));
			%><p class="icon" data-icon=<%=w.getIconoTiempo() %>></p></div>
	<div class="varios">
		<div class="deto"><span class="cuanto"><%=w.getTemperatura(temperatura)%></span><span class="donde"><%=w.getLocalizacion()%></span></div>
		<div class="fecha"><span class=mes><%=w.getMes()%><br></span><span class="dia"> <%=w.getDia()%></span> </div>
	</div>
</div>
</body>
</html>

