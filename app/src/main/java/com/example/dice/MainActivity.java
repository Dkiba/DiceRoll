package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll;
        roll = (Button)findViewById(R.id.roll_button);

        final ImageView leftdice = (ImageView)findViewById(R.id.left_dice);

        final ImageView rightdice = (ImageView)findViewById(R.id.right_dice);

        final int [] dicearray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dice","button clicked");

                Random rand = new Random();
                int number = rand.nextInt(6);

                Log.d("Dice","The random number is:"+number);

                leftdice.setImageResource(dicearray[number]);

                int number2 = rand.nextInt(6);
                rightdice.setImageResource(dicearray[number2]);

            }
        });



    }
}