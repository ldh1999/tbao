package com.example.tbao;

import com.example.tbao.Dao.AdminsDao;
import com.example.tbao.Dao.CommodityTypeDao;
import com.example.tbao.Dao.UserDao;
import com.example.tbao.Pojo.Admins;
import com.example.tbao.Pojo.CommodityType;
import com.example.tbao.Pojo.User;
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

    @Autowired
    private UserDao userDao;

    @Autowired
    private CommodityTypeDao commodityTypeDao;

    @Test
    void contextLoads() {
    }

    @Test
    void adminsDaoTest(){
        //log.info(adminsDao.insert(new Admins("username","password",1)).toString());
        log.info(adminsDao.selectAll().toString());
        log.info(adminsDao.selectById(1).toString());
        log.info(adminsDao.selectByUsername("username").toString());
        log.info(adminsDao.selectAll().toString());
        log.info(adminsDao.updateStateById(1,0).toString());
        log.info(adminsDao.selectAll().toString());
    }

    @Test
    void userDaoTest(){
        //log.info(userDao.insert(new User("username", "password", "name", 1, "phone", "email")).toString());

        log.info(userDao.selectAll().toString());
        log.info(userDao.selectByNameLike("n").toString());
        log.info(userDao.selectByUsernameOrPhoneOrEmail("phone").toString());
        log.info(userDao.updateEmailById(2,"email_").toString());
        log.info(userDao.updateNameById(2,"name_").toString());
        log.info(userDao.updatePasswordById(2,"password_").toString());
        log.info(userDao.updatePhoneById(2,"phone_").toString());
       //log.info(userDao.updateStateById(2,0).toString());
        log.info(userDao.selectAll().toString());
        //log.info(userDao.deleteById(1).toString());
    }

    @Test
    void commodityTypeTest(){
       // log.info(commodityTypeDao.insert(new CommodityType("name",1)).toString());
        log.info(commodityTypeDao.updateNameById("name_",1).toString());
        //log.info(commodityTypeDao.updateStateById(2,0).toString());
        log.info(commodityTypeDao.selectAll().toString());
        log.info(commodityTypeDao.selectById(2).toString());


    }

}
