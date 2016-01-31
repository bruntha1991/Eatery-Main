package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.CompositeScoreEntity;
import com.arcturusx.eatery.domain.CompositeScoreEntityPK;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class CompositeScoreDaoImpl implements CompositeScoreDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(CompositeScoreEntity compositeScoreEntity) {
        sessionFactory.getCurrentSession().saveOrUpdate(compositeScoreEntity);

    }

    @Override
    public void edit(CompositeScoreEntity compositeScoreEntity) {
        sessionFactory.getCurrentSession().update(compositeScoreEntity);

    }

    @Override
    public void delete(CompositeScoreEntityPK compositeScoreEntityPK) {
        sessionFactory.getCurrentSession().delete(getCompositeScore(compositeScoreEntityPK));

    }

    @Override
    public CompositeScoreEntity getCompositeScore(CompositeScoreEntityPK compositeScoreEntityPK) {
        return (CompositeScoreEntity)sessionFactory.getCurrentSession().get(CompositeScoreEntity.class, compositeScoreEntityPK);

    }

    @Override
    public List getAllCompositeScores() {
        return sessionFactory.getCurrentSession().createQuery("from CompositeScoreEntity ").list();

    }

    @Override
    public List getAllCompositeScoresOfRestaurants() {
        return sessionFactory.getCurrentSession().createQuery("from CompositeScoreEntity as score where score.aspectId=67 order by score.compositeScore").list();

    }
}
