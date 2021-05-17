package joker.Dao;

import com.joker.utils.Mybatisutils;
import joker.pojo.Student;
import joker.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest {

    @Test
    public void getStudent() {
        SqlSession sqlSession = Mybatisutils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }


    @Test
    public void getStudent2() {
        SqlSession sqlSession = Mybatisutils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}