package com.chinasoft.test;

import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Student_u;
import com.chinasoft.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StudentTest {
    public SqlSessionFactory factory = SessionUtil.getSession();

    public StudentTest() throws IOException {
    }

    @Test
    public void selectAllStudent(){
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student_u> students = mapper.SelectAllStudent();
        for (Student_u student:students){
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void selectOneAll(){
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student_u student = mapper.SelectOneAll(2);
        System.out.println(student);
        session.close();
    }

    @Test
    public void selectClassAll(){
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student_u> students = mapper.SelectClassAll(1);
        for (Student_u student:students){
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void selectNotNullNameAuto(){
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student_u students = mapper.SelectNotNullNameAuto(1);
//        for (Student_u student:students){
//            System.out.println(student);
//        }
        System.out.println(students);
        session.close();
    }
}
