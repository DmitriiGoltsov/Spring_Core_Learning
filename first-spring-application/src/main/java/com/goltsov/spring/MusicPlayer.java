package com.goltsov.spring;

import com.goltsov.spring.kindsofmusic.MusicKinds;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("player")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music rockMusic;
    private Music classicalMusic;

    public MusicPlayer(@Qualifier("classical") Music rockMusic, @Qualifier("someRockMusic")Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
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
