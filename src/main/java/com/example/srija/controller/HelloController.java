package com.example.srija.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/hello")
public class HelloController {
    @GetMapping ("/greet")
    public String sayHello(){
        return "Welcome to spring framework";
    }



    // we are capturing the  user input in the url  and printing on the browser .
    //pass the name in url ex:http://localhost:2023/srija/hello/greet/srija
    //o/p will be Hi srija
    @GetMapping ("/greet/{name}")
    public String sayHelloWithName(@PathVariable("name") String inputName){
        return "  Hi  "  +inputName;
    }

//http://localhost:2023/srija/hello/greeting?name=srija   -- using req param displaying the output
    @GetMapping ("/greeting")
    public String sayHelloWithParam(@RequestParam("name") String inputName){
        return "  Hi  "  +inputName;
    }
}
