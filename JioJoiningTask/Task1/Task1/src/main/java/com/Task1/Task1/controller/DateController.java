package com.Task1.Task1.controller;

import com.Task1.Task1.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @Autowired
    YearService yearService;

    @GetMapping("/age/{year}")
    public String getYear(@PathVariable int year){

    return yearService.findYear(year);
    }
}
