package com.beginsecure;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import com.beginsecure.CarsDBRepository;
import com.beginsecure.CarRepository;

public class MainBD {
    public static void main(String[] args) {

        Properties props=new Properties();
        try {
            props.load(new FileReader("C:\\Users\\negre\\IdeaProjects\\labGitMPP1\\TemaLab3\\bd.config"));
        } catch (IOException e) {
            System.out.println("Cannot find bd.config "+e);
        }

        CarRepository carRepo=new CarsDBRepository(props);
        carRepo.add(new Car("Tesla","Model S", 2019));
        System.out.println("Toate masinile din db");
        for(Car car:carRepo.findAll())
            System.out.println(car);
       String manufacturer="Tesla";
        System.out.println("Masinile produse de "+manufacturer);
        for(Car car:carRepo.findByManufacturer(manufacturer))
            System.out.println(car);

        System.out.println(carRepo.findByManufacturer("Skoda"));

        System.out.println(carRepo.findBetweenYears(2018,2020));

        carRepo.update(18, new Car("Ceva", "Altceva", 2021));

        System.out.println(carRepo.findBetweenYears(2020,2022));

    }
}
