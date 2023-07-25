package com.goltsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            /*Music music = context.getBean("ClassicalMusicBean", Music.class);

            // For now without dependency injection
            MusicPlayer musicPlayer = new MusicPlayer(music);

            musicPlayer.playMusic();*/

            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic();
        }

    }
}
