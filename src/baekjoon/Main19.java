//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//출력
//1부터 n까지 합을 출력한다.

package baekjoon;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
        
		for (int i = 1; i <= a; i++) { // i = 1 i가 a보다 같거나 클때까지 1씩 증가시킨다
			sum += i; // i값을 sum 정수로 대입 수학개념 왜이리 어렵노
		}				
		System.out.println(sum);
	}
		
}

