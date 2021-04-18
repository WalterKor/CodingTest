package CodeUp.Day1;

import java.util.Scanner;

/*
	정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
	변수에 저장되어 있는 값을 그대로 출력해보자.
	
	예시
	int main()
	{
	    int n;
	    scanf("%d", &n);
	    printf("%d", n);
	
	    return 0;
	}

 */
public class codeUp1009 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		
		num = sc.nextInt();
		System.out.println("입력하신 정수 : " + num);
		
		
	}

}
