package beakjun.step21_30;

import java.util.*;

public class Main1260 {
  private static boolean visited[];
  private static StringBuilder answer = new StringBuilder();
  private static ArrayList<Integer>[] connectList;
  private static Queue<Integer> queue;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    connectList = (ArrayList<Integer>[])new ArrayList[a + 1];
    for(int i = 1; i <=a; i++){
      connectList[i] = new ArrayList<Integer>();
    }

    int[] lines= new int[b];
    for(int i = 0; i< b; i++){
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      connectList[num1].add(num2);
      connectList[num2].add(num1);
    }

    for(int i = 1; i <= a; i++) {
      Collections.sort(connectList[i]);
    }
    visited = new boolean[a+1];
    dfs(c);
    System.out.println(answer);
    answer.setLength(0);
    Arrays.fill(visited, Boolean.FALSE);

    queue = new LinkedList<Integer>();
    bfs(c);
    System.out.println(answer);

  }

  public static void dfs(int index){
    visited[index] = true;
    answer.append(index + " ");
    for(int x : connectList[index]){
      if(!visited[x]){
        dfs(x);
      }
    }
  }

  public static void bfs(int index){
    queue.add(index);
    visited[index] = true;

    while(!queue.isEmpty()){
      int num = queue.poll();
      answer.append(num + " ");
      for(int x : connectList[num]){
        if(!visited[x]){
          visited[x] = true;
          queue.add(x);
        }
      }
    }
  }
}
