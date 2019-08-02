package com.cartellaclinica.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cartellaclinica.webapp.entities.Anagrafica;
import com.cartellaclinica.webapp.entities.Anamnesi;
import com.cartellaclinica.webapp.entities.CartellaClinica;
import com.cartellaclinica.webapp.entities.EsameObiettivo;
import com.cartellaclinica.webapp.service.AnagraficaService;
import com.cartellaclinica.webapp.service.AnamnesiService;
import com.cartellaclinica.webapp.service.CartellaClinicaService;
import com.cartellaclinica.webapp.service.EsameObiettivoService;

@Controller
@RequestMapping("/cartellaclinica")
public class CartellaClinicaController {

	@Autowired
	private CartellaClinicaService cartellaClinicaService;

	@Autowired
	private AnagraficaService anagraficaService;

	@Autowired
	private EsameObiettivoService esameObiettivoService;

	@Autowired
	private AnamnesiService anamnesiService;

	private List<CartellaClinica> recordSetCartella;
	private List<EsameObiettivo> recordSetEsameObiettivo;
	private List<Anamnesi> recordSetAnamnesi;

	@RequestMapping(value = "/{idAnagrafica}", method = RequestMethod.GET)
	public String GetCartellaByFilter(@PathVariable("idAnagrafica") Integer idAnagrafica, Model model) {
		CartellaClinica cc = null;
		Anamnesi anamnesi = null;
		EsameObiettivo esameObiettivo = null;
		Anagrafica anagrafica = null;

		anagrafica = anagraficaService.SelPazienteByFilter(idAnagrafica);

		cc = cartellaClinicaService.SelCartellaClinicaPazienteByFilter(idAnagrafica);
		recordSetEsameObiettivo = esameObiettivoService.SelEsameObiettivoByFilter(idAnagrafica);
		recordSetAnamnesi = anamnesiService.SelAnamnesiByFilter(idAnagrafica);

		model.addAttribute("anagrafica", anagrafica);
		model.addAttribute("cartella", cc);
		model.addAttribute("anamnesi", recordSetAnamnesi);
		model.addAttribute("esame", recordSetEsameObiettivo);

		return "cartellaClinica";
	}
}
