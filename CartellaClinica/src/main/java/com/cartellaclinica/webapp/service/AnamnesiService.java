package com.cartellaclinica.webapp.service;

import java.util.List;

import com.cartellaclinica.webapp.entities.Anamnesi;

public interface AnamnesiService {
	List<Anamnesi> SelAnamnesiByFilter(Integer id);
}
