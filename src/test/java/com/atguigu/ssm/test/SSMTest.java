package com.atguigu.ssm.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author jtqstart
 * @create 2022-06-30 12:46
 */
@SpringJUnitConfig(locations = {"classpath:spring-persist.xml"})
public class SSMTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testCon() throws SQLException {
        Connection connection = dataSource.getConnection();
       // System.out.println("connection = " + connection);
    }


}
