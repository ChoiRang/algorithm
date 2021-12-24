package programmers.lv1;

/**소수 찾기*/
public class FindPrimeNumber {
	public int solution(int n) {
		int answer = 0;
		double sqrt = Math.sqrt(n);
	
		boolean[] blArr = new boolean[n+1];
		blArr[0]=false;
		blArr[1]=false;
		
		for(int i = 2; i <= n; i++) {
			blArr[i] = true;
		}
		
		for(int i = 2; i <= sqrt; i++) {
			if(blArr[i]==true) {
				for(int j = i * i; j <= n; j+=i) {
					blArr[j] = false;
				}
			}
		}
		
		for(boolean find :blArr) {
			if(find == true) {
				answer++;
			}
		}
		return answer;
	}
}
//자료 구조상 배열이 제일 빠름(크기가 정해져 있을 경우)
//자연수는 소수이거나 아니거나 둘 중 하나의 경우밖에 없으므로
//true false 가 정신건강에 이롭습니다 
	
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