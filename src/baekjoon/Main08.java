//https://www.acmicpc.net/problem/2588
//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//
//
//
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//출력
//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

//https://st-lab.tistory.com/20 참고 
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main08{
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
//      StringBuilder =  Stirng은 변경 불가능한 문자열을 생성하지만 
//		StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.  
//		참고 : https://onlyfor-me-blog.tistory.com/317
		StringBuilder sb = new StringBuilder();
//       사칙연산 이 부족한관계로 이부분은 복붙.. 
		sb.append(A * (B%10));
		
//		\n 
		sb.append(A * ((B%100)/10));
		
        
		sb.append(A * (B/100));
		
		sb.append(A * B);
 
		System.out.println(sb);
        
	}
 
}