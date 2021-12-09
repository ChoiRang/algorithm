package programmers.lv1;

/**정수 제곱급 판별
 * 1 <= n <= 50000000000000 */
public class SquareRootOfInteger {
	public long solution(long n) {
		long answer = 0;
		double val1 = Math.sqrt(n);
		
		Math.ceil(val1);
		if(Math.ceil(val1) == Math.floor(val1)) {
			answer = (long) Math.pow((val1+1), 2);
		} else {
			answer = -1;
		}
    return answer;
	}
}
