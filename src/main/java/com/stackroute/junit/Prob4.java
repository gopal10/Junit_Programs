package com.stackroute.junit;

public class Prob4 {

    public String dis(int num) {

        String str="";
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                str=str+i;
            }
        }
           return str;
    }
}
