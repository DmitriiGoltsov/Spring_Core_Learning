package com.goltsov.spring;

public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static void doMyTestInit() {
        System.out.println("Initializing myself!");
    }

    private static void doMyTestDestroy() {
        System.out.println("Destroying myself!");
    }
}
