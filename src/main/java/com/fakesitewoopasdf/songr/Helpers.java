package com.fakesitewoopasdf.songr;

public class Helpers {
    public Helpers(){
    }
    public String reverseString ( String string) {
        String[] splitSting = string.split("");
        String stringAcc = "";

        for (int i = splitSting.length - 1; i > -1 ; i--){

            stringAcc+=splitSting[i];
        }
        return stringAcc;
    }
}
