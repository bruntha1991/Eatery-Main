package com.arcturusx.eatery.dao;

import com.arcturusx.eatery.domain.AspectEntity;

import java.util.List;

/**
 * Created by bruntha on 1/31/16.
 */
public interface AspectDao {
    void insert(AspectEntity aspectEntity);
    void edit(AspectEntity aspectEntity);
    void delete(int aspectID);
    AspectEntity getAspect(int aspectID);
    List getAllAspects();
}
