package zm445.Calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		String inputValue = scan.nextLine();
		
		String[] splitedValue = inputValue.split(" ");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		int total = first + second;
		
		System.out.println("두 수의 합은 " + total + "입니다.");
		scan.close();
	}
} 
