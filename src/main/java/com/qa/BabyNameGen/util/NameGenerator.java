package com.qa.BabyNameGen.util;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Random;

public class NameGenerator {

    @Autowired
    StringBuilder builder;

    public String generateString(int length, String startsWith){
        if(lengthIsSameOrExceeds(length, startsWith.length())){
            return "";
        }

        builder.append(startsWith);
        for (int i = 0; i < length; i++) {
            builder.append(makeCharacter());
        }
        return builder.toString();
    }


    private boolean lengthIsSameOrExceeds(int requiredLength, int stringLength){
        return requiredLength<=stringLength;
    }

    private String makeCharacter(){
        int letterAscii = new Random().nextInt(25)+97;
        return Character.toString((char)letterAscii);
    }
}
