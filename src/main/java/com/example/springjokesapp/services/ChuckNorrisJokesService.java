package com.example.springjokesapp.services;

import com.example.springjokesapp.model.Joke;
import com.example.springjokesapp.model.JokeImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class ChuckNorrisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public Joke getRandomJoke() {
        return new JokeImpl(chuckNorrisQuotes.getRandomQuote());
    }
}
