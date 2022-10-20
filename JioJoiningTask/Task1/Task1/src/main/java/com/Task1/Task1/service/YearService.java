package com.Task1.Task1.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class YearService {

    public String findYear(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(currentYear-year);
        return "The Birth year will be - "+(currentYear-year);
    }
}
