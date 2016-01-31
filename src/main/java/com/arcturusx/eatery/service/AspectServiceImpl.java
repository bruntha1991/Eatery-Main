package com.arcturusx.eatery.service;

import com.arcturusx.eatery.dao.AspectDao;
import com.arcturusx.eatery.domain.AspectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public class AspectServiceImpl implements AspectService {
    @Autowired
    private AspectDao aspectDao;
    
    @Override    @Transactional

    public void insert(AspectEntity aspectEntity) {
        aspectDao.insert(aspectEntity);

    }

    @Override    @Transactional

    public void edit(AspectEntity aspectEntity) {
        aspectDao.edit(aspectEntity);

    }

    @Override    @Transactional

    public void delete(int aspectID) {
        aspectDao.delete(aspectID);

    }

    @Override    @Transactional

    public AspectEntity getAspect(int aspectID) {
        return aspectDao.getAspect(aspectID);

    }

    @Override    @Transactional

    public List getAllAspects() {
        return aspectDao.getAllAspects();

    }
}
