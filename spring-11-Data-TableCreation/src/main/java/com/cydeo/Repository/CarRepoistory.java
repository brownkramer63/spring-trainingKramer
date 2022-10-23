package com.cydeo.Repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepoistory extends JpaRepository<Car,Long> {





}
