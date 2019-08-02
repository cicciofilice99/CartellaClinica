<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="jumbotron jumbotron-billboard">
	<div class="img"></div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>${Titolo}</h2>
				<p>${Titolo2}</p>
			</div>
		</div>
	</div>
</div>

<section class="container">
	
	<!-- ANAGRAFICA -->
	<div class="portlet light bordered">
		<div class="portlet-title tabbable-line">
			<div class="caption font-blue-madison">
            	<i class="icon-settings oi oi-person"></i>
             	<span class="caption-subject bold uppercase">Anagrafica</span>
            </div>
      	</div>
      	<div class="portlet-body form">
			<div class="form-body">
				<div class="form-group">
           	 		<label > ${anagrafica.nome} ${anagrafica.cognome } </label>
           	 	</div>
        	</div>
     	</div>
    </div>
    
    <!-- CARTELLA CLINICA -->
	<div class="portlet light bordered">
		<div class="portlet-title tabbable-line">
			<div class="caption font-blue-madison">
            	<i class="icon-settings oi oi-folder"></i>
             	<span class="caption-subject bold uppercase">CARTELLA CLINICA</span>
            </div>
      	</div>
      	<div class="portlet-body form">
			<div class="form-body">
				<div class="form-group">
           	 		<label > ${cc.idCartella}</label>
           	 	</div>
        	</div>
     	</div>
    </div>
	
	<!-- ANAMNESI -->
	<div class="portlet light bordered">
		<div class="portlet-title tabbable-line">
			<div class="caption font-blue-madison">
            	<i class="icon-settings oi oi-person"></i>
             	<span class="caption-subject bold uppercase">Anamnesi</span>
            </div>
		</div>
	</div>
	
	<!-- ESAME OBIETTIVO -->
	<div class="portlet light bordered">
		<div class="portlet-title tabbable-line">
			<div class="caption font-blue-madison">
            	<i class="icon-settings oi oi-person"></i>
             	<span class="caption-subject bold uppercase">Esame Obiettivo</span>
            </div>
		</div>
	</div>
</section>