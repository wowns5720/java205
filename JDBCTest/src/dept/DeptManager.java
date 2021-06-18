package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {

	Scanner sc = new Scanner(System.in);
	private DeptDao dao;
	
	DeptManager(DeptDao dao){
		this.dao = dao;
	}
	
	
	//전체 리스트 출력 메소드
	//DAO 에서 데이터 리스트를 받고 출력 처리
	void deptList() {
		//Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;
	


		try {
			//1. 드라이버 로드
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("드라이버 로드 성공!");
			// 2. 연결
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			List<Dept> list = dao.getDeptList(conn);
			
			System.out.println("부서 정보 리스트");
			System.out.println("------------------------------");
			System.out.println("부서번호 \t 부서이름\t 위치");
			System.out.println("------------------------------");
			
			for(Dept dept : list) {
				System.out.printf("%d \t %s \t %s \n",
						dept.getDeptno(),
						dept.getDname(),
						dept.getLoc());
				
			}
			System.out.println("부서 관리 프로그램");
			System.out.println("------------------------------");
			System.out.println("1. 부서 리스트");
			System.out.println("2. 부서 정보 입력");
			System.out.println("3. 부서 정보 수정");
			System.out.println("4. 부서 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("원하시는 기능의 번호를 입력해주세요.");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num){
			case 1 :
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("데이터베이스 연결 성공!!!");
	}


				
	//데이터 입력
	// 사용자에게 Scanner 클래스로 입력 받아 -> dao insertDept 메소드로 저장
	
	//데이터 수정
	
	//데이터 삭제
	
	
}