package com.example.springjokesapp.model;


public class JokeImpl implements Joke {

    private String jokeQuote;

    public JokeImpl(String jokeQuote) {
        this.jokeQuote = jokeQuote;
    }

    public String getJokeQuote() {
        return jokeQuote;
    }

    public void setJokeQuote(String jokeQuote) {
        this.jokeQuote = jokeQuote;
    }
}
