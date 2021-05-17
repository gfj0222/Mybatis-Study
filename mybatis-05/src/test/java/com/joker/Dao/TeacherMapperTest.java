package com.joker.Dao;

import com.joker.pojo.Teacher;
import com.joker.utils.Mybatisutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TeacherMapperTest {

    @Test
    public void getTeacher() {
        SqlSession sqlSession = Mybatisutils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher mapperTeacher = mapper.getTeacher(1);
        System.out.println(mapperTeacher);
        sqlSession.close();
    }
}