package net.covidsite.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.covidsite.backend.model.County;
import net.covidsite.backend.service.CountyService;

@RestController
@RequestMapping("/api/counties")
public class CountyController {
	private CountyService countyService;

	public CountyController(CountyService countyService) {
		super();
		this.countyService = countyService;
	}
	
	// build create county REST API
	@PostMapping()
	public ResponseEntity<County> saveCounty(@RequestBody County county){
		return new ResponseEntity<County>(countyService.saveCounty(county), HttpStatus.CREATED);
	}
}
