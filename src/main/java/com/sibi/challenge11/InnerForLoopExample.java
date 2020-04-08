package com.sibi.challenge11;

public class InnerForLoopExample {

    public static void main(String[] args) {

        System.out.println("before.. ");

        for (int aa = 0; aa <= 3; aa++)
        {

            for (int bb = 0; bb <= 2; bb++)
            {
                System.out.println("aa: " + aa);
                System.out.println("bb: " + bb);
                System.out.println("-------------: ");
            }

        }

        System.out.println("after.. ");

    }
}
