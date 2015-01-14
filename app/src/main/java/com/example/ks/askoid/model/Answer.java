package com.example.ks.askoid.model;

public class Answer {
    private String text;
    private Boolean chosen;

    public Answer(String text) {
        this.setText(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getChosen() {
        return chosen;
    }

    public void setChosen(Boolean chosen) {
        this.chosen = chosen;
    }
}