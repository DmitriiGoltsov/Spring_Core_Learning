package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic produceClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "In the cave of mountain king";
    }

    private void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }

}
