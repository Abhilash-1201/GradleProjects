package com.acme;

public class App {
    private static String hello = "Hello world";
    public String getGreeting() {
        return hello;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
