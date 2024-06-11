# First Help Financing News API

## Project Description

This project is a Spring Boot Microservice, First Help Financing News API:
1. An endpoint to retrieve the top headlines based on the number of headlines the user wants. 
- \<host name\>/fhf/news/api/top-headlines?max=\<number of headlines\>&apiKey=\<the api key\>
- http://localhost:8080/fhf/news/api/top-headlines?max=5&apiKey=5738b5ee38e3ead47a76216f0fe52ca0

2. An endpoint to search news articles based on a given keyword.
- \<host name\>/fhf/news/api/search?q=\<keyword\>&apiKey=\<the api key\>
- http://localhost:8080/fhf/news/api/search?q="Nyheter"&apiKey=5738b5ee38e3ead47a76216f0fe52ca0
- keywwords that are more than 1 word or has special characters and such should be surrounded by double quotes.


3. An endpoint to search news articles based on a given keyword inside the title, description and content attributes.
- \<host name\>/fhf/news/api/search-title-description-content?q=\<keyword\>&in=\<keyword\>&apiKey=\<the api key\>
- http://localhost:8080/fhf/news/api/search-title-description-content?q=x&in=example&apiKey=5738b5ee38e3ead47a76216f0fe52ca0
- q request parameter is required

## Prerequisites

Before you begin, ensure you have met the following requirements:
- You have installed [Java 17](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or later.
- You have installed [Maven](https://maven.apache.org/install.html).
- You will use [Spring Boot](https://start.spring.io/).
- You have access to [GNews](https://gnews.io/) where you will generate an API key that you will need to hit the services in this Public News API.

