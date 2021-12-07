package programmers.lv1;
/**행렬의 덧셈*/
public class AdditionOfMatrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int x =arr1.length;
		int y = arr1[0].length;
    int[][] answer = new int[x][y];	//객체 생성해야 값이 들어갈 수 있음!
    int[] abc = {};
    for(int i =0; i < arr1.length; i++) {
    	for(int j =0; j < arr1[i].length; j++) {
    		int a = arr1[i][j];
    		int b = arr2[i][j];
    		answer[i][j] = a+b;
    	}
    }
    return answer;
	}
}
