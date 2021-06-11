package ex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		//hashSet 저장공간 생성 :
		//인스턴스 저장,
		//중복 저장을 허용하지 않는다.
		//저장 순서를 저장하지 않는다.
		
//		HashSet<String> hashset = new HashSet<String>();
		HashSet<Integer> hashset = new HashSet<Integer>();

		
		// 데이터 저장 
//		hashset.add("First");
//		hashset.add("Second");
//		hashset.add("Third");
//		hashset.add("First");
		hashset.add(1);
		hashset.add(2);
		hashset.add(3);
		hashset.add(1);
		
		
		// 데이터의 일괄 처리
		Iterator<Integer> itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
