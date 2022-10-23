package com.cydeo.bootstrap;

import com.cydeo.Repository.CarRepoistory;
import com.cydeo.entity.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    private final CarRepoistory carRepoistory;

    public DataGenerator(CarRepoistory carRepoistory) {
        this.carRepoistory = carRepoistory;
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

    }
}
