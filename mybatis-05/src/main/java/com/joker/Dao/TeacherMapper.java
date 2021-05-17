package com.joker.Dao;

import com.joker.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获取老师
    List<Teacher> getTeacher();

    //获取指定老师下的学生及老师的学生
    Teacher getTeacher(@Param("tid") int id);
}
