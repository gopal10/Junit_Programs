package com.stackroute.junit;

public class Prob10 {

    public String check(int num, String str) {
        char sub;
        String res = "";
        for (int i = 0; i < num; i++) {
            for (int j = str.length() - num; j < str.length(); j++) {

                sub = str.charAt(j);
                res = res + sub;
            }


        }
        return str+res;

    }
}
