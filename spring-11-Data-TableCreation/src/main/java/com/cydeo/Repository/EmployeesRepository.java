package com.cydeo.Repository;

import com.cydeo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees,Long> {
}
