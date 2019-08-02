package com.cartellaclinica.webapp.dao;

import java.util.List;

import com.cartellaclinica.webapp.entities.EsameObiettivo;

public interface EsameObiettivoDao {
	List<EsameObiettivo> SelTutti();

	List<EsameObiettivo> SelEsameObiettivoByFilter(Integer id);
}
