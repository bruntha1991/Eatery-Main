package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.WeightsEntity;
import com.arcturusx.eatery.domain.WeightsEntityPK;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public interface WeightDao {
    void insert(WeightsEntity weightsEntity);
    void edit(WeightsEntity weightsEntity);
    void delete(WeightsEntityPK weightsEntityPK);
    WeightsEntity getWeight(WeightsEntityPK weightsEntityPK);
    List getAllWeights();
    List getWeights(String parentAspect);
}
