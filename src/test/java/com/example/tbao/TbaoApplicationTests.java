package com.example.tbao;

import com.example.tbao.Dao.AdminsDao;
import com.example.tbao.Pojo.Admins;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TbaoApplicationTests {

    private static Logger log= LoggerFactory.getLogger(TbaoApplicationTests.class);

    @Autowired
    private AdminsDao adminsDao;

    @Test
    void contextLoads() {
    }

    @Test
    void adminsDao(){
        //log.info(adminsDao.insert(new Admins("username","password",1)).toString());
        log.info(adminsDao.selectAll().toString());
        log.info(adminsDao.selectById(1).toString());
        log.info(adminsDao.selectByUsername("username").toString());
        log.info(adminsDao.selectAll().toString());
        log.info(adminsDao.updateStateById(1,0).toString());
        log.info(adminsDao.selectAll().toString());

    }

}
