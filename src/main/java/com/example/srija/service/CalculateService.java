package com.example.srija.service;


import org.springframework.stereotype.Service;

@Service

public class CalculateService {

    public  double add(double first, double second)
    {
        return  first + second;
    }
    public  double subtract(double first, double second)
    {
        return  first - second;
    }

    public  double multiply(double first, double second)
    {
        return  first * second;
    }


    public  double divide(double first, double second)
    {
        return  first / second;
    }



}
