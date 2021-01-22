<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
		Welcome ${customer.firstName} ${customer.lastName} ${customer.freePasses}
		
		<br>
		Postal Code is ${customer.postalCode}
		
		<br>
		Course Code is ${customer.courseCode}
		
</body>
</html>