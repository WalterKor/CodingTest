package Day5;

import java.util.Scanner;

public class ex042603 {
	public static void main(String[] args) {
		
		int Max;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		Max = sc.nextInt();
		
		for(int i=1;i<=Max;i++)
		{
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d",Max,sum);
	}
}
