package com.semweb.bikeproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semweb.bikeproject.database.FusekiService;
import com.semweb.bikeproject.model.Station;

@Controller
public class BikeController {

	@Autowired
	private FusekiService fusekiService;
	
	@RequestMapping("/index")
	public String bike(Model model) {
		model.addAttribute("top", "BIKE SYSTEM");
		
		List<Station> stations_stetienne = fusekiService.getStationsByCity("stetienne");
		List<Station> stations_paris = fusekiService.getStationsByCity("paris");
		List<Station> stations_lyon = fusekiService.getStationsByCity("lyon");
		List<Station> stations_montpellier = fusekiService.getStationsByCity("montpellier");
		List<Station> stations_strasbourg = fusekiService.getStationsByCity("strasbourg");
		List<Station> stations_rennes = fusekiService.getStationsByCity("rennes");
		
		model.addAttribute("stations_stetienne", stations_stetienne);
		model.addAttribute("stations_paris", stations_paris);
		model.addAttribute("stations_lyon", stations_lyon);
		model.addAttribute("stations_montpellier", stations_montpellier);
		model.addAttribute("stations_strasbourg", stations_strasbourg);
		model.addAttribute("stations_rennes", stations_rennes);
		 
		return "index";
	}
	
}