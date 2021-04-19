package CodeUp.Day2;

import java.util.Scanner;

/*
 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 */
public class CodeUp1019 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Year;
	int Month;
	int Day;
	System.out.print("년도 . 월 . 날짜 차례대로 입력해주세요 :");
	Year = sc.nextInt();
	Month = sc.nextInt();
	Day = sc.nextInt();
	
	System.out.printf("입력하신 날은 : %d:%d:%d",Year, Month ,Day);
	
	
	}

}

