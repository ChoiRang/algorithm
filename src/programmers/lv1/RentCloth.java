package programmers.lv1;

import java.util.Arrays;

/**체육복*/
public class RentCloth {
	public int solution(int n, int[] lost, int[] reserve) {
    int countStudent = n - lost.length;
    Arrays.sort(lost);
    Arrays.sort(reserve);
    
    /**중복 검사*/
    for(int x = 0; x < lost.length; x++) {
    	for(int y  = 0; y < reserve.length; y++) {
    		if(lost[x] == reserve[y]) {
    			lost[x] = -1;
    			reserve[y] = -1;
    			countStudent++;	//여분의 잃어버린 사람
    			break;
    		}
    	}
    }
    
    for(int x = 0; x < lost.length; x++) {
    	for(int y  = 0; y < reserve.length; y++) {
    		if(lost[x] == reserve[y]-1 || lost[x] == reserve[y]+1) {
    			System.out.println(x + "," + y);
    			reserve[y] = -1;
    			countStudent++;
    			break;
    		}
    	}
    }
    return countStudent;
	}
}
