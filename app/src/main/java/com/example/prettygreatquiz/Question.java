package com.example.prettygreatquiz;

public class Question {

    private boolean answer;
    private String question;

    public Question(){

    }


    public Question nextQuestion()
    {

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }



    @Override
    public String toString() {
        return "Question{" +
                "answer=" + answer +
                ", question='" + question + '\'' +
                '}';
    }
}
