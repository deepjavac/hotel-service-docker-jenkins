package com.shadimaterial.hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hotel")
public class HotelController {

    @GetMapping("/list")
    public String getHotel(){
        return "Result from Hotel Service and Docker";
    }
}
