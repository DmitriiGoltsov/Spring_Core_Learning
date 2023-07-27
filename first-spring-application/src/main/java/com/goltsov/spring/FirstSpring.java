package com.goltsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            Music rockSong = context.getBean("someRockMusic", Music.class);
            Music popSong = context.getBean("pop", Music.class);
            var classicalMusic = context.getBean("classicalMusic", Music.class);

            MusicPlayer musicPlayer = new MusicPlayer(rockSong);
            musicPlayer.playMusic();
            System.out.println("\n");

            System.out.println(rockSong.getSong());
            System.out.println(popSong.getSong());
            System.out.println(classicalMusic.getSong());

        }
    }
}
