package com.hospital.patients.controller;

import com.hospital.patients.model.IncModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("inc")
public class IncController {

    @GetMapping(path = "/get-patients-inc")
    public IncModel getInc() {
        IncModel inc = new IncModel();
        inc.setId(UUID.randomUUID().toString());
        inc.setName("Esmail Sameh");
        inc.setAge(20);
        return inc;
    }

}
