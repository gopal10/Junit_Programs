package com.stackroute.junit;

public class Prob7 {
    public String checkRes(int a[])
    {
        String res="";
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }


        }
        for(int i=0; i<a.length-1; i++) {

        res= res+a[i];
        }
        return res;
    }

}
