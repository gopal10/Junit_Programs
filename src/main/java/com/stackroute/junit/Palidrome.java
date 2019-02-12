package com.stackroute.junit;

public class Palidrome {


    public long isPali(long x)
    {
        long sum=0,res=0,temp=x;
        for(long i=x; i!=0 ;)
        {
            sum=i%10;
            res=res*10 + sum;

            i=i/10;

        }

        return res;
    }

}
