package com.sibi.challenge11;

public class innerforlloop {
    public static void main(String[] args) {
int num2;
int num1;
        for(num2 = 0; num2 <= 3;  num2++)
        // above this is the first part of the outer part of this nested loop
        {
            for(num1 = 0; num1 <= 2; num1++)
            // above this is the first part of the inner part of the nested loop
            {
                System.out.println(num2 + "   " + num1);
            }
            // above this is the end part of the inner part of the nested loop
        } }}
        // above this is the end part of the outer part of the nested loop