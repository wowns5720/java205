package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestEMP {

	public static void main(String[] args) {
		
		// 연결 객체 : 연결정보를 가진다.
		Connection conn = null;
		// sql을 실행 할 메소드 제공
		Statement stmt = null;
		// executeQuery() 반환타입 -> select의 결과(표)를 담는 객체
		ResultSet rs = null;
		//Statement -> PreparedStatement : 성능 개선
		PreparedStatement pstmt =null;
		
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
			
			//3. sql처리
			//사원번호, 사원이름, 지급, sal, 부서이름, 부서위치
			
			//1. Statement
			stmt = conn.createStatement();
			//2. sql 작성
			String sql = "select\r\n" + 
					"e.empno, e.ename, e.job, e.sal, d.dname, d.loc\r\n" + 
					"from emp e; dept d where e.deptno = d.deptno ";
			//3. Resultset 객체로 데이터 받기
			rs = stmt.executeQuery(sql);
			
			//4. 출력
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "\t"+rs.getString(2));
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
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾지못함!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패 !");
			e.printStackTrace();
			
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
