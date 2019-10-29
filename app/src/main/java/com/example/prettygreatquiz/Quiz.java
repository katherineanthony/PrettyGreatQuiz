package com.example.prettygreatquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Quiz extends AppCompatActivity {

    private Question question;
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

    private void wireWidgets() {


    }

    public Quiz()
    {

    }

    public boolean checkAnswer(boolean personAnswer)
    {
        if(personAnswer == questions.get(questionNumber).isAnswer())
        {
            questionNumber++;
            score++;
            return true;
        }
        score--;
        return false;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        question = questions.get(questionNumber - 1);
        return question.toString();
    }
    public boolean areThereMoreQuestions()
    {
        if(questions.get(questionNumber) == 10)
        {

        }
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
