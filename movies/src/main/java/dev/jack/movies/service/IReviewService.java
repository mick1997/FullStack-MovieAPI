package dev.jack.movies.service;

import dev.jack.movies.model.Review;

public interface IReviewService {

    Review createReview(String reviewBody, String imdbId);

}
