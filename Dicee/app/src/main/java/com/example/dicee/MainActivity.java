package com.example.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_roll;
    ImageView dice_left_img, dice_right_img;
    final int[] diceArray = {
          R.drawable.dice1,
       R.drawable.dice2,
       R.drawable.dice3,
        R.drawable.dice4,
          R.drawable.dice5,
         R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_roll = (Button) findViewById(R.id.btn_roll);
        dice_left_img = (ImageView) findViewById(R.id.image_leftDice);
        dice_right_img = (ImageView) findViewById(R.id.image_rightDice);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Dicee","Dice Button Pressed");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                //btn_roll.setText(number);
                dice_left_img.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                //btn_roll.setText(number);
                dice_right_img.setImageResource(diceArray[number]);

            }
        });
    }
}
