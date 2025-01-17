package com.hospital.patients.servise;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PatientServise {

    public String printName(String name){
        return name.toUpperCase();
    }

}
