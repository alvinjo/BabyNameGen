package com.qa.BabyNameGen.service;

import com.qa.BabyNameGen.util.NameGenerator;
import org.springframework.stereotype.Service;

@Service
public class BabyServiceImpl implements IBabyService {


    @Override
    public String generateName(int length, String startsWith) {
        return NameGenerator.generateString(length, startsWith);
    }
}
