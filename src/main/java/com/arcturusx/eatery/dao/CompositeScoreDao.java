package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.CompositeScoreEntity;
import com.arcturusx.eatery.domain.CompositeScoreEntityPK;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public interface CompositeScoreDao {
    void insert(CompositeScoreEntity compositeScoreEntity);
    void edit(CompositeScoreEntity compositeScoreEntity);
    void delete(CompositeScoreEntityPK compositeScoreEntityPK);
    CompositeScoreEntity getCompositeScore(CompositeScoreEntityPK compositeScoreEntityPK);
    List getAllCompositeScores();
    List getAllCompositeScoresOfRestaurants();
}
