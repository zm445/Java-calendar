package zm445.Calendar;

import java.util.Scanner;

/** 월을 입력하면 해당월의 달력을 출력한다.
달력은 모양은 1단계에서 작성한 모양으로 만든다.
1일은 일요일로 정해도 무방하다.
-1을 입력받기 전까지 반복 입력받는다.
프롬프트를 출력한다.
**/

public class Prompt {
	
	private final static String Prompt = "cal> ";
	
	public void RunPrompt() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(Prompt);
			int month = scanner.nextInt();
			if(month == -1) {
				break;
			} else if(month < 1 || month > 12) {
				System.out.println("잘못 입력하셨습니다 (1~12 입력가능)");
				continue;
			}
			Calendar2.printCalendar(2021, month);
		}
		System.out.println("Bye~");
		scanner.close();
	}
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.RunPrompt();
	}
}
