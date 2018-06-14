package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class MovieSessions implements Serializable {
    private long id;
    private long cinemaId;
    private String name;
    private int ticketPrice;
    private String hall;
    private Date date;
}
