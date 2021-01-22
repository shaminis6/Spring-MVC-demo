<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head> Student Registration Form</head>
<body>
	<form:form action="processForm" modelAttribute="student">
  		FirstName <form:input path="firstName"/>
  		<br>
  		LastName <form:input path="lastName"/>
  		<br>
  		
  		Country <form:select path="country">
  					<form:options items="${student.countryOptions}"/>
  		</form:select>
  		<br>
  		
  		Favorite Language Java <form:radiobutton path="favLang" value="Java"/>
  		Python <form:radiobutton path="favLang" value="Python"/>
  		C++ <form:radiobutton path="favLang" value="C++"/>
  		<br>
  		
  		Operating Systems<br>
  		Linux<form:checkbox path="os" value="Linux"/>
  		Windows<form:checkbox path="os" value="Windows"/>
  		<br>
  		<input type="submit" value="Submit"/>
	</form:form>
	
</body>
</html>