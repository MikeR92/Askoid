package com.example.ks.askoid.model;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private List<Answer> answerList;
    private String content;

    public Question(String content) {
        this.answerList = new ArrayList<Answer>();
        this.content = content;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}