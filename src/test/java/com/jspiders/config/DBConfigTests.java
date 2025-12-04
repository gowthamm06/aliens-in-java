package com.jspiders.config;

import com.jspiders.Config.DBConfig;
import org.hibernate.Session;

public class DBConfigTests
{
    public static void main(String[] args) {
        testDbConnection();
    }
    public static void testDbConnection()
    {
        System.out.println("Testing DB Connection");
        try {
            Session session = DBConfig.getSession();
            session.close();
            DBConfig.shutdown();
            System.out.println("✅ Test DB PASSED");
        }
        catch (Exception ex) {
            System.out.println("❌ Test DB FAILED");
        }
    }
}