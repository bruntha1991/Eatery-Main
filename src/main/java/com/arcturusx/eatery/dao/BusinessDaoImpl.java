package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.BusinessEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 12/17/15.
 */
public class BusinessDaoImpl implements BusinessDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(BusinessEntity businessEntity) {
        sessionFactory.getCurrentSession().saveOrUpdate(businessEntity);

    }

    @Override
    public void edit(BusinessEntity businessEntity) {
        sessionFactory.getCurrentSession().update(businessEntity);

    }

    @Override
    public void delete(int businessID) {
        sessionFactory.getCurrentSession().delete(getBusiness(businessID));

    }

    @Override
    public BusinessEntity getBusiness(int businessID) {
        return (BusinessEntity)sessionFactory.getCurrentSession().get(BusinessEntity.class, businessID);

    }

    @Override
    public List getAllBusinesses() {
        return sessionFactory.getCurrentSession().createQuery("from BusinessEntity").list();

    }
}
