package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {

    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Master of puppets";
    }
}
