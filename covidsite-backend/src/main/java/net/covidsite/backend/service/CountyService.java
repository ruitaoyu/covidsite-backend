package net.covidsite.backend.service;

import java.util.List;

import net.covidsite.backend.model.County;

public interface CountyService {
	County saveCounty(County county);
	List<County> getAllCounties();
	County updateCounty(County county, long id);
	County getCountyById(long id);
}
