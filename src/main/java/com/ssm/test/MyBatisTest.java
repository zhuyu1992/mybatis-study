package com.ssm.test;

import com.ssm.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @auther: zzzgyu
 */

public class MyBatisTest {
    @Test
    public void findCustomerByIdTest() throws Exception {
        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream =
                Resources.getResourceAsStream(resource);
        // 2、根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        // 3、通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
        User user = sqlSession.selectOne("resources.com.ssm.mapper"
                + ".UserMapper.findUserById", 1);
        // 打印输出结果
        System.out.println(user.toString());
        // 5、关闭SqlSession
        sqlSession.close();
    }
}
