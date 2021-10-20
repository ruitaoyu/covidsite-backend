package net.covidsite.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.covidsite.backend.model.County;
import net.covidsite.backend.service.CountyService;

@CrossOrigin(origins = "http://localhost:4200")
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
	
	// build get all counties REST API
	@GetMapping
	public List<County> getAllCounties() {
		return countyService.getAllCounties();	
	}
	
	// build update county REST API
	// http://localhost:8080/api/counties/1
	@PutMapping("{id}")
	public ResponseEntity<County> updateCasesById(@PathVariable("id") long id
			, @RequestBody County county) {
		return new ResponseEntity<County>(countyService.updateCounty(county, id), HttpStatus.OK);
	}
	
	// build get county by id
	// http://localhost:8080/api/counties/1
	@GetMapping("{id}")
	public ResponseEntity<County> getCountyById(@PathVariable("id") long id) {
		return new ResponseEntity<County>(countyService.getCountyById(id), HttpStatus.OK);
	}
}
