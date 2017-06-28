package com.thoughtworks.practice;

/**
 * Created by lakshmi on 28/6/17.
 */
public class Factorial {


    public int getFactorial(int num) {
        int answer=1;
        for(int i=2;i<=num;i++)
        {
            answer*=i;
        }
        System.out.println("Factorial is ");
        return answer;
    }
}
