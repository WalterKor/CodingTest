package Day1;

import java.util.Scanner;

/*
 정수 3개를 입력받아 합과 평균을 출력해보자.
 */
public class CodeUp1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		double avg = 0;
		System.out.print("숫자 3개를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		avg = (double)((num1+num2+num3)/3);
		
		
		System.out.printf("%d,%d,%d의 평균 : %d",num1,num2,num3,avg);
		
	}

}
