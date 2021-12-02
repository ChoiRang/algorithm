package programmers.lv1;
/** 로또의 최고순위와 최저순위 */
public class LottoMinMax {
	class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
    	int minMatch = 0;
    	int notMatch = 0;
    	
    	
    	for(int a =0; a < lottos.length; a ++) {
            if(lottos[a] != 0){
                for(int b = 0; b < win_nums.length; b++){
    		    	if(lottos[a] == win_nums[b]) {
    			    	minMatch++;
    		    	}
                }     
            } else {
                notMatch++;
            }
    	}
    	int maxRank = minMatch + notMatch;
    	
    	
    	RankingClass rank = new RankingClass();
    	
      int[] answer = {rank.ranking(maxRank), rank.ranking(minMatch)};
      return answer;
    }//end solution
    
    class RankingClass{
    	int rank;
    	
    	public int ranking(int num) {   			
    		switch(num) {
    			case 6:
    				rank = 1;
                    break;
    			case 5:
    				rank = 2;
                    break;
    			case 4:
    				rank = 3;
                    break;
    			case 3:
    				rank = 4;
                    break;
    			case 2:
    				rank = 5;
                    break;
    			default:
    				rank = 6;
                    break;
	    	}
    		return rank;
    	}//end ranking
    }//end RankingClass class
	}//end Solution
}
