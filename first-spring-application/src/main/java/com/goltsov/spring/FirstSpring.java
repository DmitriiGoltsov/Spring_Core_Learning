package com.goltsov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpring {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class)) {

            Computer computer = context.getBean("computer", Computer.class);

            System.out.println(computer.getMusicPlayer().playMusic());;

        }
    }
}
