package com.stackroute.junit;

public class TomJerry {

    public String check(int n)
    {
        if(n%2!=0 && n>=20 && n<=30)
        {
            return "Tom";
        }
        else if(n%2==0 && n>=20 && n<=30)
        {
            return "Jerry";
        }
        return "error";
    }

}
