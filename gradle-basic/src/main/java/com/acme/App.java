package com.acme;

public class App {
    private static String HELLO = "Hello world";
    public String getGreeting() {
        return HELLO;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
