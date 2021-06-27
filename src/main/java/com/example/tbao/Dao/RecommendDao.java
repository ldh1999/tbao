package com.example.tbao.Dao;

import com.example.tbao.Pojo.Recommend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecommendDao {
    Integer insert(Recommend recommend);
    Integer deleteById(int id);
    Integer deleteByCid(int cid);
    Integer updateGradeById(int grade,int id);
    List<Recommend> selectAll();
    Recommend selectByCommodityId(int cid);
}
