package net.covidsite.backend.service.impl;

import org.springframework.stereotype.Service;

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

}
