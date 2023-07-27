package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import org.springframework.stereotype.Component;

@Component("classical")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic produceClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "In the Hall of the Mountain King";
    }

    private void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }

}
