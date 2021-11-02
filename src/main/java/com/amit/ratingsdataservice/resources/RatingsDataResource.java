package com.amit.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amit.ratingsdataservice.models.Rating;
import com.amit.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {
  
  @RequestMapping("/{movieId}")
  public Rating getRating(@PathVariable("movieId") String movieId) {
    return new Rating(movieId, 4);
    
  }
  
  @RequestMapping("users/{userId}")
  public UserRating getUserRating(@PathVariable("userId") String movieId) {
    List<Rating> ratings = Arrays.asList(
        new Rating("1234",4),
        new Rating("5678",5)
    );
    UserRating userRating = new UserRating();
    userRating.setUserRating(ratings);
    return userRating;
    
  }

}
