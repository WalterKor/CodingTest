package CodeUp.Day2;

import java.util.Scanner;

/*
	정수(int) 2개를 입력받아 그대로 출력해보자.
	
	참고
	
	int a, b;
	scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
	printf("%d %d", a, b);
	
	와 같은 방법으로 가능하다.

 */
public class CodeUp1013 {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력해주세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("입력하신 두 정수는 %d, %d입니다.",a,b);
		
		
	}
}
