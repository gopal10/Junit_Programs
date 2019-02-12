package com.stackroute.junit;

public class Prob8 {


        public String check(int num, int higher, int lower) {
            if (num > lower && num < higher) {
                return "Congo...Guess is Correct";
            } else if (num > higher) {
                return "Guess is higher than your prediction";
            } else {
                return "Guess is lower than your prediction";

            }
        }
    }

