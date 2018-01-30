package genderCheck;



import java.util.Scanner;

public class GenderCheck {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("주민번호를 입력해 주세요 >>");
  String num = sc.next();
  char a = num.charAt(6);
  if (a == '1' || a == '3') {
   System.out.println("당신의 성별은 남자입니다.");
  } else if (a == '2' || a == '4') {
   System.out.println("당신의 성별은 여자입니다.");
  } else {
   System.out.println("당신은 한국인이 아닙니다.");
  }  
  sc.close();
 }
}