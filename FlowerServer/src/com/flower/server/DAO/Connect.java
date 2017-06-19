package com.flower.server.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
	// 1. 환경 변수
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	//test server
	// String url = "jdbc:oracle:thin:@192.168.0.201:1521:orcl"; 
	String url = "jdbc:oracle:thin:@orcl.ckjncc7mkeew.ap-northeast-2.rds.amazonaws.com:1521:orcl";
	String user = "scott";
	String pw = "tigertiger";
	
	Connection conn = null;
	StringBuffer sb = new StringBuffer();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Connect() {
		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			// 3. db 접속
			conn = DriverManager.getConnection(url, user, pw);
			if(conn != null){
				//System.out.println("db에 연결되었습니다");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver error");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db access error");
			e.printStackTrace();
		} // try - catch end
			
	} // constructor ends : db access
	
}// class ends
