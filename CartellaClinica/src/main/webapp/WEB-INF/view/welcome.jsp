<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<section class="container">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-red-sunglo">
            	<i class="oi oi-people"></i>
             		<span class="caption-subject bold uppercase">Ricerca Paziente</span>
            </div>
		 </div>
		 <div class="portlet-body form">
  			<div class="form-body">
	  			<form>
	  				<div class="row">
		    			<div class="form-group col-sm-4">
				      		<label for="nomeInput">Nome</label>
				      		<input type="email" class="form-control" id="inputEmail4" placeholder="Nome">
				    	</div>
					    <div class="form-group col-sm-4">
					    		<label for="inputPassword4">Cognome</label>
						    	<input type="password" class="form-control" id="inputPassword4" placeholder="Cognome">
					    </div>
					    <div class="form-group col-sm-4">
					    		<label for="inputAddress">Codice Fiscale</label>
						   		<input type="text" class="form-control" id="inputAddress" placeholder="Codice Fiscale">
					   	</div>
	  				</div>
	  				<div class="row">
	  					<div class="col-md-6 text-center">
	  						<button type="submit" class="btn btn-primary">Ricerca Paziente</button>
	  					</div>
	  					<div class="col-md-6 text-center">
	  						<button type="submit" class="btn btn-primary">Pulisci Ricerca</button>
	  					</div>
	  				</div>
	  			</form>
  			</div>
  		</div>
	</div>
	<br>
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="row">
				<div class="col-md-6 text-center">
					<div class="caption font-red-sunglo">
            			<i class="oi oi-people"></i>
             			<span class="caption-subject bold uppercase">Ultimi Pazienti Curati</span>
            		</div>
				</div>
				<div class="col-md-6 text-center">
					<div class="caption font-red-sunglo">
            			<i class="oi oi-people"></i>
             			<span class="caption-subject bold uppercase">Ultimi Pazienti Inseriti</span>
            		</div>
				</div>
			</div>
		</div>
		<div class="portlet-body form">
  			<div class="form-body">
  				<div class="row">
  					<div class="col-md-6 text-center">
	  					<table class="table table-bordered table-striped">
	    					<thead>
	      						<tr>
									<th>Cognome</th>
									<th>Nome</th>
									<th>Codice Fiscale</th>
									<th>Cartella Clinica</th>
	      						</tr>
	    					</thead>
	    					<tbody id="myTable">
	     						<c:forEach items="${pazienti}" var="paziente">
									<tr class="hoverTable">
										<td>${paziente.cognome}</td>
										<td>${paziente.nome}</td>
										<td>${paziente.codFiscaleCalc}</td>
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
	  				<div class="col-md-6 text-center">
	  					<table class="table table-bordered table-striped">
	  						<thead>
	      						<tr>
									<th>Cognome</th>
									<th>Nome</th>
									<th>Codice Fiscale</th>
									<th>Cartella Clinica</th>
	      						</tr>
	    					</thead>
	    					<tbody id="myTable">
	     						<c:forEach items="${pazienti}" var="paziente">
									<tr class="hoverTable">
										<td>${paziente.cognome}</td>
										<td>${paziente.nome}</td>
										<td>${paziente.codFiscaleCalc}</td>
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
  				</div>
  			</div>
  		</div>
	</div>
</section>