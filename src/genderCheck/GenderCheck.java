package genderCheck;



import java.util.Scanner;

public class GenderCheck {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("�ֹι�ȣ�� �Է��� �ּ��� >>");
  String num = sc.next();
  char a = num.charAt(6);
  if (a == '1' || a == '3') {
   System.out.println("����� ������ �����Դϴ�.");
  } else if (a == '2' || a == '4') {
   System.out.println("����� ������ �����Դϴ�.");
  } else {
   System.out.println("����� �ѱ����� �ƴմϴ�.");
  }  
  sc.close();
 }
}