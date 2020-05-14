/*
  date : 2020.05.14
  Author : minj
  Descriptin : DoWhileEx
  Version : 3.0
*/
package practice_00;

import java.util.Scanner;

public class Ex03_DoWhileEx {
	public static void main(String[] args) {
		// 3번안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!
		
		
		int answer = (int)(Math.random()*45) + 1;
		int input = 0;
		int count = 0;
		
		boolean run = true;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("up & down Game 시작!");
		
		do {
			System.out.println("1~45까지 숫자를 말하세요!");
			input = sc.nextInt();
			count++;
		
			if (answer > input) {
				System.out.println("up! 더 큰 수를 말하세요~!");
			} else if (answer < input) {
				System.out.println("down! 더 작은 수를 말하세요~!");
			}	else {
					System.out.println("정답은 " + answer + " 입니다~!");
					System.out.println("시도한 횟수는 " + count + " 입니다~!");
					run = false;
			}
			
		
		} while (run);
			if (count <= 3) {
				System.out.println("통과");
			} else {
				System.out.println("벌칙");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
