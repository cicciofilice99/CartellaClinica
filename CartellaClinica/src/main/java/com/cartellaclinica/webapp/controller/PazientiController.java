package com.cartellaclinica.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cartellaclinica.webapp.entities.Anagrafica;
import com.cartellaclinica.webapp.service.AnagraficaService;

@Controller
@RequestMapping("/pazienti")
public class PazientiController {

	@Autowired
	private AnagraficaService anagraficaService;

	@RequestMapping(method = RequestMethod.GET)
	public String GetAllPazienti(Model model) {
		List<Anagrafica> mainRecordSet;
		mainRecordSet = anagraficaService.SelTutti();
		int NumRecords = mainRecordSet.size();

		model.addAttribute("pazienti", mainRecordSet);
		model.addAttribute("numPazienti", NumRecords);

		return "pazienti";
	}
}
