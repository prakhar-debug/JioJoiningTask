package com.task2.Task2.controller;

import com.task2.Task2.VO.Articles;
import com.task2.Task2.VO.News;
import com.task2.Task2.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private final ServiceLayer serviceLayer;

    @Autowired
    public Controller(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/allData")
    public News getAllData(){
        News latestNews = serviceLayer.consumeApi();
        return latestNews;

    }

    @GetMapping("/articles/{id}")
    public Articles getArticlesOnIdex(@PathVariable int id){
        News latestNews = serviceLayer.consumeApi();
        Articles[] articles = latestNews.getArticles().toArray(new Articles[id]);
        return articles[id];

    }
}
