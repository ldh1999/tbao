package com.example.tbao.Dao;

import com.example.tbao.Pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityDao {
    Integer insert(Commodity commodity);
    Integer deleteById(int id);
    Integer updateNameById(String name,int id);
    Integer updateIntroduceById(String introduce,int id);
    Integer updatePriceById(int price,int id);
    Integer updateStateById(int state ,int id);
    Integer updateTypeById(int type,int id);
    List<Commodity> selectAll();
    Commodity selectById(int id);
    List<Commodity> selectByNameLike(String name);
}
