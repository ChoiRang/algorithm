package programmers.lv1;

import java.util.ArrayList;

/**같은 숫자는 싫어*/
public class NonOverlapNumber {
	public ArrayList<Integer> solution(int []value) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(value[0]);
    
    for(int i =0; i<(value.length-1);i++) {
    	int j = i+1;
    	if(value[i] == value[j]) {
    		j++;
    	} else if(value[i] != value[j]) {
    		arrayList.add(value[j]);
    	}
    	j = i+1;
    }	
    return arrayList;
	}
}
