package com.vkthumati.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /*public JokesServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    @Autowired
    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
