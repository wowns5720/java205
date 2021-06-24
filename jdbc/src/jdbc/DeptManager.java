package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {
	
	private DeptDao dao;
	private Scanner sc;
	
	public DeptManager(DeptDao dao){
		this.dao = dao;
		sc = new Scanner(System.in);
	}
	
	// ��ü ����Ʈ ��� �޼ҵ�
	// DAO ���� ������ ����Ʈ�� �ް� ��� ó��
	void deptList() {
		// Connection ��ü ���� -> Ʈ������ ó�� ����
		Connection conn = null;
		
		// 2. ����
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			List<Dept> list = dao.getdeptList(conn);
			
			System.out.println("�μ� ���� ����Ʈ");
			System.out.println("------------------------------------");
			System.out.println("�μ���ȣ \t �μ��̸� \t ��ġ");
			System.out.println("------------------------------------");
			
			for(Dept dept : list) {
				System.out.printf("%d \t %s \t %s \n", 
									dept.getDeptno(), 
									dept.getDname(), 
									dept.getLoc());
			}
			System.out.println("------------------------------------");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����ͺ��̽� ���� ����!!!");
	}
	
	// ������ �Է�
	// ����ڿ���Scanner Ŭ���� �Է� �޾� ���� -> dao insertDept �޼ҵ�� ����
	void inputData() {
		
		// Connection ��ü ���� -> Ʈ������ ó�� ����
		Connection conn = null;

		// 2. ����
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("�μ� ������ �Է��մϴ�.");
			System.out.println("�μ��̸� �μ���ġ �������� �Է����ּ���.");
			System.out.println("����) 10 dev seoul");
			String inputData = sc.nextLine();
			String[] deptData = inputData.split(" ");
			
			Dept dept = new Dept(0, deptData[0], deptData[1]);
			
			int result = dao.insertDept(conn, dept);
			
			if(result > 0) {
				System.out.println("�ԷµǾ����ϴ�.");
			} else {
				System.out.println("�Է� ����!!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ������ ����
	// ����ڷκ��� �����͸� �޾� ���� -> dao editDept()�޼ҵ� �̿�
	void editDept() {
		
		// Connection ��ü ���� -> Ʈ������ ó�� ����
		Connection conn = null;

		// 2. ����
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("�μ� ������ �����մϴ�.");
			System.out.println("�μ���ȣ �μ��̸� �μ���ġ    �������� �Է����ּ���.");
			System.out.println("�Էµ� �μ���ȣ�� �μ��̸��� �μ���ġ�� ����");
			String editData = sc.nextLine();
			String[] eData = editData.split(" ");
			
			Dept dept = new Dept(Integer.parseInt(eData[0]), eData[1], eData[2]);
			
			int result = dao.updateDept(conn, dept);
			
			if(result > 0) {
				System.out.println("�����Ǿ����ϴ�.");
			} else {
				System.out.println("��������!!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ������ ����
	// ����ڷ� ���� �μ���ȣ�� �Է¹޾� �μ������� ����
	void delDept() {
		
		// Connection ��ü ���� -> Ʈ������ ó�� ����
		Connection conn = null;

		// 2. ����
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			deptList();
			System.out.println("������ ���Ͻô� �μ���ȣ�� �Է����ּ���.");
			int deptno = Integer.parseInt(sc.nextLine());
			
			int result = dao.deleteDept(conn, deptno);
			
			if(result > 0) {
				System.out.println("�����Ǿ����ϴ�.");
			} else {
				System.out.println("��������! �ش� �μ��� ������ �����ϴ�.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}