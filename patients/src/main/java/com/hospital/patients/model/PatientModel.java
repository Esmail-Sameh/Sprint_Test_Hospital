package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {

    List<String> names = new ArrayList<>();
    PatientModel(){
        names.add("Esmail");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Mazen");
    }

    public String getPatientName(){
        return names.get(1);
    }



}
