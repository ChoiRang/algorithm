package programmers.lv1;

/**자릿수 더하기*/
public class AddEachPlaceValue {
	public int solution(int n) {
    int answer = 0;
    String value = String.valueOf(n);
    for(int i=0; i < value.length(); i++) {
    	answer += Character.getNumericValue(value.charAt(i));
    }
    
    return answer;
	}
}
