package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    //display all departments in the furniture department
    List<Department> findByDepartment(String department);

    //display all departments in the helath division

    List<Department> findByDivision(String division);

    //display all departments with division name ends with ics

    List<Department> findByDivisionEndingWith(String ics);

    //display  top 3 departments  inludes hea without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);




}
