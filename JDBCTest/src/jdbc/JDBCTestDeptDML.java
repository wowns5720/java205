package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTestDeptDML {

	public static void main(String[] args) {
		
		// 연결 객체 : 연결정보를 가진다.
		Connection conn = null;
		// sql을 실행 할 메소드 제공
		Statement stmt = null;
		// executeQuery() 반환타입 -> select의 결과(표)를 담는 객체
		ResultSet rs = null;
		//Statement -> PreparedStatement : 성능 개선
		PreparedStatement pstmt =null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공!");
			
			//2. 연결
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터 베이스 연결 성공 !");
			
			conn.setAutoCommit(false);
			
			System.out.println("부서 정보 입력을 시작합니다.");
			System.out.println("부서 이름을 입력해주세요.");
			String dname1 = sc.nextLine();
			System.out.println("부서 위치를 입력해주세요.");
			String loc1 = sc.nextLine();
			
			//3. sql처리
			//사용자에게 정보를 받아 부서 데이터를 입력하는 프로그램을 만들어보자.
			String sql = "insert into dept01 values (dept01_deptno_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname1);
			pstmt.setString(2, loc1);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("입력되었습니다.");
			}else {
				System.err.println("입력 실패!");
			}
			
			
			stmt = conn.createStatement();
			
			int dno = 10;
			String otype = "deptno";
			String sqlSelect = "select * from dept order by dname";
			
			rs = stmt.executeQuery(sqlSelect);
			
			//rs.next() -> 다음행의 존재 유무 확인
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				System.out.println(deptno);
				String dname = rs.getString("dname");
				System.out.println(dname+"\t");
				String loc = rs.getString("loc");
				System.out.println(loc+"\t");
			}
			////////////////////////////////////////
			// PreparedStatement -> Sql먼저등록 -> 매개변수처럼 ?를 이용해서 나중에 변수를 바인딩
			
			System.out.println("PreparedStatement 사용");
			System.out.println("=====================================");
			
			String sqlSelect2 = "Select * from dept where deptno = ?";
			pstmt = conn.prepareStatement(sqlSelect2);
			// ? 변수에 데이터 바인딩
			pstmt.setInt(1, 10);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				System.out.println(deptno);
				String dname = rs.getString("dname");
				System.out.println(dname+"\t");
				String loc = rs.getString("loc");
				System.out.println(loc+"\t");
			}
			
			
			//트랙젝션 완료
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾지못함!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패 !");
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			
			//4. close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	
		
		
	}

}
