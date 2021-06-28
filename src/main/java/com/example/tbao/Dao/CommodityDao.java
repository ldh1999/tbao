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
    Integer updateImageById(String Image,int id);
    Integer updateTypeById(int type,int id);
    List<Commodity> selectAll(int limit,int limitNum);
    Commodity selectById(int id);
    List<Commodity> selectByNameLike(String name,int limit,int limitNum);
    List<Commodity> selectByMerchantId(int merchantId,int limit,int limitNum);
}
