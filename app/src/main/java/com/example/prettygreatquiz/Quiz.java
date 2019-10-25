package com.example.prettygreatquiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Quiz extends AppCompatActivity {

    private String question;
    private List<Question> questions;
    private boolean answer;
    private int questionNumber;
    private int score;

    public Quiz(List<Question> questions)
    {
        score = 0;
        questionNumber = 0;
        this.questions = questions;

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        wireWidgets();





        Intent answerIntent = getIntent();
        String personAnswer = answerIntent.getStringExtra(MainActivity.EXTRA_PERSONANSWER);
        if(){

        }
    }

    private void wireWidgets() {


    }

    public Quiz()
    {


    }

    public boolean checkAnswer()
    {
        return true;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
