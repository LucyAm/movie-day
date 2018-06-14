package com.la.movie.day.repository;

import com.la.movie.day.domain.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepo extends JpaRepository<Cinema, Long> {
}
