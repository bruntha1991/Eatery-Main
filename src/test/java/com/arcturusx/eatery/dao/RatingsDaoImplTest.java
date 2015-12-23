package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.RatingsEntity;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RatingsDaoImplTest extends TestCase {

    @Autowired
    private RatingsDao ratingsDao;

    public void testInsert() throws Exception {

        ratingsDao.insert(new RatingsEntity("sssss","ass","ssss",52.00,10,1,10.0));
    }
}