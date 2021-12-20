package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

/** 신규 아이디 추천 */
public class NewId {
	public String solution(String new_id) {
		//stage 1
		String answer = new_id.toLowerCase();

		String answer2 = stage2(answer);
		String answer3 = stage3(answer2);
		String answer4 = stage4(answer3);
		String answer5 = stage5(answer4);
		String answer6 = stage6(answer5);
		String answer7 = stage7(answer6);
		
		return answer7;
		
	}


	//알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	public String stage2(String str) {
		int checkChar = 0;
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		StringBuffer strCheck = new StringBuffer(str);
		for(int i = 0; i < str.length();i++) {
			checkChar = str.charAt(i);
			if(! ( ((checkChar >= 95) && (checkChar <= 122)) 
					|| ((checkChar >= 48) && (checkChar <= 57)) 
					|| (checkChar == 46)
					|| (checkChar == 45) ) 
					) {
				intArr.add(i);
			}
		}
		
		Collections.reverse(intArr);
		for(int i =0; i < intArr.size(); i++) {
			strCheck.deleteCharAt(intArr.get(i));
		}
		
		return strCheck.toString();
	}
	
	//마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	public String stage3(String str) {
		int strLength = str.length();
		StringBuffer strCheck = new StringBuffer(str);
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		for(int i =0; i < strLength-1; i++) {
			if((str.charAt(i) == 46)
					&& (str.charAt(i+1) == 46)
					) {
				intArr.add(i);
			}
		}
		
		Collections.reverse(intArr);
		for(int i =0; i < intArr.size(); i++) {
			strCheck.deleteCharAt(intArr.get(i));
		}
		return strCheck.toString();
	}
	
	//마침표(.) = 46 가 처음이나 끝에 위치한다면 제거합니다.
	public String stage4(String str) {
		StringBuffer strCheck = new StringBuffer(str);
		if(str.charAt(str.length()-1) == 46) {
			strCheck.deleteCharAt(str.length()-1);
		}
		//error in here
		if(str.charAt(0) == 46) {
			if(str.length() == 1) {
				str = "";
				return str;
			} else {
				strCheck.deleteCharAt(0);
			}
		}
		return strCheck.toString();
	}
	
	//빈 문자열이라면, new_id에 "a"를 대입합니다.
	public String stage5(String str) {
		StringBuffer strCheck = new StringBuffer(str);
		if(str.length() == 0) {
			strCheck.append("a");
		}
		return strCheck.toString();
	}
	
	//길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	//만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	public String stage6(String str) {
		int i = str.length();
		StringBuffer strCheck = new StringBuffer(str);
		if(str.length() > 15) {
			strCheck.delete(15, i);
			if(strCheck.charAt(14) == 46)
				strCheck.deleteCharAt(14);
		}
		return strCheck.toString();
	}
	
	
	//길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	public String stage7(String str) {
		if(str.length() < 3) {
			for(int i = str.length(); i < 3; i++) {
				str += str.charAt(str.length()-1);
			}
		}
		return str;
	}

}
