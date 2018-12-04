package com.qa.BabyNameGen.rest;

import com.qa.BabyNameGen.service.IBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/babyname")
@RestController
public class BabyNameGenEndpoints {


    @Autowired
    IBabyService service;

    @GetMapping("/generateName/{length}/{startsWith}")
    public String genererateName(@PathVariable int length, @PathVariable String startsWith){
        return service.generateName(length, startsWith);
    }

}
