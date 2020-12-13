package com.example.dice_21_point;

/**
 * Логика игры
 */

public class GameLogic {

    private int cube1;
    private int points;

    //создание экземпляров кубиков
    public void createDices(){
        Dice dice1 = new Dice();
        cube1 = dice1.generateRandomNumber();
    }

    //присвоить картинку в зависимости от выпавшего значения
    public void generateDiceImage() {
        switch (cube1) {
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
