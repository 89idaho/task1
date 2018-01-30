package ws03;

import java.util.Arrays;
import java.util.Scanner;

public class Ws03 {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("숫자를 3개를 입력하세요.");
  System.out.println("첫번째 숫자를 입력하세요 >> ");
  int num = sc.nextInt();
  System.out.println("두번째 숫자를 입력하세요 >> ");
  int num1 = sc.nextInt();
  System.out.println("세번째 숫자를 입력하세요 >> ");
  int num2 = sc.nextInt();
  int[] arr = { num, num1, num2 };
  
  if (num > 9 || num1 > 9 || num2 > 9) {
   
   System.out.println("해당 숫자가 9를 초과했습니다.");
  } else {
   
   Arrays.sort(arr);
   System.out.println(" 최대값 : " + arr[2]);
   System.out.println(" 최소값 : " + arr[0]);
   System.out.println(" 차 : " + (arr[2] - arr[0]));
  }
  
  sc.close();

 }

}
