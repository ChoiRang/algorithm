package programmers.lv1;
/** 문자열 다루기 기본 */
public class StringBasic {
	public boolean solution(String s) {
		if(!(s.length() == 4 || s.length() == 6)) {
			return false;
		}	
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				System.out.println(i);
				return false;
			}
		}
		return true;
	}
}