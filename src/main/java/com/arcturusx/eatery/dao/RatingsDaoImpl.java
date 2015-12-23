package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.RatingsEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 11/13/15.
 */
public class RatingsDaoImpl implements RatingsDao {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void insert(RatingsEntity ratingsEntity) {
        sessionFactory.getCurrentSession().saveOrUpdate(ratingsEntity);

    }

    @Override
    public void edit(RatingsEntity ratingsEntity) {
        sessionFactory.getCurrentSession().update(ratingsEntity);

    }

    @Override
    public void delete(int ratingID) {
        sessionFactory.getCurrentSession().delete(getRating(ratingID));

    }

    @Override
    public RatingsEntity getRating(int ratingID) {
        return (RatingsEntity)sessionFactory.getCurrentSession().get(RatingsEntity.class, ratingID);

    }

    @Override
    public List getAllRatings() {
        return sessionFactory.getCurrentSession().createQuery("from RatingsEntity").list();

    }
}
