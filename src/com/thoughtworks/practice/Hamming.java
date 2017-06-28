package com.thoughtworks.practice;

/**
 * Created by lakshmi on 28/6/17.
 */
public class Hamming {


    private int distance;

    public int hammingDistance(String str1, String str2)throws Exception {
        if(str1.length()!=str2.length())
            throw new Exception();
        if(str1.equals(str2))
            return 0;
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                if(str1.charAt(i)!=str2.charAt(i)) {
                    distance++;
                }
            }
            return distance;
        }
    }
}
