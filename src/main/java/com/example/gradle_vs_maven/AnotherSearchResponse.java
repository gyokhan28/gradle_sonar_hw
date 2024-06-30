package com.example.gradle_vs_maven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnotherSearchResponse {
    private int page;
    private List<Result> results;
    private int total_pages;
    private int total_results;

}
