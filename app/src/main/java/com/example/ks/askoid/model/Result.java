package com.example.ks.askoid.model;

public final class Result {
    private final static Result resultInstance = new Result();
    private static Poll loadedPoll = null;

    public static Result getInstance() {
        return resultInstance;
    }

    private Result() {
    }

    public static void loadPoll() {
        loadedPoll = new Poll("Super ankieta", "Super opis");

        Question sampleQuestion = new Question("Tak czy nie?");
        Answer answer1 = new Answer("Tak");
        Answer answer2 = new Answer("Nie");
        sampleQuestion.getAnswerList().add(answer1);
        sampleQuestion.getAnswerList().add(answer2);
        loadedPoll.getQuestionList().add(sampleQuestion);
    }

    public static Poll getPoll() {
        return loadedPoll;
    }
}