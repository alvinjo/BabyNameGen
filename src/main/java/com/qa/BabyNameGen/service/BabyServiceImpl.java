package com.qa.BabyNameGen.service;

import com.qa.BabyNameGen.util.NameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabyServiceImpl implements IBabyService {


    @Autowired
    private NameGenerator generator;

    @Override
    public String generateName(int length, String startsWith) {
        return generator.generateString(length, startsWith);
    }
}
