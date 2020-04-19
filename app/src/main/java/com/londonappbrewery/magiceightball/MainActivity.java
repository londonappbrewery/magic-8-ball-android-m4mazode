package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        // Declaring and linking my variables in order to use buttons and images.
        Button myButton;
        myButton = findViewById(R.id.clickButton);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5};

        /* Declaring an OnClickListener in order to detect taps on screen. Deploying Log statements
        in order to confirm functionality of the Button being pressed. */

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magic-8-ball", "Button has been clicked!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });





    }
}
