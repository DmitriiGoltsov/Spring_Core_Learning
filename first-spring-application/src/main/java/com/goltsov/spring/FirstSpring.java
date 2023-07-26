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

            /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic();
            System.out.println(musicPlayer.getVolume() + " " + musicPlayer.getName());*/

            /*MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
            MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

            boolean comparison = musicPlayer1 == musicPlayer2;

            System.out.println(comparison + "\n");

            System.out.println(musicPlayer1);
            System.out.println(musicPlayer2);

            musicPlayer1.setVolume(10);

            System.out.println(musicPlayer1.getVolume());
            System.out.println(musicPlayer2.getVolume());*/
//
//            TestBean testBean = context.getBean("testBean", TestBean.class);
//            TestBean testBean2 = context.getBean("testBean", TestBean.class);

            Music classicalMusic = context.getBean("ClassicalMusicBean", Music.class);
            System.out.println(classicalMusic.getSong());

        }

    }
}
