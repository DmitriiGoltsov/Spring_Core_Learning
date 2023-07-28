package com.goltsov.spring;

import com.goltsov.spring.kindsofmusic.MusicKinds;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    public MusicPlayer(@Qualifier("classical") Music rockMusic, @Qualifier("someRockMusic")Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }


    public String playMusic(MusicKinds musicKinds) {
        switch (musicKinds) {
            case CLASSICAL -> {
                return classicalMusic.getSong();
            }
            case ROCK -> {
                return rockMusic.getSong();
            }
        }
        throw new RuntimeException("Error! Music lists are empty! Could not play music!");
    }
}
