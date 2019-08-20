package com.fakesitewoopasdf.songr;

public class Helpers {
    public Helpers(){
    }
    public String reverseString ( String string) {
        String[] splitSting = string.split(" ");
        StringBuilder stringAcc = new StringBuilder();

        for (int i = 0; i < splitSting.length ; i++){

            stringAcc.insert(0," " +splitSting[i]);
        }
        System.out.println(stringAcc.toString());
        return stringAcc.toString();
    }
}
