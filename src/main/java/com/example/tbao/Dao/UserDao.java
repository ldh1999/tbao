package com.example.tbao.Dao;

import com.example.tbao.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    Integer insert(User user);
    Integer deleteById(int id);
    Integer updateStateById(int id,int state);
    Integer updatePasswordById(int id,String password);
    Integer updateNameById(int id,String name);
    Integer updateEmailById(int id,String email);
    Integer updatePhoneById(int id,String phone);
    List<User> selectAll(int limit,int limitNum);
    Integer countAll();
    List<User> selectByUsernameOrPhoneOrEmail(String information);
    List<User> selectByNameLike(String name,int limit,int limitNum);
    Integer countByNameLike(String name);
}
