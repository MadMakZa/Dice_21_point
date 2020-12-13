package com.example.dice_21_point;

/* *
 * Игральный кубик, умеет генерировать рандомное число
 * */

import android.widget.ImageView;

public class Dice {

    //диапазон генерации чисел
    private final int a = 1;
    private final int b = 6;
    private int random_number;

    // генерация
    private int generateRandomNumber(){
        random_number = a + (int) (Math.random() * b);
        return random_number;
    }

    //присвоить картинку в зависимости от выпавшего значения
    public void generateDiceImage() {
        switch (random_number) {
            case 1:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side1);
                break;
            case 2:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side2);
                break;
            case 3:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side3);
                break;
            case 4:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side4);
                break;
            case 5:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side5);
                break;
            case 6:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.dice_side6);
                break;
        }
    }



}
