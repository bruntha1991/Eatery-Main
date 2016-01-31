package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.WeightsEntity;
import com.arcturusx.eatery.domain.WeightsEntityPK;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class WeightDaoImpl implements WeightDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(WeightsEntity weightsEntity) {
        sessionFactory.getCurrentSession().saveOrUpdate(weightsEntity);

    }

    @Override
    public void edit(WeightsEntity weightsEntity) {
        sessionFactory.getCurrentSession().update(weightsEntity);

    }

    @Override
    public void delete(WeightsEntityPK weightsEntityPK) {
        sessionFactory.getCurrentSession().delete(getWeight(weightsEntityPK));

    }

    @Override
    public WeightsEntity getWeight(WeightsEntityPK weightsEntityPK) {
        return (WeightsEntity)sessionFactory.getCurrentSession().get(WeightsEntity.class, weightsEntityPK);

    }

    @Override
    public List getAllWeights() {
        return sessionFactory.getCurrentSession().createQuery("from WeightsEntity ").list();

    }
}
