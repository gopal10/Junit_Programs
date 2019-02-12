package com.stackroute.junit;

public class Probl6 {

    public String check(char ch)
    {

        if(ch>='a' && ch<='z')

          return "Small case Letter";

        else if(ch >='A' && ch <='Z')
            return "capital letter";
        else if(ch >='0' && ch<='9')
           return "Number";
        else
            return "Special charachter";
    }
}
