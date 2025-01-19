package com.hospital.patients.model;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {

    private String name;
    private int age;

    List<String> names = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name , int age) {
        this.name = name;
        this.age = age;
    }

    PatientModel(){
        names.add("Esmail");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Mazen");
    }

    public String getPatientName(){
        return names.get(0);
    }

}
