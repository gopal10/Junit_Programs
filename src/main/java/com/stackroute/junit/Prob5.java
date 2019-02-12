package com.stackroute.junit;

public class Prob5 {

    public int check(String s1)
    {
        String [] s2= s1.split(" ");
        int sum=0;
        int ar[]= new int [s1.length()];
        for (int i=0; i<s2.length; i++)
        {
            ar[i]=Integer.parseInt(s2[i].trim());
            sum=sum+ar[i];
        }
      return sum;

    }
}
