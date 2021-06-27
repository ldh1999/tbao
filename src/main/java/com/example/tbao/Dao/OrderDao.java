package com.example.tbao.Dao;

import com.example.tbao.Pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderDao {
    Integer insert(Order order);
    Integer deleteById(int id);
    Integer updateNumById(int num,int id);
    List<Order> selectAll();
    List<Order> selectByUid(int uid,int limit,int limitNum);
    List<Order> selectByCid(int cid);
}
