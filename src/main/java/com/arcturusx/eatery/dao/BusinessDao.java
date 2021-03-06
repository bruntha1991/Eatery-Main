package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.BusinessEntity;

import java.util.List;

/**
 * Created by bruntha on 12/17/15.
 */
public interface BusinessDao {
    void insert(BusinessEntity businessEntity);
    void edit(BusinessEntity businessEntity);
    void delete(String businessID);
    BusinessEntity getBusiness(String businessID);
    List getAllBusinesses();
}
