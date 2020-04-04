package com.sibi.challenge9;

public class Final {
    public static void main(String[] args) {
        int n = 15;
        //Here on the int n = 15, 15 is the number that you would like to end with. So what I am trying to say is you can change any of those to the number you wanted.
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                // If you change the 3 here on the if statement inside of the parentheses that will be the number that you would want to start with.
                for (int myname = 0; myname < 5; myname++)
                System.out.print(i + "");
            }
        }
    }
}