package com.joker.Dao;

import com.joker.pojo.User;
import com.joker.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 3);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

    }


    @Test
    public void getUser() {
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
    logger.info("info:进入了testLog4j");
    logger.debug("debugL:进入了testLog4j");
    logger.error("error:进入了testLog4j");
    }

}