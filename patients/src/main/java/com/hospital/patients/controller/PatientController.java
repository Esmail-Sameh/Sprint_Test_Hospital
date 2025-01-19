package com.hospital.patients.controller;

import com.hospital.patients.servise.PatientServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientServise patientServise;//bean

    @GetMapping(path = "print-name")
    public ResponseEntity printName(){
        return ResponseEntity.ok(patientServise.printName());
    }

    @GetMapping(path = "/get-patients")
    public ResponseEntity getPatients(){
        return ResponseEntity.ok(patientServise.getPatient());
    }




}
