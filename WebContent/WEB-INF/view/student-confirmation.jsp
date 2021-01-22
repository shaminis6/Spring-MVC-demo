<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
		Welcome ${student.firstName} ${student.lastName}
		<br>
		Country u live in ${student.country}
		<br>
		Favorite Language is ${student.favLang}
		<br>
		Operating Systems are
		<ul>
		  <c:forEach var="temp" items="${student.os}">
		    <li> ${temp} </li>
		  </c:forEach>
		</ul>
</body>
</html>