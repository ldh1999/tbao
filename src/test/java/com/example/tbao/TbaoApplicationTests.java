package com.example.tbao;

import com.example.tbao.Dao.*;
import com.example.tbao.Pojo.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.rmi.runtime.Log;

import java.util.Date;
import java.util.function.Consumer;

@SpringBootTest
class TbaoApplicationTests {

    private static Logger log= LoggerFactory.getLogger(TbaoApplicationTests.class);

    @Autowired
    private AdminsDao adminsDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private CommodityTypeDao commodityTypeDao;

    @Autowired
    private CommodityDao commodityDao;

    @Autowired
    private RepertoryDao repertoryDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private RecommendDao recommendDao;

    @Autowired
    private MerchantDao merchantDao;

    @Test
    void contextLoads() {
    }

    @Test
    void adminsDaoTest(){

        //log.info(adminsDao.insert(new Admins("username","password",1)).toString());
        log.info(adminsDao.selectAll(0,5).toString());
//        log.info(adminsDao.selectById(1).toString());
//        log.info(adminsDao.selectByUsername("username").toString());
//        log.info(adminsDao.selectAll(0,5).toString());
//        log.info(adminsDao.updateStateById(1,0).toString());
//        log.info(adminsDao.selectAll(0,5).toString());
        adminsDao.selectAll(0,5).forEach(x->log.info(x.toString()));
    }

    @Test
    void userDaoTest(){
        log.info(userDao.insert(new User("username", "password", "name","image", 1, "phone", "email")).toString());

        log.info(userDao.selectAll(0,4).toString());
        log.info(userDao.selectByNameLike("n",0,4).toString());
        log.info(userDao.selectByUsernameOrPhoneOrEmail("phone").toString());
        log.info(userDao.updateEmailById(2,"email_").toString());
        log.info(userDao.updateNameById(2,"name_").toString());
        log.info(userDao.updatePasswordById(2,"password_").toString());
        log.info(userDao.updatePhoneById(2,"phone_").toString());
        log.info(userDao.updateStateById(2,0).toString());
        log.info(userDao.selectAll(0,4).toString());
        log.info(userDao.deleteById(1).toString());
    }

    @Test
    void commodityTypeTest(){
       // log.info(commodityTypeDao.insert(new CommodityType("name",1)).toString());
        log.info(commodityTypeDao.updateNameById("name_",1).toString());
        //log.info(commodityTypeDao.updateStateById(2,0).toString());
        log.info(commodityTypeDao.selectAll().toString());
        log.info(commodityTypeDao.selectById(2).toString());
    }
    @Test
    void CommodityDaoTest(){
        Date date=new Date();
        /*for (int i=0;i<5;i++){
            log.info(commodityDao.insert(new Commodity("name", "introduce", 1,"image", date, new CommodityType(2,"name",1), 1, 1)).toString());
        }*/
        /*commodityDao.selectAll(0,5).forEach(x-> log.info(x.toString()));
        commodityDao.selectByNameLike("n",0,5).forEach(x->log.info(x.toString()));*/
        commodityDao.selectByMerchantId(1,0,10).forEach(x-> log.info(x.toString()));
        /*log.info(commodityDao.selectAll(0,5).toString());
        log.info(commodityDao.selectById(2).getIntroduce());
        log.info(commodityDao.selectByNameLike("n",0,5).toString());
        log.info(commodityDao.updateIntroduceById("introduce_",2).toString());
        log.info(commodityDao.updateNameById("name_",2).toString());
        log.info(commodityDao.updatePriceById(2,2).toString());
        log.info(commodityDao.updateTypeById(2,2).toString());
        log.info(commodityDao.updateStateById(1,0).toString());
        log.info(commodityDao.selectAll(0,5).toString());
        log.info(commodityDao.deleteById(1).toString());*/
    }

    @Test
    void RepertoryDaoTest(){
        log.info(repertoryDao.insert(new Repertory(50,2)).toString());
        log.info(repertoryDao.selectAll(0,4).toString());
        log.info(repertoryDao.updateNumById(48,2).toString());
        /*log.info(repertoryDao.selectById(1).toString());
        log.info(repertoryDao.deleteById(1).toString());*/
    }

    @Test
    void OrderDaoTest(){
        //log.info(orderDao.insert(new Order(2,4,2)).toString());
        log.info(orderDao.selectAll().toString());
        log.info(orderDao.selectByCid(2).toString());
        log.info(orderDao.selectByUid(4,0,4).toString());
        log.info(orderDao.updateNumById(50,2).toString());
        log.info(orderDao.deleteById(1).toString());
    }

    @Test
    void RecommendDaoTest(){
//        log.info(recommendDao.insert(new Recommend(2,5)).toString());
//        log.info(recommendDao.insert(new Recommend(3,3)).toString());
//        log.info(recommendDao.insert(new Recommend(2,4)).toString());
        log.info(recommendDao.selectAll(0,4).toString());
        log.info(recommendDao.selectByCommodityId(2).toString());
        log.info(recommendDao.selectAll(0,4).toString());
    }
    @Test
    void MerchantTest(){
        merchantDao.insert(new Merchant("name", "image", 1,2));
        merchantDao.updateImageById("_image",1);
        merchantDao.updateNameById("_name",1);
        System.out.println(merchantDao.selectById(1));
        System.out.println(merchantDao.selectByNameLike("_",0,15).toString());
        System.out.println(merchantDao.selectByUid(2).toString());
        merchantDao.updateStateById(0,1);

    }

}
