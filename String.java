package StringandArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String {

	public static void main(String[] args) throws IOException {

		// [String]

		// 문자열, String
		// - 문자의 집합
		// - 참조형
		// - "리터럴"
		// - 자바에서 문자열 조작하는 기능 제공

		// m1();
		// m2(); //이름 입력
		// m3();
		// m4();
		// m5(); //아이디 검사(한글자씩 유효성 검사)
		// m6(); //회원가입 (실제 추천방법)
		// m7();
		// m8();
		// m9(); //****
		// m10();
		// m11();
		// m12();
		// m13();
		m14();

	}// main

	private static void m14() {

		// 문자열 치환(바꾸기)
		// - 문자열의 일부를 다른 문자열로 교체하는 메소드
		// - String replace(String old, String new)

		String txt = "안녕하세요. 홍길동입니다. 저를 홍길동이라고 부르세요.";
		System.out.println(txt.replace("홍길동", "아무개"));

		String content = "게시판에 글을 작성합니다. 바보야!!!";
		String word = "바보";

		// Masking
		System.out.println(content.replace(word, "**"));

		txt = "     하나     둘     셋     ";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		System.out.printf("[%s]\n", txt.replace(" ", "")); // 공백제거

	}

	private static void m13() {

		// length(), indexOf(), substring()

		// 문자열 추출
		// - char charAt(int index) > 1글자 추출
		// - String substring(int begin, int end) > 범위 추출
		// - begin: inclusive.
		// - end: exclusive.
		// - String substring(int begin) > begin에서부터 문자열 끝까지 잘라라.

		String txt = "가나다라마바사아자차카타파하";

		// substring() > charAt() : 쓰임정도

		System.out.println(txt.substring(3, 7));// 라마바사
		System.out.println(txt.substring(3, 4));// "라" 문자열
		System.out.println(txt.charAt(3));// '라' 캐릭터

		// System.out.println(txt.substring(3, 4)); =/=
		// System.out.println(txt.charAt(3));

		// 정형화된 데이터
		String jumin = "951012-2123456";

		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");

		// 몇년생?
		// char + char = 숫자
		// '9'+'5' -> "" + '9' + '5' : 문자열 부터는 그 뒤로 문자열로 바뀌는 편법을 이용
		System.out.println(jumin.charAt(0) + jumin.charAt(1)); // '9' + '5' 근데 결과는 110이 나옴
		System.out.println(jumin.substring(0, 2)); // 2글자 이상 가져올때는 무조건 substring 이용

		// 태어난 월?
		System.out.println(jumin.substring(2, 4) + "월생");

		// 태어난 일?
		System.out.println(jumin.substring(4, 6) + "일생");

		// 요구사항]
		// 파일 전체 경로
		// String path = "D:\\class\\java\\JavaTest\\src\\Ex10.java";
		String path = "C:\\images\\cat.png";

		// 1. lastindexOf()
		// 2. substring()
		// 3. length()

		// 파일명 추출 > "Ex10.java"
		// 확장자 없는 파일명 추출 > "Ex10"
		// 확장자 추출 > ".java"

		// 풀이
		// 1. 파일명 추출
		// 1) 마지막의 역슬래시를 찾음 -> 라스트 인덱스
		int index = path.lastIndexOf("\\");
		// 2)
		String filename = path.substring(index + 1, path.length());
		System.out.println(filename);

		// 2. 확장자 없는 파일명 추출
		index = filename.lastIndexOf(".");
		String filenameWithoutExt = filename.substring(0, index);
		System.out.println(filenameWithoutExt);

		// 3. 확장자 추출
		// String ext = filename.substring(index, filename.length());
		String ext = filename.substring(index); // index ~ 끝까지
		System.out.println(ext);

	}

	private static void m12() {

		// 패턴 검색
		// - boolean startsWitch(String word)
		// - boolean endsWith(String word)

		String txt = "홍길동님 안녕하세요?";

		// txt가 "홍"으로 시작하는 문자열 입니까? > T/F
		System.out.println(txt.startsWith("홍")); // 가독성 1
		System.out.println(txt.charAt(0) == '홍'); // 가독성 2
		System.out.println(txt.indexOf('홍') == 0); // 가독성 2

		System.out.println(txt.startsWith("홍길동"));
		System.out.println(txt.startsWith("김"));

		txt = "홍길동님 안녕하세요?";

		// txt가 ?로 끝납니까?
		System.out.println(txt.endsWith("?"));
		System.out.println(txt.charAt(txt.length() - 1) == '?');
		System.out.println(txt.indexOf("?") == txt.length() - 1);

		// 파일 경로 or 이름 > 조작
		// 이미지 파일인지 검사? jpg(jpeg), gif, png
		String path = "D:\\class\\java\\.jpg\\dog.jpg"; // 1. 폴더명을 .jpg라고 했을경우

		if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".gif") || path.endsWith(".png")) {

			System.out.println("이미지 파일o");
		} else {
			System.out.println("이미지 파일x");
		}

		if (path.indexOf(".jpg") == path.length() - 4) { 
			// 2. 이미지가 아니라고 나옴 왜? .jpg를 찾는데 앞에서 부터 찾아서 그럼
			System.out.println("o");
		} else {
			System.out.println("x");
		}

		// indexOf: 왼쪽 -> 오른쪽
		// lastIndexOf: 오른쪽 -> 왼쪽

		System.out.println(path.lastIndexOf(".jpg"));
		if (path.lastIndexOf(".jpg") == path.length() - 4) {
			System.out.println("O");
		} else {
			System.out.println("x");
		}

		// 확장자 검사
		// 1. endsWith()
		// 2. lastIndexOf()

	}

	private static void m11() {

		// 대소문자 변경
		// - String toUpperCase() > 문자를 모두 대문자로
		// - String toLowerCase() > 문자를 모두 소문자로

		String txt = "Hello Java";

		System.out.println(txt);
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());

		// "Java" > "Java" && "java" && "JAVA" &&... 16종류

		String content = "메모장의 내용입니다. java입니다.";
		String word = "Java";

		// 대소문자 구분(Case sensitive)
		// - 정확도 높음
		// - 검색율 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("검색 o");
		} else {
			System.out.println("검색 x");
		}

		// 대소문자 구분x(Case insensitive)
		// - 정확도 낮음
		// - 검색율 높음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("검색 o");
		} else {
			System.out.println("검색 x");
		}

		// 메소드 체인
		// - 코딩 패턴 중 하나(함수형 프로그래밍 패턴)
		// - 문자열.메소드().메소드()

	}

	private static void m10() {

		// 유효성 검사
		// 게시판 글쓰기 > 금지어!!

		String word = "바보"; // 금지어
		String content = "안녕하세요. 자바를 배우는 바보입니다."; // 글

		if (content.indexOf(word) == -1) {
			// 올바른 경우
			System.out.println("글쓰기 완료");
		} else {
			// 금지어 발견!!
			System.out.println("경고!!!");

		}

		// 주민등록번호 + '-'
		String jumin = "950123-1023543";

		// 프로그래밍 > 정석(X) > 대중적인 방법(O)

		if (jumin.charAt(6) == '-') {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}

		if (jumin.indexOf('-') == 6) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}

	}

	private static void m9() {

		// 문자열 검색
		// - 문자열내에서 원하는 문자(열)을 검색 > 발견한 위치(idex) 반환
		// - 검색 결과가 없으면 -1을 반환

		// - 처음부터 검색해서 처음 일치하는 결과를 반환
		// - int indexOf(char c)
		// - int indexOf(String s)

		// - startIndex부터 검색해서 처음 일치하는 결과를 반환
		// - int indexOf(char c, int startIndex)
		// - int indexOf(String s, int startIndex)

		String txt = "안녕하세요. 홍길동입니다."; // 0~13
		int index = -1;

		index = txt.indexOf('하');
		System.out.println(index); // 2번째 위치에서 발견

		index = txt.indexOf('홍');
		System.out.println(index); // 7

		index = txt.indexOf('.');
		System.out.println(index); // 5

		index = txt.indexOf(' ');
		System.out.println(index); // 6

		index = txt.indexOf('가'); // -1
		System.out.println(index);

		index = txt.indexOf("홍길동"); // 첫번째 문자의 위치를 반환
		System.out.println(index);

		index = txt.indexOf("홍길순"); // -1, 없는애로 취급 일부가 같다고 찾아주는 것이 아님
		System.out.println(index);

		txt = "안녕하세요. 홍길동입니다. 저를 길동이라고 불러주세요. 길동!!";

		// 길동 검색
		index = txt.indexOf("길동");
		System.out.println(index); // 8, 첫번째 길동만 나옴

		index = txt.indexOf("길동", index + "길동".length()); // 두번째 자리에는 상수넣으면 안됨.
		// 수정시 위치 변할 수 있기 때문임 유지보수측면에서 별로임, 두번째 길동이 찾기
		System.out.println(index);

		index = txt.indexOf("길동", index + "길동".length()); // 세번째 길동이 찾기
		System.out.println(index);

	}

	private static void m8() {

		// 공백제거
		// - String trim()
		// - 문자열에 존재하는 공백문자(Whitespace > 스페이스, 탭, 개행)를 제거하는 메소드
		// - 문자열의 시작과 끝에 존재하는 공백문자만 제거한다. 사이의 공백은 제거 안함
		// - 검색어를 대상으로 많이 사용
		// - 불필요하거나 or 사용자 실수로 생긴 > 공백 제거 역할

		String txt = "     하나     둘     셋     ";

		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
	}// m8

	private static void m7() throws IOException {

		// 유효성 검사
		// - 주민 등록 번호 입력 > 반드시 '-' 입력해야한다 가정

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주민등록번호: ");
		String jumin = reader.readLine();

		if (isValidJumin(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");

			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else if (jumin.charAt(7) == '2') {
				System.out.println("여자");
			}

		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
	}

	private static boolean isValidJumin(String jumin) {

		// 650927-2145870;
		if (jumin.charAt(6) != '-') {
			return false;
		}
		return true;
	}

	private static void m6() throws IOException {

		// 회원가입
		// -이름 입력 + 길이(2 ~ 5자) + 구성(한글만)

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력: ");
		String name = reader.readLine();

		if (isValid(name)) {
			System.out.println("업무 진행...");
		} else {
			System.out.println("이름을 올바르게 입력하세요.");
		}

	}

	private static boolean isValid(String name) {

		// *** 유효성 검사 > 잘못된 부분을 검사하는 것이 코딩하기 편하다.
		// 길이 검사
		// 한글 검사

		if (name.length() < 2 || name.length() > 5) {

			return false;
		}

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			if (c < '가' || c > '힣') {

				return false;
			}

		}
		// 여기까지 도달? > 올바른 이름
		return true;
	}// isValid

	private static void m5() throws IOException {

		// 유효성 검사
		// - 아이디 입력 + 영어 소문자

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아이디 입력: ");
		String id = reader.readLine();

		// javatest
		for (int i = 0; i < id.length(); i++) { // = 사용자가 입력한 글자수만큼 루프

			char c = id.charAt(i); // 처음부터 1글자씩 추출
			// System.out.println(c);

			if (c < 'a' || c > 'z') {// 영소문자가 아니냐?
				System.out.println("잘못된 문자가 발견되었습니다.");
				break; // 나머지 글자는 검사가 필요가 없다. 이미 id는 잘못된 것이기 때문
			}

		}

		System.out.println("종료");
	}

	private static void m4() {

		// 문자열 추출
		// - char chatAt(int index)
		// - 원하는 위치의 문자를 추출하는 메소드
		// - 자바: Zero-based Index(즉, 숫자셀때 0 부터 시작한다는 의미)
		// - Returns the char value at thespecified index.
		// - An index ranges from 0 to length() - 1 ** 인덱스의 범위는 0에서부터 시작!!
		String txt = "안녕하세요. 삐옥이입니다.";

		char c = txt.charAt(3); // txt에서 3번째 문자를 가져오세요.
		System.out.println(c); // 세

		c = txt.charAt(7);
		System.out.println(c);// 삐

		c = txt.charAt(13);
		System.out.println(c);// . = 마지막 문자

		System.out.println(txt.length());
		// 문자열의 마지막 문자의 index == length() - 1
		c = txt.charAt(txt.length() - 1); // = 마지막 문자
		System.out.println(c);

		// 에러 메세지 : java.lang.StringIndexOutOfBoundsException: index 15, length 14
		// = length(14) -> 0 ~ 13
		// c = txt.charAt(15);
		// System.out.println(c);

	}

	private static void m3() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) { // 발상의 전환 루프임 잘 이해하기!

			System.out.print("이름 입력: ");
			String name = reader.readLine();

			// if (name.length() >= 2 && name.length()<=5) {
			if (name.length() < 2 || name.length() > 5) {

				System.out.println("이름은 2~5자 이내로 입력하세요.");
			} else {
				break; // while 탈출
			}

		} // while

		System.out.println("올바른 이름을 입력했습니다.");

	}// m3

	private static void m2() throws IOException {

		// 문자열 길이 + 유효성 검사
		// 회원가입 > 아이디 입력 > 4~12자 이내 > 서버 전송 > DB 저장 > 에러

		// 이름 입력 > 2자 ~ 5자 이내

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력: ");
		String name = reader.readLine();

		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름입니다.");
			System.out.println("업무 진행...");
		} else {
			System.out.println("이름은 2~5자 이내로 입력하세요.");
		}

	}

	private static void m1() throws IOException {

		// 문자열 길이
		// - 문자열을 구성하는 문자의 개수(=글자 수)
		// - int length() = 반환값이 int인 메서드

		String txt = "ABCDE";

		// 몇글자?
		System.out.println(txt.length());

		System.out.println("가나다라마".length());

		txt = "English, 한글, 012345, !@#$#@"; 
		// 공백도 1글자로 포함함!, 자바는 길이를 셀때 문자 1개당 하나로 취급함을 알 수있음
		System.out.println(txt.length());

		// 요구사항] 사용자 입력 > 문자수?

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문장 입력: ");
		String statement = reader.readLine();

		System.out.printf("입력한 문장은 총 %d개의 문자로 구성되어있습니다.\n", statement.length());

	}// m1

}// class
