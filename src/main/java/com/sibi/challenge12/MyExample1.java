package com.sibi.challenge12;

public class MyExample1 {

    public static void main(String[] args) {

        Food lagitha = new Food();

        lagitha.FavoriteFood();

        lagitha.BadFood();

        lagitha.GoodFood();

        lagitha.FavoriteFood();


        for (int i = 0; i < 4; i++) {
            lagitha.FavoriteFood();

        }
    }
}
