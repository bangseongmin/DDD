package com.example.ddd.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
public class Image {

    @Getter private Long id;
    @Getter private String path;
    @Getter private LocalDateTime uploadTime;

}
