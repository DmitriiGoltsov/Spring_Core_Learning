package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("someRockMusic")
public class RockMusic implements Music {

    List<String> rockmusicList = new ArrayList<>();

    public RockMusic(List<String> rockmusicList) {
        this.rockmusicList = rockmusicList;
    }

    public RockMusic() {
        rockmusicList.addAll(List.of(
                "Master of puppets",
                "We will rock you!",
                "Attack of the dead men"
        ));
    }

    @Override
    public String getSong() {
        return rockmusicList.get(getRandomIndex());
    }

    private static int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(0, 3);
    }
}
