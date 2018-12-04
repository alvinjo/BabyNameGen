package com.qa.BabyNameGen.rest;

import com.qa.BabyNameGen.service.IBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("$path.base")
@RestController
public class BabyNameGenEndpoints {


    @Autowired
    IBabyService service;

    @GetMapping("$path.genName")
    public String genererateName(@PathVariable int length, @PathVariable String startsWith){
        return service.generateName(length, startsWith);
    }

}
