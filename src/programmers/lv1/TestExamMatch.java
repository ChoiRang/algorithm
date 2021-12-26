package programmers.lv1;

import java.util.ArrayList;
/**모의 고사*/
public class TestExamMatch {
	public int[] solution(int[] answers) {
		ArrayList<Integer> listArr = new ArrayList<Integer>();
		
    int[] scores = {0, 0, 0};
    int[] person1 =	{1, 2, 3, 4, 5};
    int[] person2 =	{2, 1, 2, 3, 2, 4, 2, 5};
    int[] person3 =	{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    
    for(int i = 0; i < answers.length; i++){
    	if(person1[i % person1.length] == answers[i]) {
    		scores[0]++;
    	}
    	if(person2[i % person2.length] == answers[i]) {
    		scores[1]++;
    	}
    	if(person3[i % person3.length] == answers[i]) {
    		scores[2]++;
    	}
    }
    
    int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);
    if(max == scores[0]) {
    	listArr.add(1);
    }
    if(max == scores[1]) {
    	listArr.add(2);
    }
    if(max == scores[2]) {
    	listArr.add(3);
    }
    
    int[] answer = new int[listArr.size()];
    for(int i = 0; i < listArr.size(); i++) {
    	answer[i] = listArr.get(i);
    }
    
    return answer;
	}
}
