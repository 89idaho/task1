package ws03;

import java.util.Arrays;
import java.util.Scanner;

public class Ws03 {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("���ڸ� 3���� �Է��ϼ���.");
  System.out.println("ù��° ���ڸ� �Է��ϼ��� >> ");
  int num = sc.nextInt();
  System.out.println("�ι�° ���ڸ� �Է��ϼ��� >> ");
  int num1 = sc.nextInt();
  System.out.println("����° ���ڸ� �Է��ϼ��� >> ");
  int num2 = sc.nextInt();
  int[] arr = { num, num1, num2 };
  
  if (num > 9 || num1 > 9 || num2 > 9) {
   
   System.out.println("�ش� ���ڰ� 9�� �ʰ��߽��ϴ�.");
  } else {
   
   Arrays.sort(arr);
   System.out.println(" �ִ밪 : " + arr[2]);
   System.out.println(" �ּҰ� : " + arr[0]);
   System.out.println(" �� : " + (arr[2] - arr[0]));
  }
  
  sc.close();

 }

}
