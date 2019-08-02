package com.cartellaclinica.webapp.service;

import java.util.List;

import com.cartellaclinica.webapp.entities.EsameObiettivo;

public interface EsameObiettivoService {
	List<EsameObiettivo> SelTutti();

	List<EsameObiettivo> SelEsameObiettivoByFilter(Integer id);
}
