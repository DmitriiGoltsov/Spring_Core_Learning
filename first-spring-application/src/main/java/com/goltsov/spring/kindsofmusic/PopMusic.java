package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

@Component("pop")
public class PopMusic implements Music {

    public PopMusic() {
    }

    @Override
    public String getSong() {
        return "Thriller";
    }
}
