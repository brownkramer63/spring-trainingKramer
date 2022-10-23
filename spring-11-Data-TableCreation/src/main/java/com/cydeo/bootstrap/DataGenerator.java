package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Tesla","Y");
        Car c3 = new Car("Ford","Explorer");

//i want to save these objects to our DB

    }
}
