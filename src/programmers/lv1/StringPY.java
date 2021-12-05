package programmers.lv1;
/**문자열 내 p와 y의 개수*/
public class StringPY {
	boolean solution(String value) {
		String lowerValue = value.toLowerCase();
		
		if(checkLength(lowerValue, "p") == checkLength(lowerValue, "y")){
			return true;
		}
    return false;
	}
	
	/** 문자 길이 체크(문자열, "삭제할거")*/
	public int checkLength(String inputString, String deleteOfIndex ) {
		return inputString.replace(deleteOfIndex, "").length();
	}
}
//-------------------\