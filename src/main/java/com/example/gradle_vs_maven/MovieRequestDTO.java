package com.example.gradle_vs_maven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequestDTO {
    private String media_type;
    private int media_id;
    private boolean favorite;

}
