package zm445.Calendar;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {
		
		System.out.println("일  월  화  수  목  금 토");
		System.out.println("--------------------");
		
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		// 숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		int[] result = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();
		scan.close();
		
		if(month < 1 || 12 < month) {
			System.out.printf("잘못 입력하셨습니다.");
			return;
		}
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, result[month-1]);
		
		
	}
}
