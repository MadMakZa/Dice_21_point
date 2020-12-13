package com.example.dice_21_point;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;

/**
 * Класс отвечающий за анимацию вьюшек кубика
 */

public abstract class DiceRollAnimation {

    ObjectAnimator animationX, animationY, rotateAnimation;


    public void animationDice(){
        Double generateX = (Double) (0 + Math.random() * 1000);
        Double generateY = (Double) (500 + Math.random() * 1000);
        float xEnd = generateX.floatValue();
        float yEnd = generateY.floatValue();

        //доступ к вью кубика
        ImageView imageFromDice = MainActivity.getInstance().getImageDice();

        AnimatorSet imageDiceSide = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(imageFromDice, "x", -300f, xEnd);
        animationY = ObjectAnimator.ofFloat(imageFromDice, "y", -300f, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(imageFromDice, "rotation", 0f, 720f);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        imageDiceSide.playTogether(animationX, animationY, rotateAnimation);
        imageDiceSide.start();
    }
}
