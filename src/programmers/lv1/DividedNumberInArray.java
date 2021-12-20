package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

/**나누어 떨어지는 숫자 배열(오름차순) -> 1*/
public class DividedNumberInArray {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> countArr = new ArrayList<Integer>();
		int[] answer;
		
    for(int number : arr) {
    	if((number % divisor) == 0) {
    		countArr.add(number);
    	}
    }
    
    if(countArr.size() != 0) {
    	answer = new int[countArr.size()];
    	for(int i = 0; i < countArr.size(); i++) {
      	answer[i] = (int) countArr.get(i);
      }
      Arrays.sort(answer);
    } else {
    	answer = new int[1];
    	answer[0] = -1;
    	return answer;
    }
    
    return answer;
	}
}
