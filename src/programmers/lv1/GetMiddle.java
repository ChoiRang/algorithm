package programmers.lv1;
/**가운데 글자 찾아오기*/
public class GetMiddle {
	public String solution(String string) {
		String answer = "";
		int middleValue;
		if(string.length() % 2 == 1) {
			middleValue = (int)string.length()/2+1;
			answer = string.substring(middleValue-1, middleValue);
			return answer;
		} else {
			middleValue = string.length()/2; 
			answer = (String)string.subSequence(middleValue-1, middleValue+1);
			return answer;
		}
	}
}
