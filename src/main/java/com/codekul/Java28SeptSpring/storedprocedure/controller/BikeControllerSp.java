package com.codekul.Java28SeptSpring.storedprocedure.controller;

import com.codekul.Java28SeptSpring.onetomany.domain.Bike;
import com.codekul.Java28SeptSpring.storedprocedure.repository.BikeRepoSp;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BikeControllerSp {

    @Autowired
    private BikeRepoSp bikeRepoSp;

    @GetMapping("getBikeData")
    public List<Map<String,String>> getBikeData(){
        return bikeRepoSp.getBikeData();
    }

    @GetMapping("getBikeByNameAndColor")
    public Bike getBikeByNameAndColor(@RequestParam("name")String name,
                                      @RequestParam("color")String color){
        return bikeRepoSp.findByNameAndColor(name, color);
    }
}
