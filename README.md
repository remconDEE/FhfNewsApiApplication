# First Help Financing News API
By: Marlon Taboso

## Project Description

This project is a Spring Boot Microservice, First Help Financing News API.

Below are the 3 endpoints that you can hit in this webservice.

1. An endpoint to retrieve the top headlines based on the number of headlines the user wants, using the max request param. 
- \<host name\>/fhf/news/api/top-headlines?max=\<number of headlines\>
- http://localhost:8080/fhf/news/api/top-headlines?max=5

2. An endpoint to search news articles based on a given keyword, using the q request param.
- \<host name\>/fhf/news/api/search?q=\<keyword\>
- http://localhost:8080/fhf/news/api/search?q=example
- keywwords that are more than 1 word or has special characters and such should be surrounded by double quotes.

3. An endpoint to search news articles based on a given keyword inside the title, description and content attributes, using the q and in request params.
- \<host name\>/fhf/news/api/search-title-description-content?q=\<keyword\>&in=\<keyword\>
- http://localhost:8080/fhf/news/api/search-title-description-content?q=hello&in=example
- q request parameter is required

## Prerequisites

Before you begin, ensure you have met the following requirements:
- You have installed [Java 17](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or later.
- You have installed [Maven](https://maven.apache.org/install.html).
- You will use [Spring Boot](https://start.spring.io/).

## GNews API
- [GNews](https://gnews.io/) is the Public News API that this application is hitting behind the scenes. You will see the webservices here that is being hit by this application. You will also generate an API key in here, which you will need to access the webservices of GNews.

## Running First Help Financing News API
You can just simply run this application and when it is already running, you can use [Postman](https://www.postman.com/downloads/) and hit the endpoints written above.


