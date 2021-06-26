package com.example.tbao.Dao;

import com.example.tbao.Pojo.Admins;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsDao {
    public Integer insert(Admins admins);
    public Integer deleteById(int id);
    public Integer updateStateById(int id,int state);
    public Admins selectAll();
    public Admins selectById(int id);
    public Admins seleteByUsername(String username);
}
