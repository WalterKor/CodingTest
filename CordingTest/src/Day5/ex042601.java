package Day5;

import java.util.Scanner;

public class ex042601 {
	public static void main(String[] args) {
		/*
		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
		출력 형식에 맞춰서 출력하면 된다.
		*/
		
		int dan;
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력해라");
		dan = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
		
	}
}
