package com.qa.BabyNameGen.util;

import java.util.Random;

public class NameGenerator {


    public static String generateString(int length, String startsWith){
        if(lengthIsSameOrExceeds(length, startsWith.length())){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(startsWith);
        for (int i = startsWith.length(); i < length; i++) {
            builder.append(makeCharacter());
        }
        return builder.toString();
    }


    private static boolean lengthIsSameOrExceeds(int requiredLength, int stringLength){
        return requiredLength<=stringLength;
    }

    private static String makeCharacter(){
        int letterAscii = new Random().nextInt(25)+97;
        return Character.toString((char)letterAscii);
    }
}
