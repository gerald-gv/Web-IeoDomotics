package com.domoticsweb.proy_appweb_LPII.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	@GetMapping("/")
	public String home() {
		return "pages/home";
	}
	
	
	@GetMapping("/nosotros")
	public String about() {
		return "pages/nosotros";
	}
	
}
