package programmers.lv1;

/**소수 찾기*/
public class FindPrimeNumber {
	public int solution(int n) {
//		List<Integer> sqrtToPrimeArr = new CopyOnWriteArrayList<Integer>();
		double sqrt = Math.sqrt(n);
		int sqPrime = (int)Math.floor(sqrt);
		System.out.println(sqPrime);
		
		return 5;
	}
}

	
		/**효울성 실패함? 에라토스테네스의 체 version*/
//	HashSet<Integer> hsInt = new HashSet<Integer>();
//	
//	for(int i = 2; i <= n; i++) {
//		hsInt.add(i);
//	}
//	
//	//값이 들어있으면 true, 안들어 있으면 반복문으로 복귀
//	for(int i = 2; i <= n; i++) {
//		if(hsInt.contains(i) == false) {
//			continue;
//		}
//		for(int j = 2*i; j<=n; j+=i) {
//			hsInt.remove(j);
//		}
//	}
//	return hsInt.size();
//}
//
//public boolean primeCheck(int number) {
//	for(int i = 2; i < number; i++) {
//		if(number % i ==0) {
//			return false;
//		}
//	}
//	return true;
//}