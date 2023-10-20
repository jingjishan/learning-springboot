package com.example.spring_boot_demo.controller;


import com.example.spring_boot_demo.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @Autowired
    PrintService printService;

    @RequestMapping("/test")
    public String helloWorld(){
        printService.testPrint();
        return "helloWorld";
    }


}
