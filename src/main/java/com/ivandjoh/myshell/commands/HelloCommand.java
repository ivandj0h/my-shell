package com.ivandjoh.myshell.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value = "Say welcome")
    public String welcome(@ShellOption(defaultValue = "World") String arg) {
        return "Hello " + arg + "!";
    }

    @ShellMethod(key = "goodbye", value = "Say goodbye")
    public String goodbye() {
        return "Goodbye World!";
    }
}
