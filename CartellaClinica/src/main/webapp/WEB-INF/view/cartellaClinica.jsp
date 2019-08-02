<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
	<head>
	  <title>Bootstrap Example</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	</head>
<script>
	$(document).ready(function(){
	  $(".nav-tabs a").click(function(){
	    $(this).tab('show');
	  });
	});
</script>

<section class="container">
  	<ul class="nav nav-tabs">
	    <li class="active"><a data-toggle="tab" href="#anagrafica">Anagrafica</a></li>
	    <li><a data-toggle="tab" href="#cartella">Cartella Clinica</a></li>
	    <li><a data-toggle="tab" href="#anamnesi">Anamnesi</a></li>
	    <li><a data-toggle="tab" href="#esame">Esame Obiettivo</a></li>
  	</ul>
  	
  	<div class="tab-content">
  		<!-- ANAGRAFICA -->
  		<div id="anagrafica" class="tab-pane fade in active">
  			<div class="portlet light bordered">
		 		<div class="portlet-title">
		 	 		<div class="caption font-red-sunglo">
            			<i class="oi oi-people"></i>
             			<span class="caption-subject bold uppercase">Anagrafica</span>
            		</div>
  						
  				</div>
  				<div class="portlet-body form">
  					<div class="form-body">
  						<div class="form-group col-md-6">
  							<label > Nome: ${anagrafica.nome} </label>
  						</div>
  						<div class="form-group">
  							<label > Cognome: ${anagrafica.cognome } </label>
  						</div>
  						<div class="form-group col-md-6">
  							<label > Data di Nascita: ${anagrafica.dataDiNascita } </label>
  						</div>
  						<div class="form-group">
  							<label > Sesso: ${anagrafica.sesso } </label>
  						</div>
  						<div class="form-group col-md-6">
  							<label > Codice Fiscale: ${anagrafica.codFiscaleCalc } </label>
  						</div>
  						<div class="form-group">
  							<label > Indirizzo Residenza: ${anagrafica.indirizzoRes } </label>
  						</div>
  						<div class="form-group col-md-6">
  							<label > Tessera Sanitaria: ${anagrafica.tessSanitaria } </label>
  						</div>
  						<div class="form-group">
  							<label > Telefono Abitazione: ${anagrafica.telefonoAbit } </label>
  						</div>
  						<div class="form-group col-md-6">
  							<label > Telefono Cellulare: ${anagrafica.telefonoCell } </label>
  						</div>
  					</div>
  				</div>
  			</div>
  			
  		</div>
  		
  		<!-- CARTELLA CLINICA -->
  		<div id="cartella" class="tab-pane fade">
  			<div class="portlet light bordered">
		 		<div class="portlet-title">
		 	 		<div class="caption font-red-sunglo">
            			<i class="oi oi-folder"></i>
             			<span class="caption-subject bold uppercase">Cartella Clinica</span>
            		</div>
  						
  				</div>
  				<div class="portlet-body form">
  					<div class="form-body">
  						<div class="form-group">
  							<label > Id Cartella Clinica: ${cartella.idCartella }  </label>
  						</div>
  						<div class="form-group">
  							<label > Data Inizio: ${cartella.dataInizioVal }</label>
  						</div>
  						<div class="form-group">
  							<label > Data Fine: ${cartella.dataFineVal } </label>
  						</div>
  					</div>
  				</div>
  			</div>
  		</div>
  		
  		<!-- Anamnesi -->
  		<div id="anamnesi" class="tab-pane fade">
  			<div class="portlet light bordered">
		 		<div class="portlet-title">
		 	 		<div class="caption font-red-sunglo">
            			<i class="oi oi-folder"></i>
             			<span class="caption-subject bold uppercase">Anamnesi</span>
            		</div>
  				</div>
  				<div class="portlet-body form">
  					<div class="form-body">
  						<div class="form-group">
  							<c:if test="${empty anamnesi}">
  								<label>Lista Anamnesi Vuota</label>
  							</c:if>
  							<c:if test="${not empty anamnesi}">
	  							<table class="table table-bordered table-striped">
								    <thead>
								      <tr>
								      	<th>ID Anamnesi</th>
										<th>ID Cartella Clinica</th>
										<th>Data Anmanesi</th>
										<th>Descrizione old Anmanesi</th>
										<th>Id Reparto</th>
										<th>Descrizione Anmanesi</th>
								      </tr>
								    </thead>
								    <tbody id="myTable2">
								     	<c:forEach items="${anamnesi}" var="anam">
											<tr class="hoverTable">
												<td>${anam.idAnamnesi }</td>
												<td>${anam.fkCartellaClinica }</td>
												<td>${anam.dataAnamnesi }</td>
												<td>${anam.anamnesiDescOld }</td>
												<td>${anam.fkReparto }</td>
												<td>${anam.anamnesiDesc }</td>
											</tr>
										</c:forEach>
								    </tbody>
								  </table>
							 </c:if>
  						</div>
  					</div>
  				</div>
  			</div>
  		</div>
  		<div id="esame" class="tab-pane fade">
  			<div class="portlet light bordered">
		 		<div class="portlet-title">
		 	 		<div class="caption font-red-sunglo">
            			<i class="oi oi-folder"></i>
             			<span class="caption-subject bold uppercase">Esame Obiettivo</span>
            		</div>
  						
  				</div>
  				<div class="portlet-body form">
  					<div class="form-body">
  						<div class="form-group">
  							<c:if test="${empty esame}">
  								<label>Lista Esami Vuota</label>
  							</c:if>
  							<c:if test="${not empty esame}">
  								<table class="table table-bordered table-striped">
							    <thead>
							      <tr>
							      	<th>ID Esame</th>
									<th>Data Esame</th>
									<th>Descrizione Esame</th>
							      </tr>
							    </thead>
							    <tbody id="myTable">
							    	<c:forEach items="${esame}" var="e">
										<tr class="hoverTable">
											<td>${e.idEsameObiettivo }</td>
											<td>${e.dataEsameObiettivo }</td>
											<td>${e.esameObiettivoDesc }</td>
										</tr>
									</c:forEach>
							    </tbody>
							  </table>
  							</c:if>
  							
  						</div>
  					</div>
  				</div>
  			</div>
  		</div>
  	</div>
</section>