<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="customTag"%>

<customTag:pagina bodyClass="" title="" extraScripts="">

	<h1>Países cadastrados</h1>

	<table>
		<c:forEach items="${paises}" var="pais">
				<tr>
					<td>${pais.nome}</td>
				</tr>
		</c:forEach>
	</table>
</customTag:pagina>