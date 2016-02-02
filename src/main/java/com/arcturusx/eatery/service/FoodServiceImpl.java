package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 2/2/16.
 */
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;

    @Override
    @Transactional
    public List getAllFood(String businessID, String clusterHead) {
        return foodDao.getAllFood(businessID, clusterHead);
    }

    @Override
    public List getAllFood(String clusterHead) {
        return foodDao.getAllFood(clusterHead);
    }

    @Override
    public List getAllClusterHeads() {
        return foodDao.getAllClusterHeads();
    }
}
