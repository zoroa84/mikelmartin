<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link rel="icon" href="${pageContext.request.contextPath}/img/favicon.ico">

    <title>elegir</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/vendors/bootstrap/css/bootstrap.min.css" rel="stylesheet">  
    <link href="${pageContext.request.contextPath}/vendors/fonts/" rel="stylesheet">  
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">  
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
</head>
<body>





<form action="${pageContext.request.contextPath}/eltiempo" method="post">


	<p>${msg}</p>
	
	
  <div class="group">
    <input type="text" name="ciudad"><span class="highlight"></span><span class="bar"></span>
    <label>Ciudad</label>
  </div>
 <div class="radio">
    <label for="radios-0">
      <input type="radio" name="temperatura" id="radios-0" value="0" checked="checked">
      Celsius
    </label>
	</div>
  <div class="radio">
    <label for="radios-1">
      <input type="radio" name="temperatura" id="radios-1" value="1">
      Farenheit
    </label>
	</div>
  </div>
  <button type="submit" class="button buttonBlue">Buscar
    <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
  </button>
</form>

</body>
</html>