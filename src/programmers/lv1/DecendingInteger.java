package programmers.lv1;

import java.util.Arrays;

/** 정수 내림차순으로 배열하기 */
public class DecendingInteger {
	public long solution(long n) {
		long answer = 0;

		
		String str1 = Long.toString(n);
    int[] int1 = new int[str1.length()];
    
    for(int i = 0; i < str1.length(); i++) {
    	int1[i] = str1.charAt(i)-'0';
    }    
    Arrays.sort(int1);


    for(int i =0; i<int1.length;i++) {
    	answer += int1[i]*Math.pow(10, i);
    }
    
    return answer;
	}
}
