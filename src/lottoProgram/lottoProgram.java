package lottoProgram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lottoProgram {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("6개의 숫자를 입력하세요.");
  int[] arr = new int[6];
  ArrayList<Integer> lotto = new ArrayList<>();
  int count = 0;
  long money = (long) (10_000_000_000l * (Math.random() * 10));

  for (int i = 0; i < 6; i++) {
   System.out.print(i + 1 + "번째 숫자를 입력하세요 :");
   arr[i] = sc.nextInt();

   if (arr[i] > 45) {
    System.out.println("잘못된 입력 값입니다.");
    return;
   }
  }
  for (int i = 0; i < 6; i++) {
   for (int j = i; j >= 0; j++) {
    if (arr[i] == arr[j]) {
     System.out.println("잘못된 입력 값입니다.");
     return;
    }
   }
  }
  for (int i = 1; i <= 45; i++) {
   lotto.add(i);
  }

  Collections.shuffle(lotto);

  int[] lottoNums = new int[6];
  for (int i = 0; i < 6; i++) {
   lottoNums[i] = lotto.get(i);
  }
  Arrays.sort(arr);
  Arrays.sort(lottoNums);
  System.out.print("당신이 선택한 번호는 :");
  for (int i = 0; i < 6; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println("");
  System.out.print("로또 당첨 번호는 :");
  for (int i = 0; i < 6; i++) {
   System.out.print(lottoNums[i] + " ");
  }

  for (int i = 0; i < 6; i++) {
   for (int j = 0; j < 6; j++) {
    if (lottoNums[i] == arr[j]) {
     count++;
    }
   }
  }
  System.out.println("");
  String str = String.format("%,d", money);
  System.out.println("총 당첨금 : " + str);
  if (count == 3) {
   money = (long) (money * 0.05);
  } else if (count == 4) {
   money = (long) (money * 0.1);
  } else if (count == 5) {
   money = (long) (money * 0.2);
  } else if (count == 6) {
   money = (long) (money * 0.5);
  } else {
   money = 0;
  }
  str = String.format("%,d", money);
  System.out.println("당첨금 : " + str);

  sc.close();

 }

}
