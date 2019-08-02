package com.cartellaclinica.webapp.service;

import java.util.List;

import com.cartellaclinica.webapp.entities.Anagrafica;

public interface AnagraficaService {

	List<Anagrafica> SelTutti();

	Anagrafica SelPazienteByFilter(Integer id);
}
