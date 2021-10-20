package net.covidsite.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.covidsite.backend.exception.ResourceNotFoundException;
import net.covidsite.backend.model.County;
import net.covidsite.backend.repository.CountyRepository;
import net.covidsite.backend.service.CountyService;

@Service
public class CountyServiceImpl implements CountyService{

	private CountyRepository countyRepository;
	
	public CountyServiceImpl(CountyRepository countyRepository) {
		super();
		this.countyRepository = countyRepository;
	}

	@Override
	public County saveCounty(County county) {
		return countyRepository.save(county);
	}

	@Override
	public List<County> getAllCounties() {
		return countyRepository.findAll();
	}

	@Override
	public County updateCounty(County county, long id) {
		// check if the county is exist or not
		County existingCounty = countyRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("County", "Id", id)
				);
		
		existingCounty.setTotalCases(county.getTotalCases());
		existingCounty.setTotalDeaths(county.getTotalDeaths());
		
		// save to DB
		countyRepository.save(existingCounty);
		
		return existingCounty;
	}

	@Override
	public County getCountyById(long id) {
		// check if the county is exist or not
		return countyRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("County", "Id", id));
	}

}
