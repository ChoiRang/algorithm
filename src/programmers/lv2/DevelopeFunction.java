package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopeFunction {
	public int[] solution(int[] progresses, int[] speeds) {
		int progress = 0;
		int speed = 0;
		int count = 0;

    Queue<Integer> days = new LinkedList<>();
    List<Integer> distributionDay = new ArrayList<Integer>();
    
    for(int i = 0; i < progresses.length; i++) {
    	progress = progresses[i];
    	speed = speeds[i];
    	while(progress < 100) {
    		progress += speed;
    		count++;
    	}
    	days.add(count);
    	count = 0;
    }

    while(!days.isEmpty()) {
    	int day = days.peek();
    	days.poll();
    	int nextDay = 0;
    	count = 0;
    	
    	while(true) {
    		if(days.isEmpty()) {
    			count++;
    			break;
    		}
    		nextDay = days.peek();
    		if(day >= nextDay) {
    			count++;
    			days.poll();
    		} else if(day < nextDay) {
    			count++;
    			break;
    		}
    	}
    	distributionDay.add(count);
    }
    
    int[] answer = new int[distributionDay.size()];
    for(int i = 0; i < distributionDay.size(); i++) {
    	answer[i] = distributionDay.get(i);
    }
    
    
    return answer;
	}
}
