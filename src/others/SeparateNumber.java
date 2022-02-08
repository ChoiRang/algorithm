package others;
/**숫자 나누기*/
public class SeparateNumber {
  public int[] separateNumber(int number){
    //자릿수
    int numberSize = (int)(Math.log10(number)+1);

    int[] numberArray = new int[numberSize];

    for(int i = 0; i < numberSize; i++){
      numberArray[i] = number % (10);
      number /= 10;
    }
    return numberArray;
  }

  public int[] separateNumber(String number){
    int[] numberArray = new int[number.length()];

    for(int i = 0; i < number.length(); i++){
      String num = String.valueOf(number.charAt(i));
      numberArray[i] = Integer.parseInt(num);
    }
    return numberArray;
  }
}
