package CodeUp.Day2;

import java.util.Scanner;

/*
 	int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
	
	참고
	printf("%d %d %d", a, a, a);
	와 같은 방법으로 출력할 수 있다.

 */
public class CodeUp1016 {
	public static void main(String[] args) {
		
		int x; int y; int z;
		Scanner sc= new Scanner(System.in);
		System.out.print("세 정수를 입력하세요 : ");
		x= sc.nextInt();
		y= sc.nextInt();
		z= sc.nextInt();
		
		
		System.out.printf("입력하신 세 정수 : %d, %d, %d",x,y,z);
		
		
		
	}
}
