package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.BusinessDao;
import com.arcturusx.eatery.domain.BusinessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 12/17/15.
 */
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessDao businessDao;

    @Override
    @Transactional
    public void insert(BusinessEntity businessEntity) {
        businessDao.insert(businessEntity);

    }

    @Override
    @Transactional
    public void edit(BusinessEntity businessEntity) {
        businessDao.edit(businessEntity);

    }

    @Override
    @Transactional
    public void delete(int businessID) {
        businessDao.delete(businessID);

    }

    @Override
    @Transactional
    public BusinessEntity getBusiness(int businessID) {
        return businessDao.getBusiness(businessID);

    }

    @Override
    @Transactional
    public List getAllBusinesses() {
        return businessDao.getAllBusinesses();

    }
}
