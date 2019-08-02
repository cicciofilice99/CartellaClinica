package com.cartellaclinica.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cartellaclinica.webapp.entities.Anagrafica;
import com.cartellaclinica.webapp.service.AnagraficaService;

@Controller
@RequestMapping("/")
public class IndexController {
	// private SpringSecurityUserContext userContext;

	@Autowired
	private AnagraficaService anagraficaService;

	@RequestMapping
	public String getWelcome(Model model) {

		List<Anagrafica> anagraficaRecord = null;

		anagraficaRecord = anagraficaService.SelPazientiUltimiInseriti();

		model.addAttribute("pazienti", anagraficaRecord);
		model.addAttribute("saluti", "Accedi o registrati");

		// model.addAttribute("User", CurrentUser);

		return "index";
	}

}
