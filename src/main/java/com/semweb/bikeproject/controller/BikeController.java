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
		
		List<Station> stations = fusekiService.getStationsByCity();
		
		model.addAttribute("stations", stations);
		 
		return "index";
	}
	
}
