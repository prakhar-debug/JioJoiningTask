package com.task2.Task2.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class News {
    private String status;
    private int totalResults;
    private List<Articles> articles;
}
