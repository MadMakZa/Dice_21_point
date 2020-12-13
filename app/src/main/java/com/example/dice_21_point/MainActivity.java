package com.example.dice_21_point;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonBet;
    private Button buttonRoll;
    private Button buttonStop;
    private ImageView imageDice;

    public ImageView getImageDice() {
        return imageDice;
    }

    public void setImageDice(ImageView imageDice) {
        this.imageDice = imageDice;
    }

    //доступ к изменению переменных в этом классе
    private static MainActivity instance;
    public static MainActivity getInstance(){
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        imageDice = findViewById(R.id.imageDiceOne);
        buttonBet = findViewById(R.id.button_bet);
        buttonRoll = findViewById(R.id.button_roll);
        buttonStop = findViewById(R.id.button_stop);
    }
}