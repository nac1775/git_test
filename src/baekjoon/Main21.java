//본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//
//C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
//
//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//
//Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.
//
//또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
//
//자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
//
//이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
//
//입력
//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//
//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//


package baekjoon;

		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.util.StringTokenizer;
		 
		public class Main21 {
		 
			public static void main(String[] args) throws IOException {
		 
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 대신 사용 
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //System.out.println 대신 사용
		 
		 
				int N = Integer.parseInt(br.readLine()); // BuffredReader 를 사용하게되면 String값으로 고정되기떄문에 int형으로 형변환을 꼭해줘야함 
		        // throws IOException 로 예외 처리 입력을 readLine() 로 사용하기때문에 예외처리를 사용해줘야함 
				StringTokenizer st; //st 라는 문자열을 여러개로 분리하는 클래스  https://jhnyang.tistory.com/398 사이트참고 
				// StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있음
				//StringTokenizer 은 문자열들을 분리할때 사용 특정문자에 따라 문자열을 나누고 싶을때 " " 에 공백이 들어가이쓰면 문자열을 나누겠다 이런식임
				for (int i = 0; i < N; i++) { // 숫자 5를 입력했을때 5줄을 출력 한다는것  
					st = new StringTokenizer(br.readLine()," "); //여기서 스페이스바를 사용했을때 문자열을나누겠다 선언한것 예를들어 5 5 라고 적으면 5+5 와 동일
					bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n"); // integer 값으로 형변환후 \n 이라는 개행문자 예를들어 앤터를쳤을때 다음 더할값을 적을수있음
				}
				br.close();// 닫기
		        
				bw.flush();// 버퍼에 있는값 전부 출력
				bw.close();// 출력후 닫기
		 
			}
		
	}


