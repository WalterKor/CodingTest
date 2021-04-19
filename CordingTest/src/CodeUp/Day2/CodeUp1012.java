package CodeUp.Day2;

import java.util.Scanner;

/*
	실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
	저장되어 있는 실수값을 출력해보자.
	
	참고
	float x;
	scanf("%f", &x);
	printf("%f", x);
	와 같은 방법으로 가능하다.
 */
public class CodeUp1012 {
	public static void main(String[] args) {
		
		float x;
		Scanner sc = new Scanner(System.in);
		System.out.print("실수를 입력해주세요 : ");

		x = sc.nextFloat();
		System.out.print("입력하신 실수 :" + x);
		
		
		
	}
}
