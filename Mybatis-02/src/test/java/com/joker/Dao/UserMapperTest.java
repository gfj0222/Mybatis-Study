package com.joker.Dao;

import com.joker.pojo.User;
import com.joker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void addUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}