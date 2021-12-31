package com.codekul.Java28SeptSpring.onetomany.controller;

import com.codekul.Java28SeptSpring.onetomany.domain.Bike;
import com.codekul.Java28SeptSpring.onetomany.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @PostMapping("saveBike")
    public String saveBike(@RequestBody Bike bike){
        bikeRepository.save(bike);
        return "Bike saved..";
    }
}
