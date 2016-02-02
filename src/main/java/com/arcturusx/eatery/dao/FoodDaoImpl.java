package com.arcturusx.eatery.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by bruntha on 2/2/16.
 */
public class FoodDaoImpl implements FoodDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List getAllFood(String businessID, String clusterHead) {
        return sessionFactory.getCurrentSession().createQuery("from FoodEntity as food where food.restaurantId=:businessID and food.clusterHead=:clusterHead").setParameter("businessID",businessID).setParameter("clusterHead",clusterHead).list();

    }
}
