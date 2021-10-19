package net.covidsite.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="counties")
public class County {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "county_name")
	private String countyName;
	
	@Column(name = "total_cases")
	private long totalCases;
	
	@Column(name = "total_deaths")
	private long totalDeaths;
	
	
	
	
}
