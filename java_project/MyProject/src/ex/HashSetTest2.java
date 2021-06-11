package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {

		//hashSet 저장공간 생성 :
		//인스턴스 저장,
		//중복 저장을 허용하지 않는다.
		//저장 순서를 저장하지 않는다.
		
//		HashSet<String> hashset = new HashSet<String>();
		Set<SimpleNumber> hashset = new HashSet<>();

		
		// 데이터 저장 
		hashset.add("");
		
		// 데이터의 일괄 처리
		Iterator<SimpleNumber> itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	class SimpleNumber{
		
		int num;
		
		SimpleNumber(int num){
			this.num = num;
		}
		public String toString() {
			return String.valueOf(num);
		}
	}
		
}
