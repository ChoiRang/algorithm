package programmers.lv1;
/** 서울에서 김서방 찾기 */
public class FindMrKim {
	public String solution(String[] seoul) {
		int no = 0;
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {						
				no = i;																
			}
		}
		return "김서방은 " + Integer.toString(no) +"에 있다";
	}
}
//seoul[i] == "Kim" 안됨, String은 클래스
//클래스는 주소로 비교되기 때문에 == 안됨


//	public String solution(String[] seoul) {
//		int no = 0;
//		for(String i : seoul) {
//			if(i.equals("Kim")) {						
//				break;																
//			} no ++;																						
//		}
//	return "김서방은 " + no +"에 있다";
//	}

