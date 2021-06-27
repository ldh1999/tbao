package com.example.tbao.Dao;

import com.example.tbao.Pojo.Repertory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface RepertoryDao {
    Integer insert(Repertory repertory);
    Integer deleteById(int id);
    Integer updateNumById(int num,int id);
    List<Repertory> selectAll();
    Repertory selectById(int id);
    List<Repertory> selectByCommodityId(int id);
}
