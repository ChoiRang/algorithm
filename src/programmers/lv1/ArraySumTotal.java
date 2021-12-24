package programmers.lv1;

import java.util.Arrays;

/**예산*/
public class ArraySumTotal {
	public int solution(int[] d, int budget) {
    int answer = 0;
    int result = 0;
    Arrays.sort(d);
    
    for(int number : d) {
    	answer += number;
    	result++;
    	if(answer == budget) {
    		break;
    	} else if(answer >= budget) {
    		result--;
    		break;
    	}
    }
    
    
    return result;
	}
}
