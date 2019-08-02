package com.cartellaclinica.webapp.dao;

import java.util.List;

import com.cartellaclinica.webapp.entities.Anamnesi;

public interface AnamnesiDao {
	List<Anamnesi> SelTutti();

	List<Anamnesi> SelAnamnesiByFilter(Integer id);
}
