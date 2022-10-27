package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining:" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByRegionRegionDesc:" + regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("findtop country:" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("findTopByCountryContainsOrderByRegion:" + regionRepository.findTopByCountryContainsOrderByRegion("United States"));


        System.out.println("departments---------------------------");

        System.out.println("find by department: "+ departmentRepository.findByDepartment("Furniture"));
        System.out.println("find by department: "+ departmentRepository.findByDivision("Health"));


    }
}
