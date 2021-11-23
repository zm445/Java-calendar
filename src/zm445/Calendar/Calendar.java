package zm445.Calendar;

import java.util.Scanner;

//숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램 
//반복입력을 받을 수 있고
//입력하는 곳 앞에 프롬프트를 출력,
//-1달을 입력받을 경우 프로그램을 종료하도록 구현

public class Calendar {	
	private static int[] MAY_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	
	public int getMaxOfDays(int month) {
		return MAY_DAYS[month - 1];
	}	
	public static void main(String[] args) {		
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if(month == -1) {
				break;
			} else if(month < 1 || month > 12) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxOfDays(month));
		}
		System.out.println("good Bye~");
		scanner.close();
	}
}
