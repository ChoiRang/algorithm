package programmers.lv1;
/**x만큼 간격이 있는 n개의 숫자*/
public class XdistanceNumbers {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0; i < n ; i++) {
			answer[i] = ((long)x * (i+1));
			System.out.println(i + ", "+ answer[i]);
		}
		return answer;
	}
}

//    long[] answer = new long[n];
//    int intSumX = x;
//    long longNum = 0;
//    boolean check = true;
//    
//    Integer intNumber = x;
//    long longX = intNumber.longValue();	// x long
//    
//    for(int i =0; i < answer.length; i++) {
//    	if((i < 2147483647) || (i> -2147483648)) {
//    		answer[i] = intSumX;
//    		intSumX += x;	//x씩 증감
//    	} else {
//    		if(check == true) {		//한번만?
//    			Integer intNumber2 = intSumX;		//wrapping total
//    			Long longNumber2 = intNumber2.longValue();	//make long type
//    			longNum = longNumber2;	//insert longValue in longNum
//    			check = false;
//    		}
//    		longNum += (long)longX;
//    		answer[i] = longNum;
//    	}
//    	
//    }
//    return answer;