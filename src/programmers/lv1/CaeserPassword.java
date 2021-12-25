package programmers.lv1;
/**시저 암호
 * 1 <=n <= 25*/
public class CaeserPassword {
	public String solution(String s, int n) {
    String answer = "";

    for(int i = 0 ; i < s.length(); i++) {
    	answer += caeser(s.charAt(i), n);
    }
    return answer;
	}
	
	public char caeser(int ascii, int push) {
		int check = ascii + push;
		char answerChar = 32;
		
		if(ascii == 32) {
			return answerChar;
		}
		if(ascii > 64 && ascii < 91) {	//대문자
			if(check > 90) {
				answerChar = (char)(ascii-26+push);
			} else {
				answerChar = (char)check;
			}
		} else if(ascii > 96 && ascii < 123){	//소문자
			if(check > 122) {
				answerChar = (char)(ascii-26+push);
			} else {
				answerChar = (char)check;
			}
		}
		return answerChar;
	}
}
//		if(check > 90 && check < 97) {
//			number = check - 90;
//			lastNumber = 96 + number;
//			answerChar = (char)lastNumber;
//		} else if(check > 122) {
//			number = check - 122;
//			lastNumber = 64 + number;
//			answerChar = (char)lastNumber;
//		} else {
//			answerChar = (char)check;
//		}