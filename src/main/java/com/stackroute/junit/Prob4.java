package com.stackroute.junit;

public class Prob4 {

    public String dis(int num) {

        char a[]= new char[20];
        String str="";
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= num; j++) {
                str=str+a[i];
            }
        }
           return str;
    }
}
