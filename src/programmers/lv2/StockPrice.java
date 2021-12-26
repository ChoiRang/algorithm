package programmers.lv2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
	public int[] solution(int[] prices) {
		Queue<Integer> quePrice = new LinkedList<>();
		ArrayList<Integer> stockTime = new ArrayList<>();
		int[] answer = new int[prices.length];
		int comparePrice = 0;
    
    int price = 0;
    int time = 0;
    for(int stockPrice : prices) {
    	quePrice.add(stockPrice);
    }

    while(true) {
    	time = 0;
    	price = quePrice.peek();
    	quePrice.poll();
    	
    	if(quePrice.isEmpty()) {
    		stockTime.add(0);
    		break;
    	}
    	
    	Iterator<Integer> check = quePrice.iterator();	
    	while(check.hasNext()==true) {
    		time++;
    		comparePrice = check.next();
    		if(price > comparePrice) {
    			break;
    		}
    	}
    	stockTime.add(time);
    }
    
    for(int i = 0; i < stockTime.size(); i++) {
    	answer[i] = stockTime.get(i);
    }
    
    return answer;
	}
}
