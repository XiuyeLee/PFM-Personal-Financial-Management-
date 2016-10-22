package com.pfm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLiteTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("org.sqlite.JDBC");

		Connection conn = DriverManager.getConnection("jdbc:sqlite:pfm.db");
		Statement stmt = conn.createStatement();
//		int rows = stmt.executeUpdate("INSERT INTO test (uuid,name) values('"+UUID.randomUUID().toString().replaceAll("-", "")+"','xiuye')");
//		System.out.println(rows);
		ResultSet rs = stmt.executeQuery("select uuid,name from test");
		while(rs.next()){
			System.out.println("uuid:"+rs.getString(1)+" name:"+rs.getString(2));
		}
		//删除表
//		stmt.execute("drop table CONSUMPTION_PURCHASE");
		//获得所有sqlite的数据表名
		rs = stmt.executeQuery("select name from sqlite_master where type='table' order by name");
		while(rs.next()){
			System.out.println("name := "+rs.getString(1));
		}

	}

}
