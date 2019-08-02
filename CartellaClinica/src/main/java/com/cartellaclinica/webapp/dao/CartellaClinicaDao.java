package com.cartellaclinica.webapp.dao;

import java.util.List;

import com.cartellaclinica.webapp.entities.CartellaClinica;

public interface CartellaClinicaDao {

	List<CartellaClinica> SelTutti();

	CartellaClinica SelCartellaClinicaPazienteByFilter(Integer id);
}
