package CodeUp.Day2;

import java.util.Scanner;

/*
	2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
	
	참고
	char x, y;
	scanf("%c %c", &x, &y);
	printf("%c %c", y, x); //출력되는 순서를 작성
	와 같은 방법으로 해결할 수 있다.

	[자바 char형 입력]
	자바 Scanner는 문자를 입력받는 기능이 없다.

	즉, Scanner.next()로 문자열을 입력받은 다음, String.charAt(0)으로 첫번째 문자를 꺼내오면 된다.
	String s = scanner.next();
	char c = s.charAt(0);
 */
public class CodeUp1014 {
	public static void main(String[] args) {
		
		String k;char x;char y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 문자를 입력해라 : ");
		k = sc.next();
		x= k.charAt(0);
		
		k = sc.next();
		y= k.charAt(0);
	
		System.out.printf("입력하신 두 문자 : %s %s",x, y);
		
		
	}
}
