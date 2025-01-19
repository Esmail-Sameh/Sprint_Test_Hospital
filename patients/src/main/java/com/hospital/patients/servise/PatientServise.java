package com.hospital.patients.servise;
import com.hospital.patients.model.Patient;
import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PatientServise {

    @Autowired
    private PatientModel patientModel;

     Patient patient = new Patient();
    public String printName(){
        patientModel.setName("Esmail Sameh" , 20);
        return patientModel.getPatientName();
    }




    public List<Patient> getPatient(){
        ArrayList<Patient> list = new ArrayList<>();
        list.add(new Patient("Esmail" , "Cairo" , "01550165639"));
        list.add(new Patient("Ahmed" , "Giza", "01156020318"));
        list.add(new Patient("Mohamed", "Cairo" ,"016150850899"));
        list.add(new Patient("Tamer" , "Giza", "01220131520"));
        list.add(new Patient("Mazen", "Menya", "012121251514"));
        return  list;
    }

}
