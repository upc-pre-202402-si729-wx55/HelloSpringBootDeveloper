package com.acme.platform.hellospringbootdeveloper.communication.domain.model.entities;

public class WelcomeBuilder {
    private static final String WELCOME_TEMPLATE =
            "Hello %s!. Now You are an Spring Boot Developer";

    public static String build(String name) {
        String finalName = name == null ? "Developer" : name;
        return String.format(WELCOME_TEMPLATE, finalName);
    }
}
