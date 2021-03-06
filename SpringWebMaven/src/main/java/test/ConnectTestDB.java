package test;

import java.sql.*;


public class ConnectTestDB {

	public static void main(String[] args) {

		Connection conn;
		Statement stmt;

		try {
			Class.forName("com.mysql.jdbc.Driver");// 드라이버 로딩: DriverManager에 등록
		} catch (ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
		}

		try {
			String jdbcUrl = "jdbc:mysql://pgardendb.ckkvwglaktib.ap-northeast-1.rds.amazonaws.com:3303/pgarden_test";// 사용하는 데이터베이스명을 포함한 url
			String userId = "pgarden";// 사용자계정
			String userPass = "!pgarden1q2w";// 사용자 패스워드

			conn = DriverManager.getConnection(jdbcUrl, userId, userPass);// Connection 객체를 얻어냄

			stmt = conn.createStatement();// Statement 객체를 얻어냄

			System.out.println("제대로 연결되었습니다");// 성공시 화면에 표시됨

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
}
