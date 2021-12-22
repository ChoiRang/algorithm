package programmers.lv1;

import java.util.HashMap;

/**완주하지 못한 선수 +8*/
public class Player {
	public String solution(String[] participant, String[] completion) {
    String answer = "";
    String name;
    int count;
    
    HashMap<String, Integer> hs = new HashMap<>();
    
    for(int i = 0; i < participant.length; i++) {
    	name = participant[i];
    	if(hs.containsKey(name)) {
    		count = hs.get(name);
    		hs.put(name, ++count);
    	} else {
    		hs.put(name, 1);
    	}
    }
    
    for(int i = 0; i < completion.length; i++) {
    	name = completion[i];
    	count = hs.get(name);
    	if(count == 1) {
    		hs.remove(name);
    	} else {
    		hs.put(name, --count);
    	}
    }
    
    answer = hs.toString();
    answer = answer.substring(1, answer.length()-3);
    return answer;
	}
}
