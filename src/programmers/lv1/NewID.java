package programmers.lv1;

public class NewID {
	public String solution(String new_id) {
		int imsi;
		String answer = new_id;
		StringBuilder strCheck = new StringBuilder(answer);
		
		for(int i =0; i < new_id.length(); i++) {
			imsi = new_id.charAt(i);
			if((imsi >= 65) && (imsi <= 90)) {
				imsi += (imsi +32);
				strCheck.setCharAt(i, (char) imsi);
			}
			
		}
		
    return answer;
	}
}
