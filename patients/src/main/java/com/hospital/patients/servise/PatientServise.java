package com.hospital.patients.servise;
import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PatientServise {

    @Autowired
    private PatientModel patientModel;

    public String printName(){
        String name = patientModel.getPatientName();
        return "Hello "+name.toUpperCase() ;
    }

}
