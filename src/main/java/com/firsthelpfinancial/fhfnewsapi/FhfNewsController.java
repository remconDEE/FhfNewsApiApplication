package com.firsthelpfinancial.fhfnewsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fhf/news/api")
public class FhfNewsController {

    @Autowired
    FhfNewsService fhfNewsService;

    @GetMapping("/top-headlines")
    public Mono<String> getTopHeadlines(@RequestParam int max, @RequestParam String apiKey) {
        return fhfNewsService.getTopHeadlines(max, apiKey);
    }

    @GetMapping("/search")
    public Mono<String> search(@RequestParam String q, @RequestParam String apiKey) {
        return fhfNewsService.search(q, apiKey);
    }

    @GetMapping("/search-title-description-content")
    public Mono<String> searchTitleDescCont(@RequestParam String q, @RequestParam String in, @RequestParam String apiKey) {
        return fhfNewsService.searchTitleDescCont(q, in, apiKey);
    }

}
