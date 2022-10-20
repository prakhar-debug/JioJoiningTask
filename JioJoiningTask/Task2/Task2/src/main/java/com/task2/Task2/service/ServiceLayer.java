package com.task2.Task2.service;

import com.task2.Task2.VO.Articles;
import com.task2.Task2.VO.News;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;

    public ServiceLayer(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public News consumeApi(){
        return restTemplate.getForObject(
                "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=3b1c892eacb44ffa9a3f099ef6f0460a"
                , News.class);

    }
}
