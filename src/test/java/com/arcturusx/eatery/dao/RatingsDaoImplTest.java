package com.arcturusx.eatery.dao;

import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RatingsDaoImplTest extends TestCase {

    @Autowired
    private RatingsDao ratingsDao;

    public void testInsert() throws Exception {

    }
}