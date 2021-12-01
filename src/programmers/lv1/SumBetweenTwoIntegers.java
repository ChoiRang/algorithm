package programmers.lv1;
/** 두 정수 사이의 합*/
public class SumBetweenTwoIntegers {
    public long solution(int a, int b) {
    	long answer = 0;	//더한 값이 커지므로 long 형으로 해야함
      if( a < b){
      	for(int i = a; i <= b; i++){
      		answer +=i;
      	}
      } else if(a > b){      
      	for(int i = b; i <= a; i++){
      		answer +=i; 
      	}
      } else{
      	answer = a;
      }
      return answer;
    }//end class
}