package com.example.prettygreatquiz;

import androidx.appcompat.app.AppCompatActivity;

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


    public boolean checkAnswer(boolean personAnswer)
    {
        if(personAnswer == questions.get(questionNumber).isAnswer())
        {
            score++;
            return true;
        }
        else{
        score--;
        }
        return false;
    }

    public void nextQuestion() {
        questionNumber++;
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

    public void setScore(int score){
        this.score = score;
    }

    public String getQuestion() {
        question = questions.get(questionNumber);
        return question.getQuestion();

    }
    public boolean areThereMoreQuestions()
    {
        if(questionNumber + 1 <= questions.size() - 1)
        {
            return true;

        }
        return false;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getScore(){ return score; }
}
