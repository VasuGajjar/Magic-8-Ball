package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        final ImageView img = findViewById(R.id.img);
        final int[] imgs = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random num = new Random();
                img.setImageResource(imgs[num.nextInt(5)]);
            }
        });
    }
}
