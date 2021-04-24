package Day4;

import java.util.Scanner;

public class ex042402 {
	public static void main(String[] args) {
		/*
		 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
		 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
		 "Quadrant n"은 "제n사분면"이라는 뜻이다.
		 
		 단)X와 Y의 좌표는 0이되서는 안된다.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("X와 Y의 좌표를 차례대로 입력하세요 : ");
		
		if(x>0) {
			if(y>0) {
				System.out.println("1사분면");
			}else {
				System.out.println("4사분면");
			}
		}else {
			if(y>0) {
				System.out.println("2사분면");
			}else {
				System.out.println("3사분면");
			}
		}
		
		
	}
}
