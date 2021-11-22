package zm445.Calendar;

import java.util.Scanner;

//먼저 반복할 횟수를 입력받은 후 그 횟수만큼 
//숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램

public class Calendar {	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxOfDay(int month) {
		return MAX_DAYS[month - 1];
	}	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.printf("반복할 횟수를 입력하세요. \n");
		int repeat = scanner.nextInt();
		
		int j = 0;
		while(j < repeat) {			
			System.out.printf("달을 입력하세요. \n");
			int month = scanner.nextInt();
			
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxOfDay(month));
			j++;
		}
		scanner.close();
	}
}
