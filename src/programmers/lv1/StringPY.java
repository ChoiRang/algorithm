package programmers.lv1;

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
//-------------------
//실패잇음, 다시보니 크기가 같음
//String ss1 = s.replaceAll("p", "");
//String ss2 = s.replaceAll("y", "");
//System.out.println(ss1);
//System.out.println(ss2);
//if(ss1.length() == ss2.length()) {
//	return true;
//}
//return false;