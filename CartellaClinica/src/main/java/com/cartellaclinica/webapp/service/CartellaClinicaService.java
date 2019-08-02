package com.cartellaclinica.webapp.service;

import java.util.List;

import com.cartellaclinica.webapp.entities.CartellaClinica;

public interface CartellaClinicaService {
	List<CartellaClinica> SelTutti();

	CartellaClinica SelCartellaClinicaPazienteByFilter(Integer id);
}
