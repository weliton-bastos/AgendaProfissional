<%@attribute name="title" required="true" %>
<%@attribute name="bodyClass" required="true" %>
<%@attribute name="extraScripts" required="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>

	<%@include file="/WEB-INF/views/includes/header.jsp" %>
	
	<jsp:doBody/>
	
	<%@include file="/WEB-INF/views/includes/footer.jsp" %>
	
</body>
</html>