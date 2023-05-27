package dev.jack.movies.service;

import dev.jack.movies.model.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface IMovieService {

    List<Movie> findAllMovies();
    Optional<Movie> findMovieByImdbId(String id);
}
