package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.AspectEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class AspectDaoImpl implements AspectDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(AspectEntity aspectEntity) {
        sessionFactory.getCurrentSession().saveOrUpdate(aspectEntity);

    }

    @Override
    public void edit(AspectEntity aspectEntity) {
        sessionFactory.getCurrentSession().update(aspectEntity);

    }

    @Override
    public void delete(int aspectID) {
        sessionFactory.getCurrentSession().delete(getAspect(aspectID));

    }

    @Override
    public AspectEntity getAspect(int aspectID) {
        return (AspectEntity)sessionFactory.getCurrentSession().get(AspectEntity.class, aspectID);

    }

    @Override
    public List getAllAspects() {
        return sessionFactory.getCurrentSession().createQuery("from AspectEntity ").list();

    }
}
