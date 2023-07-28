package com.goltsov.spring;

import com.goltsov.spring.kindsofmusic.ClassicalMusic;
import com.goltsov.spring.kindsofmusic.MusicKinds;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class FirstSpring {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            var player = context.getBean("player", MusicPlayer.class);

            System.out.println(player.playMusic(MusicKinds.CLASSICAL));
            System.out.println(player.playMusic(MusicKinds.ROCK));

            /*Computer computer = context.getBean("computer", Computer.class);

            System.out.println(computer);*/
        }
    }
}
