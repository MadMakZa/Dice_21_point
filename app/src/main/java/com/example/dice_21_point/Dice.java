package com.example.dice_21_point;

/* *
 * Игральный кубик, умеет генерировать рандомное число
 * */

public class Dice {

    //диапазон генерации чисел
    private final int a = 1;
    private final int b = 6;
    private int random_number;

    // генерация
    public int generateRandomNumber(){
        random_number = a + (int) (Math.random() * b);
        return random_number;
    }

}
