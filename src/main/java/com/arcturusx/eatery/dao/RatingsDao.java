package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.RatingsEntity;

import java.util.List;

/**
 * Created by bruntha on 11/13/15.
 */
public interface RatingsDao {
    void insert(RatingsEntity ratingsEntity);
    void edit(RatingsEntity ratingsEntity);
    void delete(int ratingID);
    RatingsEntity getRating(int ratingID);
    List getAllRatings();
}
