package com.joker;

import com.joker.Dao.UserMapper;
import com.joker.pojo.User;
import com.joker.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test(){
        //第一步:获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);//获取接口的class对象
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(4,"张飞","7890"));

        //增删改提交事务
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"刘备","7890"));

        //增删改提交事务
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        //增删改提交事务
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateUser2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "哪吒");
        map.put("id", 2);
        mapper.updateUser2(map);

        //增删改提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
