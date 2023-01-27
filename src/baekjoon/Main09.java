package baekjoon;

public class Main09{
public static void main(String[] args){
//		 String 객체끼리 더하는 방법은 메모리 할당과 해제를 발생시키는데, 
//				덧셈 연산이 많아진다면 성능적으로 좋지 않다
//				먼저 StringBuilder의 객체를 생성한 후, append()의 인자로 연결하고자 하는 문자열을 넣어서 StringBuilder의 객체를 통해 호출한다.
//				그리고 출력 시에는 toString()을 붙여야 하고, String 변수에 넣을 때도 마찬가지
				StringBuilder sb = new StringBuilder();
//				/ 백슬래시는 단독으로 출력 불가능.
//				//백슬래시를 두번사용하면 사용 가능함
				sb.append("\\    /\\\n");
				sb.append(" )  ( ')\n");
				sb.append("(  /  )\n");
		 		sb.append(" \\(__)|\n");
				
				System.out.println(sb);
			}
		}