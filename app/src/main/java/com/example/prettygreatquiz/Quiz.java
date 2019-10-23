package com.example.prettygreatquiz;

import java.util.List;

public class Quiz {

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
