package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic produceClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

    private void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }

}
