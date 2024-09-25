package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String DB_ID = "java";
	private static final String DB_PW = "oracle";
	
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("학사 정보 시스템 입니다.");
			System.out.println("1. 조회 | 2. 수정 (종료:q) ");
			String msg = scan.nextLine();
			if (msg.equals("q")) {
				System.out.println("학사 정보 시스템 종료");
				break;
			}
			int sel = Integer.parseInt(msg);
			if (sel == 1) {
				// 학생의 정보 출력
				System.out.println("조회할 학번을 입력해주세요: ");
				String number = scan.nextLine();
				select_info(number);
			} else if (sel == 2) {
				// 이름 변경
				System.out.println("수정할 학번을 입력해주세요: ");
				String number = scan.nextLine();
				
				System.out.println("새로운 이름을 입력하세요: ");
				String name = scan.nextLine();
				
				update_info(number, name);
				
			} else {
				System.out.println("다시 입력!");
			}
		}
	}
	
	public static void select_info(String number) {
		// db와 연결
		Connection conn = null;
		
		// sql 명령
		PreparedStatement ps = null;
		
		// 쿼리 실행 결과
		ResultSet rs = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("등록 실패");
			e.printStackTrace();
			System.exit(0);  // 프로그램 종료
		}
		
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
//			System.out.println("접속 성공");
			
			StringBuffer query = new StringBuffer();
			query.append("select 이름, 전공, nvl(평점, 0) from 학생 where 학번 = ?");
			
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, number);
			rs = ps.executeQuery();  // 쿼리문 실행
			
			while(rs.next()) {
				String nm = rs.getString("이름");
				String major = rs.getString("전공");
				String grade = rs.getString("NVL(평점,0)");
				System.out.println("이름:" + nm + " 전공:" + major + " 평점:" + grade);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체를 꼭 닫아야함.
			// 안닫으면 계속 쌓여서 에러 발생
			if (rs != null) { try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (ps != null) { try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
	}
	
	public static void update_info(String number, String name) {
		// db와 연결
		Connection conn = null;
		
		// sql 명령
		PreparedStatement ps = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("등록 실패");
			e.printStackTrace();
			System.exit(0);  // 프로그램 종료
		}
		
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
//			System.out.println("접속 성공");
			
			StringBuffer query = new StringBuffer();
			query.append("update 학생 set 이름 = ? where 학번 = ?");
//			System.out.println(query);
			
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, name);
			ps.setString(2, number);
			
			int cnt = ps.executeUpdate();
			if (cnt > 0) {
				System.out.println("정보가 성공적으로 업데이트 되었습니다.");
			} else {
				System.out.println("대상건이 없음.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// connection 객체를 꼭 닫아야함.
			// 안닫으면 계속 쌓여서 에러 발생
			if (ps != null) { try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
	}
}
