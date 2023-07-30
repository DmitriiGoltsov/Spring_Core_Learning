package com.goltsov.spring;

import com.goltsov.spring.kindsofmusic.ClassicalMusic;
import com.goltsov.spring.kindsofmusic.PopMusic;
import com.goltsov.spring.kindsofmusic.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> getMusicList() {
        return List.of(classicalMusic(), rockMusic(), popMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(getMusicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }


}
