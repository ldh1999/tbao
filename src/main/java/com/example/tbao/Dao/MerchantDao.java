package com.example.tbao.Dao;

import com.example.tbao.Pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MerchantDao {
    Integer insert(Merchant merchant);
    Integer deleteById(int id);
    Integer updateStateById(int state,int id);
    Integer updateNameById(String name,int id);
    Integer updateImageById(String image,int id);
    Merchant selectById(int id);
    List<Merchant> selectByUid(int uid);
    List<Merchant> selectByNameLike(String name,int limit,int limitNum);
    Integer countByNameLike(String name);
}
