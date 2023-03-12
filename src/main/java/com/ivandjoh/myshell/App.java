package com.ivandjoh.myshell;

import com.ivandjoh.myshell.utils.JokeClientUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class App {

    @Value("${remote.base.url}")
    private String jokeUrl;

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(App.class, args);
    }

    @Bean
    JokeClientUtils jokeClientUtils() {
        WebClient client = WebClient.builder()
                .baseUrl(jokeUrl)
                .defaultHeader("Accept", "application/json")
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(JokeClientUtils.class);
    }
}
