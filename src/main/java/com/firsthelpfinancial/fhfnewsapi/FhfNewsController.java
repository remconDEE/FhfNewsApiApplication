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

//    private final FhfNewsService fhfNewsService;
//
//    @Autowired
//    public FhfNewsController(FhfNewsService fhfNewsService) {
//        this.fhfNewsService = fhfNewsService;
//    }

    @Autowired
    FhfNewsService fhfNewsService;

    @GetMapping("/top-headlines")
    public Mono<String> getTopHeadlines(@RequestParam int max, @RequestParam String apiKey) {
        // http://localhost:8080/fhf/news/api/top-headlines?max=5&apiKey=5738b5ee38e3ead47a76216f0fe52ca0
        return fhfNewsService.getTopHeadlines(max, apiKey);
    }

    @GetMapping("/search")
    public Mono<String> search(@RequestParam String q, @RequestParam String apiKey) {
        // http://localhost:8080/fhf/news/api/search?q="Nyheter"&apiKey=5738b5ee38e3ead47a76216f0fe52ca0
        return fhfNewsService.search(q, apiKey);
    }

    @GetMapping("/search-title-description-content")
    public Mono<String> searchTitleDescCont(@RequestParam String q, @RequestParam String in, @RequestParam String apiKey) {
        // http://localhost:8080/fhf/news/api/search-title-description-content?q=x&in=example&apiKey=5738b5ee38e3ead47a76216f0fe52ca0
        return fhfNewsService.searchTitleDescCont(q, in, apiKey);
    }

}
