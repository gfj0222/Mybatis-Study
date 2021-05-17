package joker.Dao;

import com.joker.utils.Mybatisutils;
import joker.pojo.Student;
import joker.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.net.SocketTimeoutException;
import java.util.List;

import static org.junit.Assert.*;

public class TeacherMapperTest {

    @Test
    public void getTeacher() {
        SqlSession sqlSession = Mybatisutils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }


}
