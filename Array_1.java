package StringandArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		//[Array_1]
		
		//배열, Array
		//- 자료형
		//- 데이터의 집합 자료형
		//- 자료 구조 > 수많은 데이터들을 사용 목적과 사용 용도에 맞게 저장하는 방식
		//			  ex) 주문들 > 관리 > 어떤 형태로 보관+저장?+사용 > 줄지어 저장 
		
		//- 같은 자료형 변수를 모아놓은 집합 == 변수의 집합
		
		//m1();			//평균구하기1
		//m2();			//평균구하기2(배열 이용)
		//m3();			//평균구하기3(배열이 유지보수에 적합한 이유)
		//m4();			//메모리 설명(그림판, stack/heap)
		//m5();			//각 자료형 배열 만드는 법
		//m6();			//상황에 따른 배열 만드는 법
		//m7();			//배열의 복사(=참조형의 복사)
		//m8();			//배열의 복사
		//m9();			//배열의 초기화
		m10();			//배열 용어 설명
		
	}//main

	private static void m10() {

		
		//배열 탐색 > 배열의 각 방을 원하는 순서대로 접근하는 행동
		//배열의 방 > 배열의 요소(Element)
		//배열의 방 번호 > 첨자(index)
		//배열의 방 개수 > 길이(length)
		
		int[] nums = new int[5]; //방 5개
		
		//1. 탐색 > 요소 1개 접근 > 배열변수[방번호] : [index] -> 인덱서(Indexer)
		System.out.println(nums[0]);
		
		//2. 탐색 > 요소 N개 접근 > 루프(for, while)
		//	 배열의 탐색 -> for문 적합
		
		//*** 배열을 잘 사용하려면 for문을 잘 사용해야 된다!!!
		for(int i=0; i<nums.length; i++) {
			
		}
		
		String str = "홍길동";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i); // 0 ~ length -1
		}
		
		
		
		
		//값형 변수에는 null을 대입할 수 없다. 		> 반드시 값을 가져야 한다!!!
		//참조형 변수에는 null을 대입할 수 있다. 	> 값을 선택적으로 가질 수 있다.
		int a = 10;
		int[] b = new int[5];
		
		//a = null; // Error
		b = null; 	// O, 비우겠다. > 배열 삭제
		
		
		nums = null;
		
		
	}

	private static void m9() {
		
		//배열 초기화
		
		//변수를 만들고 아직 초기화를 하지 않은 상태
		// -> 공간에 데이터가 없는 상태
		int num;
		int[] nums = new int[5];
		
		//The local variable num may not have been initialized
		//System.out.println(num);
		
		
		//배열(참조형)은 방을 만든 직후에 사용자가 아무것도 하지 않아도 자동으로 방들이 초기화가 된다. > 무슨값으로 초기화? *암기*
		//1. 정수 배열 	=> 0
		//2. 실수 배열 	=> 0.0
		//3. 문자 배열 	=> \0(null)
		//4. 논리 배열 	=> false
		//5. 참조형 배열 	=> null
		System.out.println(nums[0]); //0
		
		double[] nums2 = new double[3];
		System.out.println(nums2[0]);
		
		boolean[] flags = new boolean[3];
		System.out.println(flags[0]);
		
		String[] strs = new String[3];
		System.out.println(strs[0]);
		
		
		
		//배열 초기화
		int[] nums3 = new int[5];
		
		nums3[0] = 100;
		nums3[1] = 200;
		nums3[2] = 300;
		nums3[3] = 400;
		nums3[4] = 500;
		
		for(int i=0; i<nums3.length; i++) {
			nums3[i] = (i + 1) * 100;
		}// 즉 패턴이 있으면 for문을 돌리고
		
		
		
		int[] nums4 = new int[5];
		
		nums4[0] =100;
		nums4[1] =200;
		nums4[2] =500;
		nums4[3] =300;
		nums4[4] =400; //패턴이 없으면 for문 돌릴 수 없다.
		
		//해결방법
		//배열의 초기화리스트
		//-> 불규칙한 배열의 초기화 할 때 사용하라고 제공하는 문법
		int[] nums5 = new int[] { 100, 200, 500, 300, 400 };
		
		int[] nums6 = { 100, 200, 500, 300, 400 };
		
		String[] names = new String[5];
		
		names[0] = "홍길동";
		names[1] = "유재석";
		names[2] = "이정현";
		names[3] = "삐옥이";
		names[4] = "뾱뾱뾱";// 가독성은 이게 더 좋음
		
		String[] names2 = { "홍길동", "유재석", "이정현", "삐옥이", "뾱뾱뾱" };
		
	}

	private static void m8() {
		
		
		//배열 복사
		int[] nums1 = new int[3];
		int[] nums2;
		int[] nums3 = new int[3];
		
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;

		//주소값 복사
		//- 얕은 복사
		//- Shallow Copy
		//- int[] = int[]
		nums2 = nums1;
		
		//값 복사
		//- 깊은 복사
		//- Deep Copy
		for (int i=0; i<nums1.length; i++) {
			nums3[i] = nums1[i]; //배열에 방 하나 즉 int = int
			//값형끼리의 복사가 됨
		}
		
		nums1[0] = 1000; //원본 수정
		
		//얕은 복사 : Side Effect o
		//깊은 복사 : Side Effect x
		
		System.out.println("nums1[0]: " + nums1[0]);
		System.out.println("nums2[0]: " + nums2[0]); //영향o
		System.out.println("nums3[0]: " + nums3[0]); //영향x
		
		
		
	}

	private static void m7() {

		//배열의 복사(= 참조형의 복사)
		
		//값형의 복사
		int a = 10;
		int b;
		
		//값형끼리의 복사는 데이터를 복사한다.
		b = a;
		
		//값형의 복사는 Side Effect가 발생하지 않는다.
		a = 20; //원본 수정
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		int[] nums1 = new int[3];
		int[] nums2;
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();
		
		//int[] = int[]
		//참조형 변수끼리의 복사는 데이터 복사가 아니라 주소값을 복사한다.
		// => Side Effect가 발생한다.
		
		nums2 = nums1;
		
		for (int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		System.out.println();
		
		//================================================================
		nums1[0] = 1000; //원본 배열을 수정
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();
		
		for (int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		System.out.println(); // 1000으로 두개가 바뀌어버림 이해해야함
		
		
		
		
		//String은 물리적으로는 참조형에 속하지만
		//사용되는 형태나 성질은 값형에 가깝다. > 박쥐
		
		//너무나 많이 사용하는 자료형이라서.. 사용하기 불편한 참조형의 사용법대신에 
		//사용하기 편한 값형의 사용형태를 제공한다.
		
		
		//String -> 값형 or 참조형 인지 판단
		String s1 = "홍길동";
		String s2;
		
		s2 = s1;
		
		s1 = "홍길동님";
		
		System.out.println(s2); //홍길동 vs 홍길동님 ? 
		
		
		
	}//m7

	private static void m6() throws NumberFormatException, IOException {

		//***메모리에 할당된 공간의 크기는 불변이다.
		//   == 배열도 한번 방을 만들면 크기는 불변이다.
		//    > 배열의 길이는 불변이다.
		
		//한번 만들어진 배열의 방의 개수는 절대로 늘리거나 줄일수 없다. 
		//  > 배열에 들어갈 데이터의 개수를 사전에 충분히 예측해야 한다!!!!!
		
		//예시)
		// 교장 선생님 > 상담 > 300명
		
		//정적할당 > 컴파일 시 배열의 크기가 이미 정해진 상태
		int[] nums = new int[1000]; //700개의 int방(4바이트) 즉 2800byte가 낭비됨 
		
		
		//자바의 배열은 동적할당은 가능하다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		int n = Integer.parseInt(reader.readLine());

		//실행 중 배열의 길이가 결정 > 동적할당 > 생성 이후로는 길이는 불변 
		int[] nums2 = new int[n]; //배열의 방개수??? 모름! 
		
		System.out.println(nums2.length); //즉, 상황에 따라 배열의 길이를 판단해서 만들게 한 것임!
		
		
		
	}

	private static void m5() {
		
		//각 자료형별 배열
		
		//정수 배열(byte, short, int, long)
		long[] array1 = new long[5];
		array1[0] = 100L;
		System.out.println(array1[0]);
		
		//실수 배열(float, double)
		double[] array2 = new double[5];
		array2[0] = 3.14;
		System.out.println(array2[0]);
		
		//문자 배열(char)
		char[] array3 = new char[5];
		array3[0] = 'A';
		System.out.println(array3[0]);
		
		//논리 배열(boolean)
		boolean[] array4 = new boolean[5];
		array4[0] = true;
		System.out.println(array4[0]);
		
		//참조형
		String[] array5 = new String[5];
		array5[0] = "홍길동";
		System.out.println(array5[0]);
		
		
		
		
	}

	private static void m4() {

		//** 모든 지역변수는 Stack에 생성된다.
		
		
		//8개 자료형(int, boolean)
		//- 값형, 원시형
		//그 외는 참조형임
		
		//배열
		//- 참조형
		
		int n = 100;
		n = 10000;
		boolean b = true; //여기까지 stack이라는 메모리?에 들어감
		
		//참조형
		String s = "홍길동";
		
		s ="홍길동님";
		System.out.println(s);
		
		//그림판 2
		
		//모든 참조형 변수는 int 변수이다.
		//-> 운영체제가 메모리 주소 번지를 기억할때 int형을 사용한다.
		
		int[] kors = new int [3];
		
		kors[0] = 100;
		
		kors[1] = 90;
		kors[2] = 80;
		
		for(int i=0; i<kors.length; i++) { 
			//i<=kors.length; 이라고 하면 뜨는 에러
			//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			//kors[3]
			//= 배열의 인덱스가 범위를 벗어났습니다. 배열의 길이를 벗어나는 인덱스 3이라는 것이 사용 되었습니다. 
			//즉 없는 방을 접근하면 에러난다는 의미
			System.out.printf("kors[%d] = %d\n", i, kors[i]);
		}//for
		
		
		//문자열 -> 문자배열
		String s1;
		char[] s2; // 이 두개(s1,s2)가 같은 것임
		
		//문자열을 대상으로 한 행동들  == 배열을 대상으로 한 행동들
		
		
		
		
	}//m4

	private static void m3() {

		//요구사항] 학생 3명 > 국어점수 > 총점, 평균
		//추가사항] 학생 300명
		//배열은 유지보수에 굉장히 강함 단, 같은 자료형일 경우에만!

		int[] kors = new int[3]; // 3을 배열의 길이라고 말함
		
		//배열의 길이 == 방의 개수  
		System.out.println(kors.length); //프로퍼티(Property), 필드(Field)
		
		//배열은 루프를 사용해서 방을 접근할 수 있다.(****************************************)
		for(int i=0; i<kors.length; i++) { //쓰기
			//0 -> 1 -> 2
			//kors[0] -> kors[1] ->kors[2]  방번호가 루프변수와 똑같아짐
			kors[i] = 100 - (i * 10); //배열의 방번호를 변수를 써도 동일한 취급을 해줌 즉, 방 3개 모두다 100점을 넣으라는 의미
		}

		int total = 0;
		
		for(int i=0; i<kors.length; i++) { //읽기
			total += kors[i]; // 누적 -> 방 3개의 총합 -> 총점
		}
		
		double avg = (double)total / kors.length;
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
	}

	private static void m2() {

		
		//요구사항] 학생 3명 > 국어점수 > 총점, 평균
		//추가사항] 학생 300명
		
		//1. 배열 생성하기(선언하기)
		//2. 배열 사용하기(입력, 출력)
		
		
		//자료형[] 배열변수명 = new 자료형[길이];
		
		// 변수 n의 자료형? int입니다.
		// 변수 kors의 자료형? int[]입니다.= int 배열입니다.---> 변수앞의 모든 표현은 하나의 표현이라고 생각해라!!!
		int n = 10;
		int[] kors = new int[3]; //=int 방을 300개 만들어라, 방의 숫자만 바꾸면 되는게 배열의 장점임
		
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;   // 배열에다가 데이터를 넣은 것임
		//..
		kors[299] = 80;
		
		
		
		int total = kors[0] + kors[1] + kors[2]; //+kors[299]
		double avg = total/ 3.0; //300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
		
	}

	private static void m1() {

		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균 구하기
		//추가사항] 학생 300명
		
		int kor1;
		int kor2;
		int kor3;
		// + 297
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// +297
		
		int total = kor1 + kor2 + kor3; //+kor4 + kor5 ...+297
		double avg = total / 3.0; //3.0 -> 300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
		
		//개발자 확인용 출력
		
		int[] nums = new int[20];
		
		//1.
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//2.
		//dump(nums);    //2-1
		
		//배열의 내용물을 확인하고 싶으면
		System.out.println(Arrays.toString(nums)); // 배열 확인하기!! 개발자용, 2-2(추천)
		
		
	}//m1

	private static String dump(int[] nums) {
		
		//[1,2,3,4,5]

		String temp = "[";
		
		for(int i=0; i<nums.length; i++) {
			temp += nums[i] + ",";
		}
		
		//"[1,2,3,4,5,"
		temp = temp.substring(0, temp.length() -2);
				
		//"[1,2,3,4,5,"
		return temp + " ]";
		
	}
	
	
}//class
