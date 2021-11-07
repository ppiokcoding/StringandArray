package StringandArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class St2 {

	public static void main(String[] args) throws IOException {
		
		//[String_2]
		
		//1.메모리의 공간은 한번 할당되면 더이상 늘이거나 줄일 수 없다.
		//2. 문자열은 불변(Immutable)이다. > 한번 만들어진 문자열은 수정할 수 없다.
		//3. 문자열 상수는 기존에 똑같은 상수가 존재하면 재사용한다.(소스상의 표기된 리터럴을 재사용 한다.)
		
		int n1 = 10; 			//4byte
		int n2 = 20;			//4byte
		int n3 = 2100000000;	//4byte  값형의 특정
		
		String str  = "홍길동"; //6byte
		String str2 = "삐옥이"; //6byte
		String str3 = "홍길동"; //6byte       
		
		String str4 = "홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요.";
		//60 x 2 = 120 byte
		
		String str5 = "홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요. 홍길동님 안녕하세요.";
		//str4와 똑같은 문자
		//그런데 참조를 안하면 이때 상수가 각각 생성된다 치면 덩치큰 것들이 각각 생기면서 메모리가 금방 차게 됨
		//왜냐면 문자열은 길이가 길어질수록 크기가 커진다는 특성이 있기때문이다.
		//그래서 똑같이 생긴 문자열은 하나만 만들자는 결론이나오고 참조하게됨 똑같은걸 그대로 쓴다.
		
		
		int n4 = 10;
		n4 = n4 + 1; //수정
		
		String str6 = "홍길동";
		str6 = str6 + "님"; //수정   그림판
		
		System.out.println(str6); //홍길동에 님을 누적했다고 착각하지 말것!!!! 새로 만들어진 것임 
								  //*한번 만들어진 문자열을 수정할 수 없다.* 
								  // ->메모리 공간의 크기는 한번 만들어지면 늘리거나 줄이는 행위를 할 수 없기 때문에
		
		//s1, s2 > 상수
		//s3 > 연산 결과 상수
		//s4 > 콘솔 입력
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 += "길동"; //연산의 결과로 만들어진 문자열 상수는 기존 상수를 재사용하지 않고 새로 생성한다.(내부 문맥이 달라서...)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력: ");
		String s4 = reader.readLine(); //홍길동
		
		System.out.println("s1 > " + s1);
		System.out.println("s2 > " + s2);
		System.out.println("s3 > " + s3);
		System.out.println("s4 > " + s4);

		
		//**** 모든 참조형 변수의 비교는 데이터가 비교가 아니라 !!참조 주소값!!을 비교한다.
		System.out.println("s1 == s2 > " + (s1 == s2)); //true
		System.out.println("s1 == s3 > " + (s1 == s3)); //false
		System.out.println("s1 == s4 > " + (s1 == s4)); //false
		System.out.println("s3 == s4 > " + (s3 == s4)); //false
		
		
		//equals는 주소값이 아닌 데이터값(=홍길동)을 비교하도록 만들어진 메소드임!
		System.out.println("s1.equals(s2) > " + (s1.equals(s2)));
		System.out.println("s1.equals(s3) > " + (s1.equals(s3)));
		System.out.println("s1.equals(s4) > " + (s1.equals(s4)));
		System.out.println("s1.equals(s4) > " + (s3.equals(s4)));
		
		System.out.println("equals(s1, s2) > " + equals(s1, s2));
		System.out.println("equals(s1, s3) > " + equals(s1, s3));
		System.out.println("equals(s1, s4) > " + equals(s1, s4));
		System.out.println("equals(s3, s4) > " + equals(s3, s4));
		
		
		//this.aaa();
		//Ex47_String.bbb();
		
		//aaa(); 에러남
		// => (this. 생략됨) aaa(); //얘는 에러남 정적 메소드 안에서는 디스를 못쓴다.
		//bbb();
		// => (Ex47_String 생략됨)bbb();
		
		
		//Ex47_String ex = new Ex47_String();
		//ex.aaa();
		
		
	}//main
	
	//문자열 비교 메소드
	public static boolean equals(String str1, String str2) {
		
		//1. str1 == str2
		//- 주소값 비교
		//- 모든 참조형 변수의 비교(단, 문자열만 제외)
		//- 얕은 비교
		
		//2. str1.equals(str2)
		//- 데이터 비교
		//- 깊은 비교
		
		
		
		//str1과 str2를 데이터 비교 후 결과 반환
		
		//return false;
		//return str1 == str2; //주소값 비교..쓰지마!!!
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		for (int i=0; i<str1.length(); i++) {
			
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			if(c1 != c2) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public void aaa() {
	}
	
	public static void bbb() {
	}
	
//얘네는 메인메소드에서 쓰려고 만듦

}


