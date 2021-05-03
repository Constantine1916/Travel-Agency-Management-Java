package com.travel.management.dao;

import com.travel.management.bean.TravelAgencyInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelAgencyInfoDao {
    public List<TravelAgencyInfo> getInfos(); // 获取旅行社列表信息

    public int addTravelAgencyInfo(TravelAgencyInfo travelAgencyInfo); // 添加一条新数据

    public int editTravelAgencyInfo(TravelAgencyInfo travelAgencyInfo); // 修改数据

    public int deleteTravelAgencyInfo(int id); // 删除数据
}
