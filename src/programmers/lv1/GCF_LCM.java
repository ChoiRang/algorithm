package programmers.lv1;

/**최대공약수 최소공배수
 * 유클리드 호제법 참고!*/
public class GCF_LCM {
	public int[] solution(int n, int m) {
    int[] answer = {gcf(n,m), lcm(n,m,gcf(n,m))};
    
    return answer;
	}
	
	/**최대 공약수*/
	public int gcf(int a, int b) {
		while(b != 0) {
			int val1 = a % b;
			a=	b;
			b= val1;
		}
		return a;
	}
	
	/**최소 공배수*/
	public int lcm(int n, int m, int gcf) {
		return n*m/gcf;
	}
}

//	/**최대 공약수*/
//	public int gcf(int n, int m) {
//		ArrayList<Integer> sumValue = new ArrayList<Integer>();
//		
//		ArrayList<Integer> a = getDivisor(n);
//		ArrayList<Integer> b = getDivisor(m);
//		
//		for(int i : a) {
//			for(int j : b) {
//				if(i == j) {
//					sumValue.add(i);
//				}
//			}
//		}
//		return sumValue.get(sumValue.size()-1);
//	}
//	
//	/**약수 구하기*/
//	public ArrayList<Integer> getDivisor(int n) {
//		ArrayList<Integer> value = new ArrayList<Integer>();
//		for(int i = 1; i <= n; i++) {
//			if( n % i ==0) {
//				value.add(i);
//			}
//		}
//		return value;
//	}