package com.ivandjoh.myshell.utils;

import com.ivandjoh.myshell.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClientUtils {

    // make GET request to https://icanhazdadjoke.com/

    @GetExchange("/")
    JokeResponse getRandJoke();
}
