
package com.example.muhit.snakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDice = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
        };

    public void rollClick (View view){
        Log.i( "Button", "Button Clicked");

        Random random = new Random();
        int randomNumber = random.nextInt(6);
        Log.i("random", "random number is " + randomNumber);

        ImageView dice = findViewById(R.id.dice);
        dice.setImageResource(myDice[randomNumber]);

//        Random random = new Random();
//        int randomNumber = random.nextInt(50) + 1;
//        Log.i("random", "random number is " + randomNumber);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
