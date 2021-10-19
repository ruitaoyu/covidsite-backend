package net.covidsite.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.covidsite.backend.model.County;


public interface CountyRepository extends JpaRepository<County, Long>{

}
