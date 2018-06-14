package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
public class CinemaSessions implements Serializable {
    private String name;
    private String hall;
    private Date date;
    private String language;
    private String dimension;
    private Integer ticketPrice;

}
