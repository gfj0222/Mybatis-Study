package com.joker.dao;

import com.joker.pojo.User;
import com.joker.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.net.SocketTimeoutException;

import static org.junit.Assert.*;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = Mybatisutils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("===============================");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);






        sqlSession.close();
    }

}