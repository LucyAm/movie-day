package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CinemaList implements Serializable {
    private long id;
    private String name;
    private String address;
    private String phone;
    private String siteUrl;
    private String openClosed;
}
