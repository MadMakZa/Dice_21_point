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
    public void generateDiceImage(){
        switch (random_number) {
            case 1:
                MainActivity.getInstance().getImageDice().setImageResource(R.drawable.diceside_image1);
                break;
            case 2:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube2);
                break;
            case 3:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube3);
                break;
            case 4:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube4);
                break;
            case 5:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube5);
                break;
            case 6:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube6);
                break;
    }



}
