package com.example.tbao.Dao;

import com.example.tbao.Pojo.CommodityType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityTypeDao {
    Integer insert(CommodityType commodityType);
    Integer deleteById(int id);
    Integer updateNameById(String name,int id);
    Integer updateStateById(int id,int state);
    List<CommodityType> selectAll();
    CommodityType selectById(int id);
}
