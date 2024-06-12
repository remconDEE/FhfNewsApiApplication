package com.firsthelpfinancial.fhfnewsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FhfNewsService {

    @Autowired
    GNewsClient gNewsClient;

    public Mono<String> getTopHeadlines(int max) {
        return gNewsClient.getTopHeadlines(max);
    }

    public Mono<String> search(String keyWord) {
        return gNewsClient.search(keyWord);
    }

    public Mono<String> searchTitleDescCont(String q, String in) {
        return gNewsClient.searchTitleDescCont(q, in);
    }

}

