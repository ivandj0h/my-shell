package com.ivandjoh.myshell.utils;

import com.ivandjoh.myshell.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClientUtils {

    @GetExchange("/")
    JokeResponse getRandJoke();
}
