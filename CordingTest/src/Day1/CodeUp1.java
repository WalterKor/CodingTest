package Day1;

import java.util.Scanner;

/*
 ���� 3���� �Է¹޾� �հ� ����� ����غ���.
 */
public class CodeUp1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		double avg = 0;
		System.out.print("���� 3���� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		avg = (double)((num1+num2+num3)/3);
		
		
		System.out.printf("%d,%d,%d�� ��� : %d",num1,num2,num3,avg);
		
	}

}
