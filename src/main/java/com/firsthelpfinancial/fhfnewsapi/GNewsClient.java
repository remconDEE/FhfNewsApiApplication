package com.firsthelpfinancial.fhfnewsapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class GNewsClient {

    @Value("${gnews.api.base.uri}")
    private String baseUri;

    @Value("${gnews.api.key}")
    private String apiKey;

    public Mono<String> getTopHeadlines(int max) {
        return WebClient.builder()
                .baseUrl(baseUri)
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/top-headlines")
                        .queryParam("max", max)
                        .queryParam("apikey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> search(String keyWord) {
        return WebClient.builder()
                .baseUrl(baseUri)
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search")
                        .queryParam("q", keyWord)
                        .queryParam("apikey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> searchTitleDescCont(String q, String in) {
        return WebClient.builder()
                .baseUrl(baseUri)
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search")
                        .queryParam("q", q)
                        .queryParam("in", in)
                        .queryParam("apikey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}
