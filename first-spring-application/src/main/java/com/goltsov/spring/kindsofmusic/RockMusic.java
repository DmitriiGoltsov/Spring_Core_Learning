package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {

    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Master of puppets";
    }

}
