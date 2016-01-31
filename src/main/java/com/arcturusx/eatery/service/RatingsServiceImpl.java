package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.RatingsDao;
import com.arcturusx.eatery.domain.RatingsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 11/13/15.
 */
public class RatingsServiceImpl implements RatingsService {
    @Autowired
    private RatingsDao ratingsDao;

    @Override
    @Transactional
    public void insert(RatingsEntity ratingsEntity) {
        ratingsDao.insert(ratingsEntity);

    }

    @Override
    @Transactional
    public void edit(RatingsEntity ratingsEntity) {
        ratingsDao.edit(ratingsEntity);

    }

    @Override
    @Transactional
    public void delete(int ratingID) {
        ratingsDao.delete(ratingID);

    }

    @Override
    @Transactional
    public RatingsEntity getRating(int ratingID) {
        return ratingsDao.getRating(ratingID);

    }

    @Override
    @Transactional
    public List getAllRatings() {
        return ratingsDao.getAllRatings();

    }

    @Override
    @Transactional
    public List getRatings(String businessID) {
        return ratingsDao.getRatings(businessID);
    }
}
