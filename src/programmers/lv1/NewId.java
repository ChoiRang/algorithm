package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/** 신규 아이디 추천 */
public class NewId {
	public String solution(String new_id) {
		int imsi;
		//stage 1
		String answer = new_id.toLowerCase();

		Stage s1 = new Stage();
		String answer2 = s1.stage2(answer);
		String answer3 = s1.stage3(answer2);
		String answer4 = s1.stage4(answer3);
		String answer5 = s1.stage5(answer4);
		String answer6 = s1.stage6(answer5);
		String answer7 = s1.stage7(answer6);
		
		return answer7;
		
	}

	class Stage{
		//알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		public String stage2(String str) {
			int imsi = 0;
			ArrayList<Integer> intArr = new ArrayList<Integer>();
			StringBuffer strCheck = new StringBuffer(str);
			for(int i = 0; i < str.length();i++) {
				imsi = str.charAt(i);
				if(! ( ((imsi >= 95) && (imsi <= 122)) 
						|| ((imsi >= 48) && (imsi <= 57)) 
						|| (imsi == 45) ) 
					) {
					intArr.add(i);
				}
			}
			
			
			strCheck.deleteCharAt(i);
			return strCheck.toString();
		}
		
		//마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		public String stage3(String str) {
			StringBuffer strCheck = new StringBuffer(str);
			for(int i =0; i <str.length()-1; i++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					strCheck.deleteCharAt(i);
				}
			}
			return strCheck.toString();
		}
		
		//마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		public String stage4(String str) {
			int num0 = str.charAt(0);
			int numMax = str.charAt(str.length()-1);
			StringBuffer strCheck = new StringBuffer(str);
			if(num0 == 96)
				strCheck.deleteCharAt(0);
			else if(numMax == 96)
				strCheck.deleteCharAt(str.length());
			
			return strCheck.toString();
		}
		
		//빈 문자열이라면, new_id에 "a"를 대입합니다.
		public String stage5(String str) {
			StringBuffer strCheck = new StringBuffer(str);
			if(str == null)
				strCheck.append("a");
			return strCheck.toString();
		}
		
		//길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		public String stage6(String str) {
			int i = str.length();
			StringBuffer strCheck = new StringBuffer(str);
			if(str.length() > 15) {
					strCheck.delete(15, i);
				if(strCheck.charAt(14) == '.')
					strCheck.deleteCharAt(14);
			}
			return strCheck.toString();
		}
		
		
		//길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		public String stage7(String str) {
			StringBuffer strCheck = new StringBuffer(str);
			if(str.length() < 2 ) {
				for(int i = 0; i <str.length(); i++)
					strCheck.setCharAt(i, 'a');
			}
			return strCheck.toString();
		}
		
	}
}
