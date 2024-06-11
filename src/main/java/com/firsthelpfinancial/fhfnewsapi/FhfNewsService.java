package com.firsthelpfinancial.fhfnewsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FhfNewsService {

    @Autowired
    GNewsClient gNewsClient;

    public Mono<String> getTopHeadlines(int max, String apiKey) {
        return gNewsClient.getTopHeadlines(max, apiKey);
    }

    public Mono<String> search(String keyWord, String apiKey) {
        return gNewsClient.search(keyWord, apiKey);
    }

    public Mono<String> searchTitleDescCont(String q, String in, String apiKey) {
        return gNewsClient.searchTitleDescCont(q, in, apiKey);
    }

}

