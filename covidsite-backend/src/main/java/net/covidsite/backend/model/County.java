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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public long getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(long totalCases) {
		this.totalCases = totalCases;
	}

	public long getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(long totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	
	
	
	
}
