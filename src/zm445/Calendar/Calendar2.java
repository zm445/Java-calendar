package zm445.Calendar;

/** 월을 입력하면 해당월의 달력을 출력한다.
	달력은 모양은 1단계에서 작성한 모양으로 만든다.
	1일은 일요일로 정해도 무방하다.
	-1을 입력받기 전까지 반복 입력받는다.
	프롬프트를 출력한다.
**/

public class Calendar2 {
	
	private static final int[] MAX_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getMaxOfMonth(int month) {
		return MAX_DAY[month - 1];
	}
	
	public static void printCalendar(int year, int month) {
		
		int MaxDay = getMaxOfMonth(month);
		
		System.out.printf("    <<%3d년 %2d월>> \n", year, month);
		for(int i=1; i<=MaxDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
}
