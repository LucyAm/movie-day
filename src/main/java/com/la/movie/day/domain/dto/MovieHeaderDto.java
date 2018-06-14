package com.la.movie.day.domain.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class MovieHeaderDto implements Serializable {

    private Long id;
    private String name;
    private String posterUrl;
    private String genre;
    private String nowUpcoming;

}
