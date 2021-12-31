package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;
/**다리를 지나는 트럭*/
public class TruckThroughBridge {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
    int time = 0;
    int bridgeTotalWeight = 0;
    Queue<Integer> waitTruck = new LinkedList<Integer>(); 
    Queue<Integer> bridge = new LinkedList<Integer>(); 
    
    
    for(int truckWeight : truck_weights) {
    	waitTruck.add(truckWeight);
    }
    for(int i = 0; i < bridge_length; i++) {
    	bridge.add(0);
    }
   
    
    while(!bridge.isEmpty()) {
    	bridgeTotalWeight -= bridge.peek();
    	bridge.poll();
    	
    	if(waitTruck.isEmpty()) {
    		time += bridge_length;
    		break;
    	}	else {
    		if((bridgeTotalWeight + waitTruck.peek()) <= weight) {
    			bridge.add(waitTruck.peek());
    			bridgeTotalWeight += waitTruck.peek();
    			waitTruck.poll();
    		} else {
    			bridge.add(0);
    		}
    	}//end if
    	time++;
    }

    return time;
	}
}
