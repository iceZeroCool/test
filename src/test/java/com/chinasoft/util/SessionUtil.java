package com.chinasoft.util;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtil {
    private static SqlSessionFactory factory;

    public SessionUtil(){
        super();
    }

    //build the only factory by using Java static singleton model
    public static SqlSessionFactory getSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
        return factory;
    }
}
