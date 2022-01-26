package beakjun.step21_30;

import java.util.Arrays;
import java.util.Scanner;

/** 이분탐색/숫자카드2
 * */
public class Main10816 {
  public static void main(String[] args) {
    int count = 0;
    Scanner sc = new Scanner(System.in);

    int userTotal = sc.nextInt();
    int[] userCard = new int[userTotal];
    for(int i = 0; i < userTotal; i++){
      userCard[i] = sc.nextInt();
    }

    int matchTotal = sc.nextInt();
    int[] matchCard = new int[matchTotal];
    for(int i = 0; i < matchTotal; i++){
      matchCard[i] = sc.nextInt();
    }

    Arrays.sort(userCard);

    String answer = duplicatedSearch(userCard, matchTotal, matchCard);
    System.out.println(answer);
  }


  private static String duplicatedSearch(int[] userCard, int matchTotal, int[] matchCard){
    StringBuilder stringBuilder = new StringBuilder();

    for(int i = 0; i < matchTotal; i++){
      int key = matchCard[i];
      int number = upperBound(key, userCard) - lowerBound(key, userCard);
      stringBuilder.append(number).append(" ");
    }

    return stringBuilder.toString();
  }


  private static int lowerBound(int key, int[] userCard){
    int lowIndex = 0;
    int middleIndex = 0;
    int highIndex = userCard.length;

    while(lowIndex < highIndex){
      middleIndex = (lowIndex + highIndex) / 2;

      if(key <= userCard[middleIndex]){
        highIndex = middleIndex;
      } else {
        lowIndex = middleIndex + 1;
      }

    }

    return lowIndex;
  }


  private static int upperBound(int key, int[] userCard){
    int lowIndex = 0;
    int middleIndex = 0;
    int highIndex = userCard.length;

    while(lowIndex < highIndex){
      middleIndex = (lowIndex + highIndex) / 2;

      if(key < userCard[middleIndex]){
        highIndex = middleIndex;
      } else {
        lowIndex = middleIndex + 1;
      }
    }

    return lowIndex;
  }
}
