package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		
		DeptManager manager = new DeptManager(DeptDao.getInstance());
		
		Connection conn = null;

		// 1. 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("드라이버 로드 성공!");

			// 2. 연결
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터베이스 연결 성공!!!");

			DeptDao dao = new DeptDao();

			
			/*List<Dept> list = dao.getDeptList(conn);
			
			for(Dept dept : list) {
				System.out.println(dept);
			}
			*/
			
			Scanner sc = new Scanner(System.in);
			
			/*System.out.println("부서입력을 시작합니다.");
			System.out.println("부서번호 부서이름 부서위치 순으로 입력해주세요.");
			System.out.println("예) 50 dev seoul");
			String deptData = sc.nextLine();
			String[] deptDatas = deptData.split(" ");
			
			// Dept 객체 생성 -> Dao 메소드 호출
			Dept dept = new Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);
			
			int result = dao.insertDept(conn, dept);
			if(result>0) {
				System.out.println("입력 성공!");
			} else {
				System.out.println("입력 실패!");
			}*/
			
//			System.out.println("부서수정을 시작합니다.");
//			System.out.println("수정하고자하는 부서번호 새부서이름 새부서위치 순으로 입력해주세요.");
//			System.out.println("예) 50 dev seoul");
//			String deptData = sc.nextLine();
//			String[] deptDatas = deptData.split(" ");
			
			// Dept 객체 생성 -> Dao 메소드 호출
//			Dept dept = new Dept(Integer.parseInt(deptDatas[0]), deptDatas[1], deptDatas[2]);
//			
//			int result = dao.editDept(conn, dept);
//			if(result>0) {
//				System.out.println("수정 성공!");
//			} else {
//				System.out.println("수정 실패!");
//			}
			System.out.println("부서 정보를 삭제 합니다.");
			System.out.println("삭제할 부서번호를 입력해주세요.");
			String deptno = sc.nextLine();
			int result = dao.deleteDept(conn, Integer.parseInt(deptno));
			
			if(result>0) {
				System.out.println("삭제 완료!");
			}else {
				System.out.println("삭제 실패 : 해당 번호의 부서가 존재하지 않습니다.");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}