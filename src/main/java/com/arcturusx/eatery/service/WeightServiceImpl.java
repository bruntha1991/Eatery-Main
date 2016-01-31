package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.WeightDao;
import com.arcturusx.eatery.domain.WeightsEntity;
import com.arcturusx.eatery.domain.WeightsEntityPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class WeightServiceImpl implements WeightService {
    @Autowired
    private WeightDao weightDao;

    @Override
    @Transactional

    public void insert(WeightsEntity weightsEntity) {
        weightDao.insert(weightsEntity);

    }

    @Override
    @Transactional

    public void edit(WeightsEntity weightsEntity) {
        weightDao.edit(weightsEntity);

    }

    @Override
    @Transactional

    public void delete(WeightsEntityPK weightsEntityPK) {
        weightDao.delete(weightsEntityPK);

    }

    @Override
    @Transactional

    public WeightsEntity getWeight(WeightsEntityPK weightsEntityPK) {
        return weightDao.getWeight(weightsEntityPK);

    }

    @Override
    @Transactional

    public List getAllWeights() {
        return weightDao.getAllWeights();

    }

    @Override    @Transactional

    public List getWeights(String parentAspect) {
        return weightDao.getWeights(parentAspect);
    }
}
