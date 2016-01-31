package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.CompositeScoreDao;
import com.arcturusx.eatery.domain.CompositeScoreEntity;
import com.arcturusx.eatery.domain.CompositeScoreEntityPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class CompositeScoreServiceImpl implements CompositeScoreService {
    @Autowired
    private CompositeScoreDao compositeScoreDao;

    @Override
    @Transactional
    public void insert(CompositeScoreEntity compositeScoreEntity) {
        compositeScoreDao.insert(compositeScoreEntity);

    }

    @Override
    @Transactional
    public void edit(CompositeScoreEntity compositeScoreEntity) {
        compositeScoreDao.edit(compositeScoreEntity);

    }

    @Override
    @Transactional
    public void delete(CompositeScoreEntityPK compositeScoreEntityPK) {
        compositeScoreDao.delete(compositeScoreEntityPK);

    }

    @Override
    @Transactional
    public CompositeScoreEntity getCompositeScore(CompositeScoreEntityPK compositeScoreEntityPK) {
        return compositeScoreDao.getCompositeScore(compositeScoreEntityPK);

    }

    @Override
    @Transactional
    public List getAllCompositeScores() {
        return compositeScoreDao.getAllCompositeScores();

    }

    @Override
    @Transactional
    public List getAllCompositeScoresOfRestaurants() {
        return compositeScoreDao.getAllCompositeScoresOfRestaurants();
    }
}
