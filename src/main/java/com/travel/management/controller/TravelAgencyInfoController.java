package com.travel.management.controller;

import com.alibaba.fastjson.JSON;
import com.travel.management.bean.TravelAgencyInfo;
import com.travel.management.dao.TravelAgencyInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TravelAgencyInfoController {

    @Autowired
    TravelAgencyInfoDao travelAgencyInfoDao;

    @RequestMapping("/travelAgencyInfoManage")
    public String getAllInfos() {
        HashMap<String, Object> data = new HashMap<>();
        List<TravelAgencyInfo> infos = travelAgencyInfoDao.getAllInfos();

        if (infos!=null){
            data.put("infos",infos);
            data.put("flag",200);
        }else {
            data.put("flag",404);
        }
        String s = JSON.toJSONString(data);
        return s;
    }

    @RequestMapping("/queryInfos")
    public String getQuryInfos(@RequestBody TravelAgencyInfo travelAgencyInfo) {
        List<TravelAgencyInfo> queryInfosData = travelAgencyInfoDao.queryInfos(travelAgencyInfo);
        HashMap<String, Object> res = new HashMap<>();
        if (queryInfosData!=null){
            res.put("data",queryInfosData);
            res.put("flag",200);
        }else {
            res.put("flag",404);
        }
        String res_string = JSON.toJSONString(res);
        return res_string;
    };

    @RequestMapping("/addTravelAgencyInfo")
    public String addTravelAgencyInfo(@RequestBody TravelAgencyInfo travelAgencyInfo) {
        int i = travelAgencyInfoDao.addTravelAgencyInfo(travelAgencyInfo);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/editTravelAgencyInfo")
    public String editTravelAgencyInfo(@RequestBody TravelAgencyInfo travelAgencyInfo){
        int i = travelAgencyInfoDao.editTravelAgencyInfo(travelAgencyInfo);
        return i > 0 ? "success" : "error";
    }

    @RequestMapping("/deleteTravelAgencyInfo")
    public String deleteTravelAgencyInfo(int id){
        int i = travelAgencyInfoDao.deleteTravelAgencyInfo(id);
        return i > 0 ? "success" : "error";
    }
}
