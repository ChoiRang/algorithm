package programmers.lv1;
/**2016년*/
public class Year2016 {
	public String solution(int a, int b) {
    String answer = "";
    int[] lastDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int totalDay = 0;
    //1월 1일 금요일
    int month = a-1;
    for(int i = 0; i < lastDay.length; i++) {
    	totalDay += lastDay[i];
    	if(month == i) {
    		totalDay += (b-lastDay[i]);
    		break;
    	}
    }
    
    int day = totalDay % 7;
    switch (day) {
		case 1 : answer = "FRI";
			break;
		case 2 : answer = "SAT";
			break;
		case 3 : answer = "SUN";
			break;
		case 4 : answer = "MON";
			break;
		case 5 : answer = "TUE";
			break;
		case 6 : answer = "WED";
			break;
		case 0 : answer = "THU";
			break;
		}
    
    return answer;
	}
}
