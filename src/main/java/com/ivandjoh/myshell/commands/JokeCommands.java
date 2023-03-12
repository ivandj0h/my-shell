package com.ivandjoh.myshell.commands;

import com.ivandjoh.myshell.model.JokeResponse;
import com.ivandjoh.myshell.utils.JokeClientUtils;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;


@ShellComponent
public class JokeCommands {

    private final JokeClientUtils jokeClientUtils;

    public JokeCommands(JokeClientUtils jokeClientUtils) {
        this.jokeClientUtils = jokeClientUtils;
    }

    @ShellMethod(key = "joke", value = "Get a random joke")
    public String getRandJoke() {

        JokeResponse randJoke = jokeClientUtils.getRandJoke();

        return randJoke.joke();
    }
}
