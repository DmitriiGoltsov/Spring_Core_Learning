package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;

public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

}
