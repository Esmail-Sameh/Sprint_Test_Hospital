package com.hospital.patients.controller;

import com.hospital.patients.servise.PatientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientServise patientServise;//bean

    @GetMapping("print-name")
    public String printName(){
        return patientServise.printName();
    }




}
