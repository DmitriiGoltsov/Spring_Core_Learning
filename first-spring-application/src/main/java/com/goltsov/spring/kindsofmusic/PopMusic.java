package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;

public class PopMusic implements Music {

    public PopMusic() {
    }

    @Override
    public String getSong() {
        return "Thriller";
    }
}
