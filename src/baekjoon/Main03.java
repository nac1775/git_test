//https://www.acmicpc.net/problem/1009
//
//재용이는 최신 컴퓨터 10대를 가지고 있다. 어느 날 재용이는 많은 데이터를 처리해야 될 일이 생겨서 각 컴퓨터에 1번부터 10번까지의 번호를 부여하고, 10대의 컴퓨터가 다음과 같은 방법으로 데이터들을 처리하기로 하였다.
//
//1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,
//
//10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터, ...
//
//총 데이터의 개수는 항상 ab개의 형태로 주어진다. 재용이는 문득 마지막 데이터가 처리될 컴퓨터의 번호가 궁금해졌다. 이를 수행해주는 프로그램을 작성하라.
//
//입력
//입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
//
//출력
//각 테스트 케이스에 대해 마지막 데이터가 처리되는 컴퓨터의 번호를 출력한다.
//
//예제 입력 1 
//5
//1 6
//3 7
//6 2
//7 100
//9 635
//예제 출력 1 
//1
//7
//6
//1
//9
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {

	public static void main(String[] args) throws IOException 
	{
//		BufferedReader 사용이유
//		BufferedReader 는 버퍼를 이용하여 한번에 데이터를 입력하기 때문에 메모리 관리가 더욱 용이하다.
//		BufferedReader 스캐너와 유사 
//		 주의할점 	1.String이 아닌 다른타입을 입력 받으려면 형변환 필수 
//				2. throws IOException 로 예외처리를 꼭 해줘야함 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//      형변환 하는법 
//		 변수 선언 후 Integer.parseInt 입력 괄호 안에는 reader.readLine 입력
//	        인티저 타입으로 형변환 
		 	int T = Integer.parseInt(reader.readLine());
//	        1씩증가
	        for (int i = 0; i < T; i++)
	        {
//	        	.split("") = "" 안에 스페이스로 띄우기가 들어가면 문자열을 분리 시킴   https://crazykim2.tistory.com/549 참고
//	        	문자 배열 변수 temp 선언후 reader.readLine(),split 로 입력받고 줄바꿈 할수있게 해줌
	            String[] temp = reader.readLine().split(" ");
//	            String 타입 배열 temp를 int타입으로 형변환후 a,b 변수만들기 
	            int a = Integer.parseInt(temp[0]);
	            int b = Integer.parseInt(temp[1]);
	            
	            int result = 1;
//	            j보다 b가 크거나 같을경우 1 씩 증가 
	            for (int j = 1; j <= b; j++)
	            {
//	                result 안에 1*2/10 의 값을 대입 
	            	result = result * a % 10;
	            }
	            
	            // result 값이 0일 경우 10으로 처리
	            result = result == 0 ? 10 : result;
//	            출력
	            System.out.println(result);
	        }
//	        버퍼를 잡아놓았기 때문에 close로 닫아주는것
	        reader.close();
		
		
		
		
		
	}

}
