package programmers.lv1;

public class SumMeasure {
	public int solution(int n) {
		int answer = 0;
		for(int x = 1; x <=n; x++) {
			if(n == 0) {
					answer = 0;
					break;
			}	else if(n==1) {
				answer = 1;
				break;
			} else if(n % x == 0) {
				answer += x;
			}
		}
    return answer;
	}

}
//------------------------------------//