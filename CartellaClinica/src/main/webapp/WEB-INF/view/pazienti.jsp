<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<section class="container">
	<div class = "row">
		<div class = "col-md-6 col-sm-6">
			<h2 class="page-title">Risultati Ricerca: ${numPazienti }Pazienti </h2>
		</div>
		<div class="col-md-6 col-sm-6">
			<div id="rep" class="datafilter">
				<label>
					Pagine: 
					 <select name="numpage" aria-controls="sample_1" class="form-control input-sm input-xsmall input-inline">
						 <option value="10">10</option>
						 <option value="15">15</option>
						 <option value="20">20</option>
						 <option value="-1">Tutti</option>
					 </select>
				</label>
			</div>
		</div>
	</div>
	<div class="table-responsive">
		<table id="anagrafica" class="table table-hover table-striped table-bordered" >
			<thead>
				<tr>
		            <th>ID Paziente</th>
		            <th>Cognome</th>
		            <th>Nome</th>
		            <th>Codice Fiscale</th>
		            <th>Data di Nascita</th>
		            <th>Sesso</th>
		            <th>Cartella Clinica</th>
		        </tr>
			</thead>
			<tbody>
				<c:forEach items="${pazienti}" var="paziente">
					<tr class="hoverTable">
						<td>${paziente.idAnagrafica}</td>
						<td>${paziente.cognome}</td>
						<td>${paziente.nome}</td>
						<td>${paziente.codFiscaleCalc}</td>
						<td>${paziente.dataDiNascita}</td>
						<td>${paziente.sesso}</td>
						<td>
							<a href=" <spring:url value="/cartellaclinica/${paziente.idAnagrafica}" /> " class="btn btn-primary">
								<span class="oi oi-folder"/></span> 
      						</a> 
      					</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</section>
