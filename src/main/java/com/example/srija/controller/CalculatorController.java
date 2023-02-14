package com.example.srija.controller;

import com.example.srija.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Autowired
    CalculateService calcService;

    @GetMapping("/add/{first}/{second}")
    public double add (@PathVariable("first") double first,
                       @PathVariable("second") double second)
    {
        return calcService.add(first,second);
    }
    @GetMapping("/subtract/{first}/{second}")
    public double subtract(@PathVariable("first") double first,
                           @PathVariable("second") double second)
    {
        return calcService.subtract(first,second);
    }

    @GetMapping("/multiply/{first}/{second}")
    public double multiply(@PathVariable("first") double first,
                           @PathVariable("second") double second)
    {
        return calcService.multiply(first,second);
    }


    @GetMapping("/divide/{first}/{second}")
    public ResponseEntity<Object> divide (@PathVariable("first") double first,
                                  @PathVariable("second") double second)
    {
           if (second==0)
            {
              return new ResponseEntity<>("Divide by zero is not allowed, Please check the input", HttpStatus.BAD_REQUEST);
            }

            return new ResponseEntity<>(calcService.divide(first,second),HttpStatus.OK);

    }



}
