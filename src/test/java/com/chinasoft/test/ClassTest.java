package com.chinasoft.test;

import com.chinasoft.mapper.ClassMapper;
import com.chinasoft.pojo.Student_u;
import com.chinasoft.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassTest {
    public SqlSessionFactory factory = SessionUtil.getSession();

    public ClassTest() throws IOException {
    }

    public void selectOneClassAllStudent(){
        SqlSession session=factory.openSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        List<Student_u> list = mapper.SelectOneClassAllStudent();

        for (Student_u student:list){
            System.out.println();
        }
        session.close();
    }
}
