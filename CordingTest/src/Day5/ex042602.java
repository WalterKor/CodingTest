package Day5;

import java.util.Scanner;

public class ex042602 {
	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하시오 : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d",a, b ,a+b);
		
	}
}
