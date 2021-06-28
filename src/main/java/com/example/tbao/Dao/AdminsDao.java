package com.example.tbao.Dao;

import com.example.tbao.Pojo.Admins;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminsDao {
    Integer insert(Admins admins);
    Integer deleteById(int id);
    Integer updateStateById(int id,int state);
    List<Admins> selectAll(int limit,int limitNum);
    Admins selectById(int id);
    Admins selectByUsername(String username);
    Integer countAll();
}
