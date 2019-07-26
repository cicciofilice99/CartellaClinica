package com.cartellaclinica.webapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartellaclinica.webapp.entities.Anagrafica;

@Repository
public class AnagraficaDaoImpl extends AbstractDao<Anagrafica, Integer> implements AnagraficaDao {
	@Override
	public List<Anagrafica> SelTutti() {
		return super.SelTutti();
	}
}
