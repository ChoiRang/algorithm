package programmers.lv1;

import java.util.Arrays;
/**K번째 수*/
public class Kth_Number {

	public int[] solution(int[] array, int[][] commands) {
    int count;
    int startValue;
    int lastValue;
    int arraySize = commands.length;
    int[] answer = new int[arraySize];

    for(int dim1 = 0; dim1 < commands.length; dim1++) {
    	count = 0;
    	startValue = commands[dim1][0];
    	lastValue = commands[dim1][1];
    	int[] extractedValue = new int[lastValue - startValue + 1];
    	
    	for(int start = startValue - 1; start < lastValue; start++) {
				extractedValue[count++] = array[start];
    	}
    	Arrays.sort(extractedValue);
    	answer[dim1] = extractedValue[commands[dim1][2]-1];
    }
    return answer;
	}
	
}
