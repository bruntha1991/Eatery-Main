package com.arcturusx.eatery.dao;

import java.util.List;

/**
 * Created by bruntha on 2/2/16.
 */
public interface FoodDao {
    List getAllFood(String businessID,String clusterHead);
    List getAllFood(String clusterHead);
    List getAllClusterHeads();
}
