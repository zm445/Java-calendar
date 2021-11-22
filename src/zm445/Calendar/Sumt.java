package zm445.Calendar;

import java.util.Scanner;

public class Sumt {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("두 수를 입력하세요.");
		String s1 = scanner.next();
		String s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d와 %d의 합은 %d입니다", a, b, a+b);
		scanner.close();
	}
}
