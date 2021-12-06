package programmers.lv1;
/**평균 구하기*/
public class ArrayAverage {
	 public double solution(int[] arr) {
		 int total = 0;
		 for(int i =0; i < arr.length; i++) {
			 total += arr[i];
             System.out.println(total);
             System.out.println(arr.length);
		 }
		 double answer = (double)total / arr.length;
     return answer;
	 }
}
