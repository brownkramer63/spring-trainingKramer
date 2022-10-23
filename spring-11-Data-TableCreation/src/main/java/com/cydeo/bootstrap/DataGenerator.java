package com.cydeo.bootstrap;

import com.cydeo.Repository.CarRepoistory;
import com.cydeo.Repository.EmployeesRepository;
import com.cydeo.entity.Car;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {
    private final CarRepoistory carRepoistory;
    private final EmployeesRepository employeesRepository;

    public DataGenerator(CarRepoistory carRepoistory) {
        this.carRepoistory = carRepoistory;
    }

    public DataGenerator(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Tesla","Y");
        Car c3 = new Car("Ford","Explorer");

        carRepoistory.save(c1);
        carRepoistory.save(c2);
        carRepoistory.save(c3);

//i want to save these objects to our DB

        //we will use the save method that is coming from car repository
        //to use this mehtod we need to inject this class with a constructor


        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE, 2500);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26) Gender.F, 2500);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.F, 2500);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.M, 2500);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.M, 2500);

    }
}
