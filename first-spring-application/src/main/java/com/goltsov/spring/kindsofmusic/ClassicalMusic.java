package com.goltsov.spring.kindsofmusic;

import com.goltsov.spring.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "In the Hall of the Mountain King";
    }
}
