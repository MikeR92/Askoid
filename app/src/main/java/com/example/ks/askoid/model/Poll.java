package com.example.ks.askoid.model;

import java.util.ArrayList;
import java.util.List;

public class Poll {
    private String name;
    private String description;
    private List<Question> questionList;

    public Poll(String name, String description) {
        this.name = name;
        this.description = description;
        this.questionList = new ArrayList<Question>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }
}