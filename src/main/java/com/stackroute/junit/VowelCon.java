package com.stackroute.junit;

public class VowelCon {

    public String checkVowel(String set) {

        int countv=0, countc=0;
        for (int x = 0; x < set.length(); x++) {
            char ch = set.charAt(x);


                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                        ch == 'I' || ch == 'O' || ch == 'U')
                   countc++;

                else
                    countv++;
            }

        if(countc>0&&countv==0)
            return "vowel";
        else if(countc>0&&countv>0)
                return "vowel consonent";
        else if((countc==0&&countv>0))
            return "consonent";
        else
        return "error";
    }
}