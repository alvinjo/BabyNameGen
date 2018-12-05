package com.qa.BabyNameGen.util;

import java.util.Random;

public class NameGenerator {

    private static char[] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private static char[] vow = {'a','e','i','o','u'};
    private static boolean consVowel = true;

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
        return requiredLength<stringLength;
    }

    private static char makeCharacter(){
        consVowel = !consVowel;
        if(consVowel){
            return cons[new Random().nextInt(cons.length)];
        }else{
            return vow[new Random().nextInt(vow.length)];
        }
    }

}
