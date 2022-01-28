package com.thymeleaf;

import com.alibaba.druid.util.JdbcUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;


public class JDBCUtils {
    public static Connection getConnection() throws Exception {
        // 1.读取配置文件中的4个基本信息
        ClassLoader is = JdbcUtils.class.getClassLoader();
            URL resource = is.getResource("jdbc.properties");
            String path = resource.getPath();
            Properties pros = new Properties();
            pros.load(new FileReader(path));
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClass");

            // 2.加载驱动
            Class.forName(driverClass);

            // 3.获取连接
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
    }



    public static void closeResource (Connection conn, Statement ps){
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeResource (Connection conn, Statement ps, ResultSet rs){
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}