package com.ivandjoh.myshell.commands;

import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class JokeCommands {

    public String getRandJoke() {
        return "This is a joke";
    }
}
