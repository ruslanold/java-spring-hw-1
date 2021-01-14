package com.spring.mavenspringboot.entyty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private long id;
    private String title;
    private String genre;
    private int duration;
}
