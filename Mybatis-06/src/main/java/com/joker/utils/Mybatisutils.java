package com.joker.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatisutils {
    private  static SqlSessionFactory sqlSessionFactory = null;
    static{
        try {
            //使用Mybatis第一步：获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //既然有了SqlSessionFactory，就从中获取SqlSession实例
    //sqlSession完全包含了面向数据库执行SQL命令所需的所有方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
