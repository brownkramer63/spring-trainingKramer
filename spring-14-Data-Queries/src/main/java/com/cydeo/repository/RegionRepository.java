package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    //Display all regions in Canada
    //this is basically a method
    List<Region> findByCountry(String country);

    //display all regions with country name includes united
    List<Region> findByCountryContaining(String country);

//display all regions with country name includes "united" in order(region)
    List<Region> findByCountryContainingOrderByRegion(String country);

    //display top 2 regions in united states
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);



}
