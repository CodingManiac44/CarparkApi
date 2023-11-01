package com.carpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import static com.sun.crypto.provider.AESCrypt.log;

//import static sun.awt.SunGraphicsCallback.log;

@RestController
@RequestMapping("/api/carpark")
public class CarParkController{
    @GetMapping("/status")
    public String getStatus() {
        return "Car park is open.";
//        log.info("******* cark park available******");
    }
}

