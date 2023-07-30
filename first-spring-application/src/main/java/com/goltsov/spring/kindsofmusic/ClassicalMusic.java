package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("classical")
@Scope("prototype")
public class ClassicalMusic implements Music {

    List<String> classicalMusicList = new ArrayList<>();

    public ClassicalMusic(List<String> classicalMusicList) {
        this.classicalMusicList = classicalMusicList;
    }

    public ClassicalMusic() {
        classicalMusicList.addAll(List.of(
                "In the Hall of the Mountain King",
                "1812 Overture",
                "Valkyries' flight")
        );
    }

    @Override
    public String getSong() {
        return classicalMusicList.get(getRandomIndex());
    }

    private static int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(0, 3);
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initializing myself");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroying myself");
    }

}
