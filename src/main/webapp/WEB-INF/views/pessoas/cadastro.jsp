<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="customTag"%>

<customTag:pagina bodyClass="" title="" extraScripts="">

	<c:if test="${empty pessoa.id}">
		<c:url value="/contas/lancamento/salvarNovo" var="url" />
	</c:if>

	<c:if test="${pessoa.id > 0}">
		<c:url value="/contas/lancamento/salvarEdita/?id=${pessoa.id}"
			var="url" />
	</c:if>

	<c:url value="/pessoas/cadastro/salvar" var="url" />

	<form:form action="${url}" method="post" commandName="pessoa">
		<table style="">
			<tr>
				<td><label for="cpf">CPF:</label></td>
				<td><input type="text" name="cpf" id="cpf" /></td>
				<td><form:errors path="cpf" /></td>
			</tr>
			<tr>
				<td><label for="nome">Nome:</label></td>
				<td><input type="text" name="nome" id="nome" /></td>
				<td><form:errors path="nome" /></td>
			</tr>
			<tr>
				<td><label for="sexo">Sexo:</label></td>
				<td><input type="text" name="sexo" id="sexo" /></td>
				<td><form:errors path="sexo" /></td>
			</tr>
			<tr>
				<td><label for="email">Email:</label></td>
				<td><input type="text" name="email" id="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			<tr>
				<td><label for="dataNascimento">Data de Nascimento:</label></td>
				<td>
				<!-- input type="text" name="dataNascimento" id="dataNascimento" / -->
				<input type="text" name="dataNascimento"  
				       value="<fmt:formatDate value="${dataNascimento.time}" pattern="dd/MM/yyyy" />" /> 
				</td>
				<td><form:errors path="dataNascimento" /></td>
			</tr>
			
		</table>
		<div>
			<input type="submit" value="salvar" />
		</div>
		
	</form:form>

</customTag:pagina>
