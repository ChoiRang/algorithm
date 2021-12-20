package programmers.lv1;
/**하샤드 수*/
public class HarshadNumber {
	public boolean solution(int number) {
		int sumOfDigit = 0;
    String stringNumber = String.valueOf(number);
    
    for(int i = 0; i < stringNumber.length(); i++) {
    	sumOfDigit += stringNumber.charAt(i)-48;
    }
    
    if((number % sumOfDigit) == 0) {
    	return true;
    }
    
    return false;
	}
}
