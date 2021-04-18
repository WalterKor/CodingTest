package CodeUp.Day1;

import java.util.Scanner;

/*
	문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
	변수에 저장되어 있는 문자를 그대로 출력해보자.
	
	참고
	char x;
	scanf("%c", &x);
	printf("%c", x);

 */
public class CodeUp1010 {
	public static void main(String[] args) {
		
		String x;
		System.out.print("문자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		
		System.out.println("입력하신문자 열 : " + x  );
		
	}

}
