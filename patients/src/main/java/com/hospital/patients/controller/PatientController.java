package com.hospital.patients.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @GetMapping("print-name")
    public void printName(){
        System.out.println("my patient name is : .....");
    }




}
