package com.arcturusx.eatery;

import com.arcturusx.eatery.domain.BusinessEntity;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruntha on 12/23/15.
 */
public class Business {

    public List updateTopBusiness(String filePath) throws IOException, ParseException {
        List list = new ArrayList();
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {

            list.add(getBusinessFromJson(line));
        }
        br.close();
        fr.close();
        return list;
    }

    private BusinessEntity getBusinessFromJson(String json) throws ParseException {
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        Object obj = parser.parse(json);
        JSONObject jsonObject = (JSONObject) obj;

        BusinessEntity businessEntity=new BusinessEntity(jsonObject.get("business_id").toString(),"",jsonObject.get("type").toString(),"","",Float.parseFloat(jsonObject.get("stars").toString()));

        return businessEntity;
    }
}
