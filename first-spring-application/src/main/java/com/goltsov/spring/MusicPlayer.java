package com.goltsov.spring;

import com.goltsov.spring.kindsofmusic.MusicKinds;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Music genre = musicList.get(getRandomIndex());
        return genre.getSong();
    }

    private static int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(0, 3);
    }
}
