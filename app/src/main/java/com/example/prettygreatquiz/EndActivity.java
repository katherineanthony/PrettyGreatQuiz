package com.example.prettygreatquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EndActivity extends AppCompatActivity {

    private TextView score;
    private Button playAgain;
    private int numberTotalCorrect;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        wireWidgets();

        Intent letsGo = getIntent();
        int scoreNumber = letsGo.getIntExtra(MainActivity.EXTRA_SCORE, -3);


        score.setText(String.valueOf(scoreNumber));

        setListeners();

    }

    private void setListeners() {

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void wireWidgets() {
        playAgain=findViewById(R.id.button_end_playAgain);
        score=findViewById(R.id.textView_end_score);
    }

}

